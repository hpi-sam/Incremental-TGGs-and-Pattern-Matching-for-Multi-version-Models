package de.mdelab.migmm.history.adapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import mapping.Mapping;
import mapping.MappingFactory;
import mapping.MappingRoot;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

public class PackageAdapter {

	private final EClass nodeClass;
	private final EClass edgeClass;
	private final EClass containmentEdgeClass;
	private final EClass attributeClass;
	
	private final EClass tggNodeClass;
	
	public PackageAdapter() throws IOException {
		EPackage historyPackage = AdapterUtil.loadEPackage(URI.createPlatformPluginURI("de.mdelab.migmm.history/model/history.ecore", false));
		this.nodeClass = (EClass) historyPackage.getEClassifier("NodeWithHistory");
		this.edgeClass = (EClass) historyPackage.getEClassifier("EdgeWithHistory");
		this.containmentEdgeClass = (EClass) historyPackage.getEClassifier("ContainmentEdgeWithHistory");
		this.attributeClass = (EClass) historyPackage.getEClassifier("AttributeWithHistory");
		
		EPackage tgghPackage = AdapterUtil.loadEPackage(URI.createPlatformPluginURI("de.mdelab.migmm.history.tggh/model/tggh.ecore", false));
		this.tggNodeClass = (EClass) tgghPackage.getEClassifier("TGGNodeWithHistory");
	}
	
