package de.mdelab.migmm.history.adapter;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import mapping.Mapping;

public class MappingTranslator {

	public void fetchElementsFromRegistry(Collection<Mapping> mappings) {
		for(Mapping mapping:mappings) {
			EObject source = mapping.getSource();
			mapping.setSource(fetchElementFromRegistry(source));
			
			EObject target = mapping.getTarget();
			mapping.setTarget(fetchElementFromRegistry(target));
		}
	}

	private EObject fetchElementFromRegistry(EObject o) {
		if(isClassifier(o)) {
			return fetchClassifier((EClassifier) o);
		}
		else if(isFeature(o)) {
			return fetchFeature((EStructuralFeature) o);
		}
		else {
			return o;
		}
	}

	private EClassifier fetchClassifier(EClassifier o) {
		EPackage pkg = EPackage.Registry.INSTANCE.getEPackage(o.getEPackage().getNsURI());
		return pkg.getEClassifier(o.getName());
	}

	private EStructuralFeature fetchFeature(EStructuralFeature o) {
		EClass classifier = o.getEContainingClass();
		EPackage pkg = EPackage.Registry.INSTANCE.getEPackage(classifier.getEPackage().getNsURI());
		return ((EClass) pkg.getEClassifier(classifier.getName())).getEStructuralFeature(o.getName());
	}

	private boolean isClassifier(EObject o) {
		return o.eClass() == EcorePackage.Literals.ECLASSIFIER || o.eClass().getEAllSuperTypes().contains(EcorePackage.Literals.ECLASSIFIER);
	}

	private boolean isFeature(EObject o) {
		return o.eClass() == EcorePackage.Literals.ESTRUCTURAL_FEATURE || o.eClass().getEAllSuperTypes().contains(EcorePackage.Literals.ESTRUCTURAL_FEATURE);
	}

}
