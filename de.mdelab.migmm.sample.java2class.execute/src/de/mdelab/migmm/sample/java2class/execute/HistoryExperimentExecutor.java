package de.mdelab.migmm.sample.java2class.execute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.execute.HistoryIntegratedExecutor;
import de.mdelab.migmm.history.execute.TransformationExecutor;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_packageItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedFactory;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_nameValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedElementsItem;
import de.mdelab.migmm.history.timing.DAGInterval;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingFactory;
import de.mdelab.migmm.history.timing.impl.DAGIntervalImpl;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;
import de.mdelab.mltgg.mote2.sdm.MoTE2Sdm;
import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

public class HistoryExperimentExecutor extends ExperimentExecutor {

	protected MoTE2Sdm engine;
	
	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("3 arguments: inputModel, tggPath, baseVersionId");
			return;
		}
		String inputModelPath = args[0];
		String tggPath = args[1];
		String baseVersionId = args[2];
		
		ExperimentExecutor executor = new HistoryExperimentExecutor();
		executor.execute(inputModelPath, tggPath, baseVersionId);
	}

	@Override
	protected EObject loadInput(String inputModelPath) {
		return EMFUtil.loadMDELabModel(inputModelPath).getContents().get(0);
	}

	@Override
	protected TransformationExecutor createTransformationExecutor() {
		return new HistoryIntegratedExecutor();
	}

	@Override
	protected long executeTransformation(TransformationExecutor executor, Object input, SdmOperationalTGG tgg) {
		long time = executor.executeTransformation(Collections.singleton((History) input), TransformationDirectionEnum.FORWARD, tgg);
		engine = executor.lastEngine;
		return time;
	}

	@Override
	protected void warmup(String inputModelPath, String tggPath) {
		History inputModel = (History) EMFUtil.loadMDELabModel(inputModelPath).getContents().get(0);
		
		SdmOperationalTGG tgg = loadTGG(tggPath);
		
		HistoryIntegratedExecutor executor = new HistoryIntegratedExecutor();
		executor.executeTransformation(Collections.singleton(inputModel), TransformationDirectionEnum.FORWARD, tgg);
		
		executor.lastEngine.getRightInputElements();
	}

	private static ClassDeclaration_adapted createClassDeclaration(History history, Package_adapted pkg, String name, DAGVersion version) {
		ClassDeclaration_adapted classDeclaration = Java_adaptedFactory.eINSTANCE.createClassDeclaration_adapted();
		classDeclaration.setValidIn(DAGIntervalImpl.create(Collections.singleton(version), Collections.emptySet()));
		
		Package_adapted_ownedElementsItem ownedElementsItem = Java_adaptedFactory.eINSTANCE.createPackage_adapted_ownedElementsItem();
		ownedElementsItem.setValidIn(DAGIntervalImpl.create(Collections.singleton(version), Collections.emptySet()));
		
		AbstractTypeDeclaration_adapted_packageItem packageItem = Java_adaptedFactory.eINSTANCE.createAbstractTypeDeclaration_adapted_packageItem();
		packageItem.setValidIn(DAGIntervalImpl.create(Collections.singleton(version), Collections.emptySet()));
		
		NamedElement_adapted_nameValue nameValue = Java_adaptedFactory.eINSTANCE.createNamedElement_adapted_nameValue();
		nameValue.setValue(name);
		nameValue.setValidIn(DAGIntervalImpl.create(Collections.singleton(version), Collections.emptySet()));
		
		history.getOwnedElements().add(classDeclaration);
		history.getOwnedElements().add(ownedElementsItem);
		history.getOwnedElements().add(packageItem);
		history.getOwnedElements().add(nameValue);
		
		pkg.getOwnedElements().add(ownedElementsItem);
		ownedElementsItem.setOwnedElements(classDeclaration);
		ownedElementsItem.setEdgeSource(pkg);
		ownedElementsItem.setEdgeTarget(classDeclaration);
		
		classDeclaration.getPackage().add(packageItem);
		packageItem.setPackage(pkg);
		packageItem.setEdgeSource(classDeclaration);
		packageItem.setEdgeTarget(pkg);
		
		classDeclaration.getName().add(nameValue);
		
		return classDeclaration;
	}

	private static ElementWithHistory getFirstMatchingElement(History inputModel, EClass type, DAGVersion version) {
		for(ElementWithHistory element:inputModel.getOwnedElements()) {
			if(element.eClass() == type && element.getValidIn().contains(version)) {
				return element;
			}
		}
		return null;
	}

	private static DAGVersion getFirstLeafVersion(History inputModel) {
		for(TimingUnit t:inputModel.getOwnedTimingUnits()) {
			if(t instanceof DAGVersion && ((DAGVersion) t).getSuccessors().isEmpty()) {
				return (DAGVersion) t;
			}
		}
		return null;
	}

	@Override
	protected long executeSynchronization(TransformationExecutor executor) {
		long start = System.nanoTime();
		executor.executeSynchronization(engine, TransformationDirectionEnum.FORWARD);
		long end = System.nanoTime();
		return end - start;
	}

	@Override
	protected Object createDeletionVersion(Object input, Object baseVersion, TransformationExecutor executor, SdmOperationalTGG tgg) {
		return createSuccessorVersion((DAGVersion) baseVersion, (History) input);
	}

	@Override
	protected Object createCreationVersion(Object input, TransformationExecutor executor, SdmOperationalTGG tgg, String baseVersionId) {
		History history = (History) input;
		DAGVersion leafVersion = getBaseVersion(history, baseVersionId);
		DAGVersion newVersion = createSuccessorVersion(leafVersion, history);
		return newVersion;
	}

	private DAGVersion getBaseVersion(History history, String baseVersionId) {
		for(TimingUnit t:history.getOwnedTimingUnits()) {
			if((t instanceof DAGVersion) && ((DAGVersion) t).getId().equals(baseVersionId)) {
				return (DAGVersion) t;
			}
		}
		return null;
	}

	private DAGVersion createSuccessorVersion(DAGVersion baseVersion, History history) {
		DAGVersion newVersion = TimingFactory.eINSTANCE.createDAGVersion();
		newVersion.setId("dummy");
		baseVersion.getSuccessors().add(newVersion);
		history.getOwnedTimingUnits().add(newVersion);
		return newVersion;
	}

	@Override
	protected void deleteClassDeclaration(Object element, Object deletionVersion) {
		ClassDeclaration_adapted classDeclaration = (ClassDeclaration_adapted) element;
		((DAGInterval) classDeclaration.getValidIn()).getDts().add((DAGVersion) deletionVersion);
		
		NamedElement_adapted_nameValue name = classDeclaration.getName().get(0);
		((DAGInterval) name.getValidIn()).getDts().add((DAGVersion) deletionVersion);
		
		AbstractTypeDeclaration_adapted_packageItem pkgItem = classDeclaration.getPackage().get(0);
		((DAGInterval) pkgItem.getValidIn()).getDts().add((DAGVersion) deletionVersion);
		
		Package_adapted pkg = pkgItem.getPackage();
		for(Package_adapted_ownedElementsItem item:pkg.getOwnedElements()) {
			if(item.getEdgeTarget() == classDeclaration) {
				((DAGInterval)item.getValidIn()).getDts().add((DAGVersion) deletionVersion);
			}
		}
	}

	@Override
	protected Collection<Object> createClassDeclarations(Object input, Object newVersion, int number) {
		History history = (History) input;
		Package_adapted pkg = (Package_adapted) getFirstMatchingElement(history, Java_adaptedPackage.eINSTANCE.getPackage_adapted(), (DAGVersion) newVersion);
		
		Collection<Object> createdClassDeclarations = new ArrayList<Object>();
		
		for(int i = 0; i < number; i++) {
			ClassDeclaration_adapted classDeclaration = createClassDeclaration(history, pkg, "foo" + i, (DAGVersion) newVersion);
			createdClassDeclarations.add(classDeclaration);
		}
		
		return createdClassDeclarations;
	}

//	private static long[] countCoverages(Set<TGGNode> tggNodes) {
//		Map<TGGNode, Integer> coveredVersions = new HashMap<TGGNode, Integer>();
//		int maxCoverage = 0;
//		for(TGGNode node:tggNodes) {
//			int coverage = ((TGGNodeWithHistory) node).getValidIn().getPresentTiming().size();
//			maxCoverage = maxCoverage > coverage ? maxCoverage : coverage;
//			coveredVersions.put(node, coverage);
//		}
//		
//		long[] coverages = new long[maxCoverage + 1];
//		for(int i = 0; i < maxCoverage + 1; i++) {
//			coverages[i] = 0;
//		}
//		
//		for(Entry<TGGNode, Integer> e:coveredVersions.entrySet()) {
//			coverages[e.getValue()] = coverages[e.getValue()] + 1;
//		}
//		return coverages;
//	}

}
