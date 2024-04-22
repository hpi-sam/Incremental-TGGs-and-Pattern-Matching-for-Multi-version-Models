package de.mdelab.emf.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.mdelab.emf.util.delta.EMFDelta;

public class EMFUtil {

	public static void writeMDELabModel(EObject model, String path) {
		writeMDELabModel(Collections.singleton(model), path);
	}

	public static void writeMDELabModel(Collection<EObject> model, String path) {
		writeMDELabModel(model, Collections.emptyList(), path);
	}

	public static void writeMDELabModel(Collection<EObject> model, List<EMFDelta> deltas, String path) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(path.substring(path.lastIndexOf('.') + 1), new MDELabResourceFactoryImpl());
		
		MDELabResourceImpl r = (MDELabResourceImpl) rs.createResource(URI.createFileURI(path));
		r.getContents().addAll(collectRoots(model));
		r.getDeltas().addAll(deltas);
		try {
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Collection<EObject> collectReachableObjects(EObject model) {
		return collectReachableObjects(Collections.singleton(model));
	}
	
	public static Collection<EObject> collectReachableObjects(Collection<EObject> model) {
		Set<EObject> seenObjects = new LinkedHashSet<EObject>();
		seenObjects.addAll(model);
		
		Queue<EObject> queue = new LinkedList<EObject>();
		queue.addAll(model);
		
		while(!queue.isEmpty()) {
			EObject current = queue.poll();
			
			for(EReference reference:current.eClass().getEAllReferences()) {
				Collection<EObject> referencedObjects = getReferenceValues(current, reference);
				for(EObject referencedObject:referencedObjects) {
					if(!seenObjects.contains(referencedObject)) {
						queue.add(referencedObject);
						seenObjects.add(referencedObject);
					}
				}
			}
		}
		
		return seenObjects;
	}
	
	public static List<EObject> collectRoots(Collection<EObject> model) {
		List<EObject> roots = new ArrayList<EObject>();
		for(EObject o:model) {
			if(o.eContainer() == null) {
				roots.add(o);
			}
		}
		return roots;
	}

	@SuppressWarnings("unchecked")
	public static void addReferenceValue(EObject object, EReference reference, EObject value) {
		if(reference.isMany()) {
			((Collection<EObject>) object.eGet(reference)).add(value);
		}
		else {
			object.eSet(reference, value);
		}
	}

	@SuppressWarnings("unchecked")
	public static void removeReferenceValue(EObject object, EReference reference, EObject value) {
		if(reference.isMany()) {
			((Collection<EObject>) object.eGet(reference)).remove(value);
		}
		else {
			if(object.eGet(reference) == value) {
				object.eSet(reference, null);
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static Collection<EObject> getReferenceValues(EObject eObject, EReference reference) {
		Object value = eObject.eGet(reference);
		if(reference.isMany()) {
			return (Collection<EObject>) value;
		}
		else if(value != null) {
			return Collections.singleton((EObject) value);
		}
		else {
			return Collections.emptySet();
		}
	}

	@SuppressWarnings("unchecked")
	public static Collection<Object> getAttributeValues(EObject eObject, EAttribute attribute) {
		Object value = eObject.eGet(attribute);
		if(attribute.isMany()) {
			return (Collection<Object>) value;
		}
		else if(value != null) {
			return Collections.singleton(value);
		}
		else {
			return Collections.emptySet();
		}
	}
	
	public static MDELabResourceImpl loadMDELabModel(String path) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(path.substring(path.lastIndexOf('.') + 1), new MDELabResourceFactoryImpl());
		
		MDELabResourceImpl r = (MDELabResourceImpl) rs.createResource(URI.createFileURI(path));
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return r;
	}

	public static void writeXMI(EObject o, String path) {		
		writeXMI(Collections.singleton(o), path);
	}

	public static void writeXMI(Collection<EObject> objects, String path) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(path.substring(path.lastIndexOf('.') + 1), new XMIResourceFactoryImpl());
		
		Resource r = rs.createResource(URI.createFileURI(path));
		r.getContents().addAll(collectRoots(objects));
		try {
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static EObject loadXmi(String modelFile) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(modelFile.substring(modelFile.lastIndexOf('.') + 1), new XMIResourceFactoryImpl());
		
		Resource r = rs.createResource(URI.createFileURI(modelFile));
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return r.getContents().get(0);
	}

}
