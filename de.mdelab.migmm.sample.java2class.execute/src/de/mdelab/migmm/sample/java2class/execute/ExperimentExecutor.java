package de.mdelab.migmm.sample.java2class.execute;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.modisco.java.emf.JavaPackage;

import de.hpi.sam.classDiagram.ClassDiagramPackage;
import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.execute.TransformationExecutor;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.tggh.mote2history.Mote2historyPackage;
import de.mdelab.migmm.history.timing.TimingPackage;
import de.mdelab.migmm.java2class_adapted.Java2class_adaptedPackage;
import de.mdelab.mltgg.java2class.java2class.Java2classPackage;
import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

public abstract class ExperimentExecutor {

	public static int CREATED_CLASSES = 100;
	
	public void execute(String inputPath, String tggPath, String baseVersionId) {
		registerEPackages();
		
		warmup(inputPath, tggPath);
		
		TransformationExecutor executor = createTransformationExecutor();
		
		System.out.println("STARTING LOADING MODEL");
		Object input = loadInput(inputPath);
		System.out.println("FINISHED LOADING MODEL");
		
		System.out.println("STARTING LOADING TGG");
		SdmOperationalTGG tgg = loadTGG(tggPath);
		System.out.println("FINISHED LOADING TGG");
		
		System.out.println("STARTING TRANSFORMATION");
		long transformationTime = executeTransformation(executor, input, tgg);
		System.out.println("FINISHED TRANSFORMATION");
		System.out.println("TRANSFORMATION TIME=" + transformationTime / 1000000);
		
		System.out.println("STARTING CREATING CREATION VERSION");
		long start = System.nanoTime();
		Object creationVersion = createCreationVersion(input, executor, tgg, baseVersionId);
		long end = System.nanoTime();
		System.out.println("FINISHED CREATING CREATION VERSION");
		System.out.println("CREATION VERSION CREATION TIME=" + (end - start) / 1000000);
		
		System.out.println("STARTING CREATING ELEMENTS");
		start = System.nanoTime();
		Collection<Object> createdElements = createNewElements(input, creationVersion);
		end = System.nanoTime();
		System.out.println("FINISHED CREATING ELEMENTS");
		System.out.println("ELEMENT CREATION TIME=" + (end - start) / 1000000);

		System.out.println("STARTING CREATION SYNCHRONIZATION");
		long synchronizationTime = executeSynchronization(executor);
		System.out.println("FINISHED CREATION SYNCHRONIZATION");
		System.out.println("CREATION SYNCHRONIZATION TIME=" + synchronizationTime / 1000000);

		System.out.println("STARTING CREATING DELETION VERSION");
		start = System.nanoTime();
		Object deletionVersion = createDeletionVersion(input, creationVersion, executor, tgg);
		end = System.nanoTime();
		System.out.println("FINISHED CREATING DELETION VERSION");
		System.out.println("DELETION VERSION CREATION TIME=" + (end - start) / 1000000);
		
		System.out.println("STARTING DELETING ELEMENTS");
		start = System.nanoTime();
		deleteElements(createdElements, deletionVersion);
		end = System.nanoTime();
		System.out.println("FINISHED DELETING ELEMENTS");
		System.out.println("ELEMENT DELETION TIME=" + (end - start) / 1000000);

		System.out.println("STARTING DELETION SYNCHRONIZATION");
		synchronizationTime = executeSynchronization(executor);
		System.out.println("FINISHED DELETION SYNCHRONIZATION");
		System.out.println("DELETION SYNCHRONIZATION TIME=" + synchronizationTime / 1000000);

//		System.out.println("STARTING WRITING MODEL");
//		EMFUtil.writeXMI(engine.getRightInputElements(), "instances/" + inputModelPath.substring(inputModelPath.lastIndexOf('/') + 1, inputModelPath.lastIndexOf('.')) + "_transformed.history");
//		System.out.println("FINISHED WRITING MODEL");
	}
	
	protected abstract Object createDeletionVersion(Object input, Object baseVersion, TransformationExecutor executor, SdmOperationalTGG tgg);

	protected abstract Object createCreationVersion(Object input, TransformationExecutor executor, SdmOperationalTGG tgg, String baseVersionId);

	protected void deleteElements(Collection<Object> elements, Object deletionVersion) {
		for(Object element:elements) {
			deleteClassDeclaration(element, deletionVersion);
		}
	}

	protected abstract void deleteClassDeclaration(Object element, Object deletionVersion);

	protected abstract long executeTransformation(TransformationExecutor executor, Object input, SdmOperationalTGG tgg);

	protected abstract long executeSynchronization(TransformationExecutor executor);

	protected abstract Object loadInput(String inputPath);

	protected abstract TransformationExecutor createTransformationExecutor();

	protected Collection<Object> createNewElements(Object input, Object newVersion) {
		return createClassDeclarations(input, newVersion, CREATED_CLASSES);
	}

	protected abstract Collection<Object> createClassDeclarations(Object input, Object newVersion, int number);

	protected abstract void warmup(String inputModelPath, String tggPath);

	protected void registerEPackages() {
		JavaPackage.eINSTANCE.getName();
		Java2classPackage.eINSTANCE.getName();
		ClassDiagramPackage.eINSTANCE.getName();
		
		HistoryPackage.eINSTANCE.getName();
		TimingPackage.eINSTANCE.getName();
		Java_adaptedPackage.eINSTANCE.getName();
		Java2class_adaptedPackage.eINSTANCE.getName();
		ClassDiagram_adaptedPackage.eINSTANCE.getName();
		Mote2historyPackage.eINSTANCE.getName();

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("history", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mlsdm", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mlsp", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}

	protected SdmOperationalTGG loadTGG(String inputModelPath) {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(URI.createFileURI(inputModelPath));
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (SdmOperationalTGG) r.getContents().get(0);
	}
}