	public MappingRoot adaptPackage(String input, boolean isCorr) {
		try {
			EPackage pkg = AdapterUtil.loadEPackage(URI.createURI(input));
			return adaptPackage(pkg, isCorr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public MappingRoot adaptPackage(EPackage pkg, boolean isCorr) {
		MappingRoot mappingRoot = MappingFactory.eINSTANCE.createMappingRoot();
		
		Collection<Mapping> mappings = new ArrayList<Mapping>();
		
		Copier copy = new Copier();
		copy.copy(pkg);
		copy.copyReferences();
		EPackage adaptedPkg = (EPackage) copy.get(pkg);
		adaptedPkg.setName(pkg.getName() + "_adapted");
		adaptedPkg.setNsPrefix(pkg.getNsPrefix() + "_adapted");
		adaptedPkg.setNsURI(pkg.getNsURI() + "_adapted");
		mappingRoot.setPkg(adaptedPkg);
		
		for(EClassifier classifier:new ArrayList<EClassifier>(pkg.getEClassifiers())) {			
			if(classifier.eClass() == EcorePackage.Literals.ECLASS) {
				EClass adaptedClass = (EClass) copy.get(classifier);
				adaptedClass.setName(adaptedClass.getName() + "_adapted");
				mappings.add(createMapping(classifier, adaptedClass));
				
				if(isTopClass(adaptedClass)) {
					adaptClass(adaptedClass, isCorr);
				}
				
				for(EStructuralFeature feature:new ArrayList<EStructuralFeature>(((EClass) classifier).getEStructuralFeatures())) {
					if(feature.eClass() == EcorePackage.Literals.EREFERENCE) {
						EReference adaptedReference = (EReference) getFeature(adaptedClass, feature.getName());
						EClass referenceClass = createVersionedReference(adaptedReference, adaptedPkg);
						mappings.add(createMapping(feature, referenceClass));
						
						adaptedClass.getEStructuralFeatures().remove(adaptedReference);
					}
					else {
						EAttribute adaptedAttribute = (EAttribute) getFeature(adaptedClass, feature.getName());
						EClass attributeClass = createVersionedAttribute(adaptedAttribute, adaptedPkg, pkg);
						mappings.add(createMapping(feature, attributeClass));
						
						adaptedClass.getEStructuralFeatures().remove(adaptedAttribute);
					}
				}
			}
			else if(classifier.eClass() == EcorePackage.Literals.EENUM) {
				adaptedPkg.getEClassifiers().remove(copy.get(classifier));
			}
		}
		
		mappingRoot.getMappings().addAll(mappings);
		
		if(isCorr) {
			EClass history2history = createCorrAxiom();
			adaptedPkg.getEClassifiers().add(history2history);
			mappingRoot.setAxiomClass(history2history);
		}
		
		return mappingRoot;
	}

	private EStructuralFeature getFeature(EClass eClass, String name) {
		for(EStructuralFeature feature:eClass.getEAllStructuralFeatures()) {
			if(feature.getName().equals(name)) {
				return feature;
			}
		}
		return null;
	}

	private Mapping createMapping(EObject source, EObject target) {
		Mapping mapping = MappingFactory.eINSTANCE.createMapping();
		mapping.setSource(source);
		mapping.setTarget(target);
		return mapping;
	}

	private EClass createVersionedReference(EReference reference, EPackage adaptedPkg) {
		EClass source = reference.getEContainingClass();
		EClass target = reference.getEReferenceType();
		
		EClass superClass = reference.isContainment() ? containmentEdgeClass : edgeClass;
		
		EClass adapted = EcoreFactory.eINSTANCE.createEClass();
		adapted.setAbstract(false);
		adapted.setName(reference.getEContainingClass().getName() + "_" + reference.getName() + "Item");
		adapted.getESuperTypes().add(superClass);

		EReference sourceToAdapted = EcoreFactory.eINSTANCE.createEReference();
		sourceToAdapted.setContainment(false);
		sourceToAdapted.setEType(adapted);
		sourceToAdapted.setLowerBound(0);
		sourceToAdapted.setName(reference.getName());
		sourceToAdapted.setOrdered(reference.isOrdered());
		sourceToAdapted.setUnique(reference.isUnique());
		sourceToAdapted.setUpperBound(-1);
		source.getEStructuralFeatures().add(sourceToAdapted);

		EReference adaptedToTarget = EcoreFactory.eINSTANCE.createEReference();
		adaptedToTarget.setContainment(false);
		adaptedToTarget.setEType(target);
		adaptedToTarget.setLowerBound(1);
		adaptedToTarget.setUpperBound(1);
		adaptedToTarget.setName(reference.getName());
		adapted.getEStructuralFeatures().add(adaptedToTarget);
		
		adaptedPkg.getEClassifiers().add(adapted);
		
		return adapted;
	}

	private EClass createVersionedAttribute(EAttribute attribute, EPackage adaptedPkg, EPackage originalPkg) {
		EClass source = attribute.getEContainingClass();
		EClassifier type = attribute.getEType();
		
		if(type.eClass() == EcorePackage.Literals.EENUM &&
				originalPkg.getEClassifier(type.getName()) != null) {
			type = originalPkg.getEClassifier(type.getName());
		}
		
		EClass adapted = EcoreFactory.eINSTANCE.createEClass();
		adapted.setAbstract(false);
		adapted.setName(attribute.getEContainingClass().getName() + "_" + attribute.getName() + "Value");
		adapted.getESuperTypes().add(attributeClass);

		EReference sourceToAdapted = EcoreFactory.eINSTANCE.createEReference();
		sourceToAdapted.setContainment(false);
		sourceToAdapted.setEType(adapted);
		sourceToAdapted.setLowerBound(0);
		sourceToAdapted.setName(attribute.getName());
		sourceToAdapted.setOrdered(attribute.isOrdered());
		sourceToAdapted.setUnique(attribute.isUnique());
		sourceToAdapted.setUpperBound(-1);
		source.getEStructuralFeatures().add(sourceToAdapted);

		EAttribute adaptedAttribute = EcoreFactory.eINSTANCE.createEAttribute();
		adaptedAttribute.setEType(type);
		adaptedAttribute.setLowerBound(1);
		adaptedAttribute.setUpperBound(1);
		adaptedAttribute.setName("value");
		adapted.getEStructuralFeatures().add(adaptedAttribute);
		
		adaptedPkg.getEClassifiers().add(adapted);
		
		return adapted;
	}

	private boolean isTopClass(EClass classifier) {
		return Collections.disjoint(classifier.getEPackage().getEClassifiers(), classifier.getEAllSuperTypes());
	}

	private void adaptClass(EClass classifier, boolean isCorr) {
		if(isCorr) {
			for(Iterator<EClass> it = classifier.getESuperTypes().iterator(); it.hasNext();) {
				EClass superClass = it.next();
				if(superClass.getName().equals("TGGNode")) {
					it.remove();
				}
			}
			classifier.getESuperTypes().add(tggNodeClass);
		}
		else {
			classifier.getESuperTypes().add(nodeClass);
		}
	}

	private EClass createCorrAxiom() {
		EClass corrAxiom = EcoreFactory.eINSTANCE.createEClass();
		corrAxiom.setName("History2History");
		corrAxiom.getESuperTypes().add(tggNodeClass);
		return corrAxiom;
	}

}
