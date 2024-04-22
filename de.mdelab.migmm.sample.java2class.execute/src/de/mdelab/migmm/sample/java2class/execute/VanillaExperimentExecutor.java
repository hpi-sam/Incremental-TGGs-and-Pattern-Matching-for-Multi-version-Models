package de.mdelab.migmm.sample.java2class.execute;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.eclipse.modisco.java.emf.JavaPackage;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.execute.StandardTransformationExecutor;
import de.mdelab.migmm.history.execute.TransformationExecutor;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;
import de.mdelab.mltgg.mote2.sdm.MoTE2Sdm;
import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

public class VanillaExperimentExecutor extends ExperimentExecutor {
	
	protected List<MoTE2Sdm> engines;
	
	public VanillaExperimentExecutor() {
		this.engines = new ArrayList<MoTE2Sdm>();
	}
	
	public static void main(String[] args)  {
		if(args.length < 3) {
			System.out.println("3 arguments: inputModel, tggPath, modifiedVersion");
			return;
		}
		String inputModelPath = args[0];
		String tggPath = args[1];
		String modifiedVersion = args[2];

		ExperimentExecutor executor = new VanillaExperimentExecutor();
		executor.execute(inputModelPath, tggPath, modifiedVersion);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected long executeTransformation(TransformationExecutor executor, Object input, SdmOperationalTGG tgg) {
		engines = new ArrayList<MoTE2Sdm>();
		Map<String, List<EObject>> models = (Map<String, List<EObject>>) input;
		long total = 0;
		for(List<EObject> model:models.values()) {
			SdmOperationalTGG tggCopy = EcoreUtil.copy(tgg);
			long time = executor.executeTransformation(model, TransformationDirectionEnum.FORWARD, tggCopy);
			MoTE2Sdm engine = executor.lastEngine;
			total += time;
			engines.add(engine);
		}
		return total;
	}

	@Override
	protected long executeSynchronization(TransformationExecutor executor) {
		long start = System.nanoTime();
		for(MoTE2Sdm engine:engines) {
			executor.executeSynchronization(engine, TransformationDirectionEnum.FORWARD);
		}
		long end = System.nanoTime();
		return end - start;
	}

	@Override
	protected Object loadInput(String inputPath) {
		Map<String, List<EObject>> models = new HashMap<String, List<EObject>>();
		File modelDir = new File(inputPath);
		
		for(String modelFile:modelDir.list()) {
			List<EObject> model = EMFUtil.loadMDELabModel(modelDir + "/" + modelFile).getContents();
			models.put(modelFile.substring(modelFile.lastIndexOf('_') + 1, modelFile.lastIndexOf('.')), model);
		}
		return models;
	}

	@Override
	protected TransformationExecutor createTransformationExecutor() {
		return new StandardTransformationExecutor();
	}

	@Override
	protected Collection<Object> createClassDeclarations(Object input, Object newVersion, int number) {
		Package pkg = (Package) getFirstMatchingElement(((Copier) newVersion).values().iterator(),
				JavaPackage.eINSTANCE.getPackage());
		Collection<Object> classDeclarations = new ArrayList<Object>();
		for(int i = 0; i < number; i++) {
			ClassDeclaration classDeclaration = createClassDeclaration(pkg, "foo" + i);
			classDeclarations.add(classDeclaration);
		}
		return classDeclarations;
	}

	private ClassDeclaration createClassDeclaration(Package pkg, String string) {
		ClassDeclaration classDeclaration = JavaFactory.eINSTANCE.createClassDeclaration();
		classDeclaration.setName(string);
		pkg.getOwnedElements().add(classDeclaration);
		return classDeclaration;
	}

	private EObject getFirstMatchingElement(Iterator<EObject> it, EClass type) {
		while(it.hasNext()) {
			EObject element = it.next();
			if(element.eClass() == type) {
				return element;
			}
		}
		return null;
	}
	
	@Override
	protected void warmup(String inputModelPath, String tggPath) {
		File modelDir = new File(inputModelPath);
		String modelFile = modelDir.list()[0];
		
		SdmOperationalTGG tgg = (SdmOperationalTGG) EMFUtil.loadXmi(tggPath);

		EList<EObject> model = EMFUtil.loadMDELabModel(modelDir + "/" + modelFile).getContents();
		
		final MoTE2Sdm engine = new MoTE2Sdm();
		engine.initRules(tgg);
		EList<EObject> leftElements = new BasicEList<EObject>();
		leftElements.addAll(model);
		EList<EObject> rightElements = new BasicEList<EObject>();
		engine.initModels(leftElements, rightElements);
		
		engine.transform(TransformationDirectionEnum.FORWARD, false, false, false, false, null);
	}

	@Override
	protected Object createDeletionVersion(Object input, Object baseVersion, TransformationExecutor executor, SdmOperationalTGG tgg) {
		Copier model = (Copier) baseVersion;
		for(EObject element:model.values()) {
			if(element.eContainer() == null) {
				Copier deletionVersion = copyEObject(element);
				
				SdmOperationalTGG tggCopy = EcoreUtil.copy(tgg);
				executor.executeTransformation(Collections.singleton(deletionVersion.get(element)), TransformationDirectionEnum.FORWARD, tggCopy);
				MoTE2Sdm engine = executor.lastEngine;
				engines.add(engine);
				
				return deletionVersion;
			}
		}
		return null;
	}

	private Copier copyEObject(EObject baseVersion) {
		Copier copier = new Copier();
		copier.copy((EObject) baseVersion);
		return copier;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Object createCreationVersion(Object input, TransformationExecutor executor, SdmOperationalTGG tgg, String baseVersionId) {
		Map<String, List<EObject>> models = (Map<String, List<EObject>>) input;
		List<EObject> model = models.get(baseVersionId);
		Copier newVersion = copyEObject(model.get(0));
		
		SdmOperationalTGG tggCopy = EcoreUtil.copy(tgg);
		executor.executeTransformation(Collections.singleton(newVersion.get(model.get(0))), TransformationDirectionEnum.FORWARD, tggCopy);
		MoTE2Sdm engine = executor.lastEngine;
		engines.add(engine);
		
		return newVersion;
	}

	private List<EObject> getNonEmptyModel(List<List<EObject>> models) {
		for(List<EObject> model:models) {
			if(!((Model) model.get(0)).getOwnedElements().isEmpty()) {
				return model;
			}
		}
		return null;
	}

	@Override
	protected void deleteClassDeclaration(Object element, Object deletionVersion) {
		Copier model = (Copier) deletionVersion;
		ClassDeclaration classDeclaration = (ClassDeclaration) model.get(element);
		classDeclaration.setPackage(null);
	}
	
	
}
