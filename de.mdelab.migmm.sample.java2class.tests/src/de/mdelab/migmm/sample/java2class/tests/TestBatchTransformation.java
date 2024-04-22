package de.mdelab.migmm.sample.java2class.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import mapping.Mapping;
import mapping.MappingPackage;
import mapping.MappingRoot;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.junit.Before;
import org.junit.Test;

import de.hpi.sam.classDiagram.ClassDiagramPackage;
import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.mdelab.emf.util.EMFUtil;
import de.mdelab.expressions.interpreter.callaction.CallActionInterpreter;
import de.mdelab.expressions.interpreter.core.variables.Variable;
import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.execute.HistoryIntegratedExecutor;
import de.mdelab.migmm.history.execute.StandardTransformationExecutor;
import de.mdelab.migmm.history.execute.TransformationExecutor;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.tggh.mote2history.Mote2historyPackage;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingPackage;
import de.mdelab.migmm.java2class_adapted.Java2class_adaptedPackage;
import de.mdelab.mlsdm.interpreter.facade.MLSDMExpressionFacade;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMReferenceIndex;
import de.mdelab.mltgg.java2class.java2class.Java2classPackage;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;
import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

public class TestBatchTransformation {

	private static String snapshotDir = "instances/hello_modisco";
	private static String tggPath = new File(System.getProperty("user.dir")).getParent() + "/de.mdelab.mltgg.java2class/model-gen/config.xmi";

	private static String historyRPath = "instances/hello_modisco.history";
	private static String historyNRPath = "instances/hello_modisco_nr.history";
	private static String versionedTGGPath = new File(System.getProperty("user.dir")).getParent() + "/de.mdelab.mltgg.java2class.adapted/model-gen/config.xmi";
	private static String interleavedTGGPath = new File(System.getProperty("user.dir")).getParent() + "/de.mdelab.mltgg.java2class.adapted/model-gen-interleaved/config.xmi";
	
	private static String mappingPath = "mapping/java2class2java2class_adapted_static.mapping";
	
	private SdmOperationalTGG tgg;
	private Map<String, List<EObject>> snapshots;
	
	private SdmOperationalTGG versionedTGG;
	private SdmOperationalTGG interleavedTGG;
	
	private History historyR;
	private History historyNR;
	
	private Map<EClass, EModelElement> metaMapping;
	
	@Before
	public void setup() {
		//disable some assertion from standard MoTE2 that MoTE2History does not satisfy
		CallActionInterpreter.class.getClassLoader().setClassAssertionStatus(CallActionInterpreter.class.getName(), false);
		Variable.class.getClassLoader().setClassAssertionStatus(Variable.class.getName(), false);
		MLSDMExpressionFacade.class.getClassLoader().setClassAssertionStatus(MLSDMExpressionFacade.class.getName(), false);
		
		registerEPackages();
		
		tgg = loadTGG(tggPath);
		EcoreUtil.resolveAll(tgg);
		
		versionedTGG = loadTGG(versionedTGGPath);
		EcoreUtil.resolveAll(versionedTGG);
		
		interleavedTGG = loadTGG(interleavedTGGPath);
		EcoreUtil.resolveAll(interleavedTGG);
		
		historyR = (History) EMFUtil.loadMDELabModel(historyRPath).getContents().get(0);
		historyNR = (History) EMFUtil.loadMDELabModel(historyNRPath).getContents().get(0);
		
		snapshots = new HashMap<String, List<EObject>>();
		for(String snapshotFile:new File(snapshotDir).list()) {
			String versionID = snapshotFile.substring(snapshotFile.lastIndexOf("_") + 1, snapshotFile.lastIndexOf("."));
			snapshots.put(versionID, EMFUtil.loadMDELabModel(snapshotDir + "/" + snapshotFile).getContents());
		}
		
		metaMapping = invert(loadMapping(mappingPath));
	}

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
		
		MappingPackage.eINSTANCE.getName();

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("history", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mlsdm", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mlsp", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mapping", new XMIResourceFactoryImpl());
	}
	
	private Map<EModelElement, EClass> loadMapping(String mappingPath) {
		Map<EModelElement, EClass> metaMapping = new LinkedHashMap<EModelElement, EClass>();
		MappingRoot mappingRoot = (MappingRoot) EMFUtil.loadXmi(mappingPath);
		
		for(Mapping m:mappingRoot.getMappings()) {
			metaMapping.put((EModelElement) m.getSource(), (EClass) m.getTarget());
		}
		
		return metaMapping;
	}

	private Map<EClass, EModelElement> invert(Map<EModelElement, EClass> metaMapping) {
		Map<EClass, EModelElement> inverseMapping = new LinkedHashMap<EClass, EModelElement>();
		for(Entry<EModelElement, EClass> e:metaMapping.entrySet()) {
			inverseMapping.put(e.getValue(), e.getKey());
		}
		return inverseMapping;
	}

	protected SdmOperationalTGG loadTGG(String tggPath) {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(URI.createFileURI(tggPath));
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (SdmOperationalTGG) r.getContents().get(0);
	}

	@Test
	public void testVersionedTGG() {
		testBatchTransformation(versionedTGG, historyR);
	}

	@Test
	public void testInterleavedTGG() {
		testBatchTransformation(interleavedTGG, historyR);
	}

	@Test
	public void testVersionedTGGNR() {
		testBatchTransformation(versionedTGG, historyNR);
	}

	@Test
	public void testInterleavedTGGNR() {
		testBatchTransformation(interleavedTGG, historyNR);
	}
	
	public void testBatchTransformation(SdmOperationalTGG adaptedTGG, History history) {
		TransformationExecutor historyExecutor = new HistoryIntegratedExecutor();
		historyExecutor.executeTransformation(Collections.singleton(history), TransformationDirectionEnum.FORWARD, adaptedTGG);
		
		for(Entry<String, List<EObject>> entry:snapshots.entrySet()) {
			SdmOperationalTGG tggCopy = EcoreUtil.copy(tgg);
			
			TransformationExecutor standardExecutor = new StandardTransformationExecutor();
			standardExecutor.executeTransformation(entry.getValue(), TransformationDirectionEnum.FORWARD, tggCopy);
			
			Collection<EObject> projection = project((History) historyExecutor.lastEngine.getRightInputElements().get(0),
					getVersion(history, entry.getKey()), metaMapping);

			MLSDMReferenceIndex projectionIndex = new MLSDMReferenceIndex();
			projectionIndex.registerEObjects(projection);
			
			MLSDMReferenceIndex standardIndex = new MLSDMReferenceIndex();
			standardIndex.registerEObjects(standardExecutor.lastEngine.getRightInputElements());
			
			for(Entry<EClass, Set<EObject>> indexEntry:standardIndex.getInstanceDomains().entrySet()) {
				assertEquals(indexEntry.getValue().size(), projectionIndex.getDomain(indexEntry.getKey()).size());
			}
		}
	}
	
	private TimingUnit getVersion(History history, String id) {
		TimingUnit version = null;
		for(TimingUnit t:history.getOwnedTimingUnits()) {
			if(t instanceof DAGVersion && ((DAGVersion) t).getId().equals(id)) {
				version = t;
				break;
			}
		}
		return version;
	}
	
	private Collection<EObject> project(History history, TimingUnit t, Map<EClass, EModelElement> metaMapping) {
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
}
