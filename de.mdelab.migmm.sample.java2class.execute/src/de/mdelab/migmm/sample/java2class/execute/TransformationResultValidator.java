package de.mdelab.migmm.sample.java2class.execute;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.modisco.java.emf.JavaPackage;

import de.hpi.sam.classDiagram.ClassDiagramPackage;
import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.tggh.mote2history.Mote2historyPackage;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingPackage;
import de.mdelab.migmm.java2class_adapted.Java2class_adaptedPackage;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMReferenceIndex;
import de.mdelab.mltgg.java2class.java2class.Java2classPackage;
import mapping.Mapping;
import mapping.MappingPackage;
import mapping.MappingRoot;

public class TransformationResultValidator {

	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("3 arguments: historyFile, snapshotFile, mappingFile");
			return;
		}
		String historyFile = args[0];
		String snapshotFile = args[1];
		String mappingFile = args[2];
		
		registerEPackages();
		
		History history = (History) EMFUtil.loadMDELabModel(historyFile).getContents().get(0);
		Collection<EObject> snapshot = EMFUtil.loadMDELabModel(snapshotFile).getContents();
		Map<EModelElement, EClass> metaMapping = loadMapping(mappingFile);
		
		String versionID = snapshotFile.substring(snapshotFile.lastIndexOf('_') + 1, snapshotFile.lastIndexOf('.'));
		TimingUnit t = getTimingUnitForID(history, versionID);
		Collection<EObject> projection = project(history, t, invert(metaMapping));

		MLSDMReferenceIndex snapshotIndex = new MLSDMReferenceIndex();
		snapshotIndex.registerEObjects(snapshot);
		
		MLSDMReferenceIndex projectionIndex = new MLSDMReferenceIndex();
		projectionIndex.registerEObjects(projection);
		
		for(Entry<EClass, Set<EObject>> entry:snapshotIndex.getInstanceDomains().entrySet()) {
			System.out.println("snap " + entry.getValue().size() + " " + entry.getKey().getName() + "s");
			System.out.println("proj " + projectionIndex.getDomain(entry.getKey()).size() + " " + entry.getKey().getName() + "s");
		}
	}
	
	private static Map<EClass, EModelElement> invert(Map<EModelElement, EClass> metaMapping) {
		Map<EClass, EModelElement> inverseMapping = new LinkedHashMap<EClass, EModelElement>();
		for(Entry<EModelElement, EClass> e:metaMapping.entrySet()) {
			inverseMapping.put(e.getValue(), e.getKey());
		}
		return inverseMapping;
	}

	private static Collection<EObject> project(History history, TimingUnit t, Map<EClass, EModelElement> metaMapping) {
		Map<NodeWithHistory, EObject> historyMapping = new LinkedHashMap<NodeWithHistory, EObject>();
		Map<EdgeWithHistory, NodeWithHistory> edgeSources = new LinkedHashMap<EdgeWithHistory, NodeWithHistory>();
		Map<AttributeWithHistory, NodeWithHistory> attributeOwners = new LinkedHashMap<AttributeWithHistory, NodeWithHistory>();
		for(ElementWithHistory element:history.getOwnedElements()) {
			if(element instanceof NodeWithHistory && element.getValidIn().contains(t)) {
				EClass originalClass = (EClass) metaMapping.get(element.eClass());
				EObject projectedElement = originalClass.getEPackage().getEFactoryInstance().create(originalClass);
				historyMapping.put((NodeWithHistory) element, projectedElement);
				
				for(EReference ref:element.eClass().getEAllReferences()) {
					if(isAttribute(ref.getEType())) {
						for(EObject attribute:getReferenceTargets(element, ref)) {
							attributeOwners.put((AttributeWithHistory) attribute, (NodeWithHistory) element);
						}
					}
					else if(isEdge(ref.getEType())) {
						for(EObject edge:getReferenceTargets(element, ref)) {
							edgeSources.put((EdgeWithHistory) edge, (NodeWithHistory) element);
						}
					}
				}
			}
		}
		
		for(ElementWithHistory element:history.getOwnedElements()) {
			if(!element.getValidIn().contains(t)) {
				continue;
			}
			
			if(isAttribute(element.eClass())) {
				createAttribute((AttributeWithHistory) element, historyMapping, attributeOwners, metaMapping);
			}
			else if(isEdge(element.eClass())) {
				createEdge((EdgeWithHistory) element, historyMapping, edgeSources, metaMapping);
			}
		}
		return historyMapping.values();
	}

	private static boolean isNode(EClassifier eType) {
		return eType instanceof EClass && ((EClass)eType).getEAllSuperTypes().contains(HistoryPackage.Literals.NODE_WITH_HISTORY);
	}

	private static boolean isEdge(EClassifier eType) {
		return eType instanceof EClass && ((EClass)eType).getEAllSuperTypes().contains(HistoryPackage.Literals.EDGE_WITH_HISTORY);
	}

	private static boolean isAttribute(EClassifier eType) {
		return eType instanceof EClass && ((EClass)eType).getEAllSuperTypes().contains(HistoryPackage.Literals.ATTRIBUTE_WITH_HISTORY);
	}

	@SuppressWarnings("unchecked")
	protected static Collection<EObject> getReferenceTargets(EObject source, EReference ref) {
		if(ref.isMany()) {
			return (Collection<EObject>) source.eGet(ref);
		}
		else {
			return Collections.singleton((EObject) source.eGet(ref));
		}
	}
	
	private static TimingUnit getTimingUnitForID(History history, String versionID) {
		for(Object t:history.getValidIn().getPresentTiming()) {
			if((t instanceof DAGVersion) && ((DAGVersion) t).getId().equals(versionID)) {
				return (DAGVersion) t;
			}
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void createAttribute(AttributeWithHistory element, Map<? extends EObject, ? extends EObject> mapping,
			Map<AttributeWithHistory, NodeWithHistory> attributeOwners, Map<EClass, EModelElement> metaMapping) {
		EObject owner = mapping.get(attributeOwners.get(element));
		EAttribute valueFeature = getValueAttribute(element.eClass());
		Object value = element.eGet(valueFeature);
		
		EAttribute attribute = (EAttribute) metaMapping.get(element.eClass());
		if(attribute.isMany()) {
			((Collection) owner.eGet(attribute)).add(value);
		}
		else {
			owner.eSet(attribute, value);
		}
	}

	private static EAttribute getValueAttribute(EClass eClass) {
		return (EAttribute) eClass.getEStructuralFeature("value");
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void createEdge(EdgeWithHistory edge, Map<? extends EObject, ? extends EObject> mapping,
			Map<EdgeWithHistory, NodeWithHistory> edgeSources, Map<EClass, EModelElement> metaMapping) {
		EObject source = mapping.get(edgeSources.get(edge));
		EObject target = mapping.get(edge.eGet(getTargetReference(edge.eClass())));
		
		EReference reference = (EReference) metaMapping.get(edge.eClass());
		if(reference.isMany()) {
			((Collection) source.eGet(reference)).add(target);
		}
		else {
			source.eSet(reference, target);
		}
	}

	private static EReference getTargetReference(EClass eClass) {
		for(EReference ref:eClass.getEReferences()) {
			if(ref != HistoryPackage.Literals.EDGE_WITH_HISTORY__EDGE_SOURCE &&
					ref != HistoryPackage.Literals.EDGE_WITH_HISTORY__EDGE_TARGET &&
					isNode(ref.getEType())) {
				return ref;
			}
		}
		return null;
	}

	protected static void registerEPackages() {
		JavaPackage.eINSTANCE.getName();
		Java2classPackage.eINSTANCE.getName();
		ClassDiagramPackage.eINSTANCE.getName();
		
		HistoryPackage.eINSTANCE.getName();
		TimingPackage.eINSTANCE.getName();
		Java_adaptedPackage.eINSTANCE.getName();
		Java2class_adaptedPackage.eINSTANCE.getName();
		ClassDiagram_adaptedPackage.eINSTANCE.getName();
		Mote2historyPackage.eINSTANCE.getName();
		
		MappingPackage.eINSTANCE.getName();

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("history", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mlsdm", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mlsp", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mapping", new XMIResourceFactoryImpl());
	}
	
	private static Map<EModelElement, EClass> loadMapping(String mappingPath) {
		Map<EModelElement, EClass> metaMapping = new LinkedHashMap<EModelElement, EClass>();
		MappingRoot mappingRoot = (MappingRoot) EMFUtil.loadXmi(mappingPath);
		
		for(Mapping m:mappingRoot.getMappings()) {
			metaMapping.put((EModelElement) m.getSource(), (EClass) m.getTarget());
		}
		
		return metaMapping;
	}

}
