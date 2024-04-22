package de.mdelab.migmm.history.adapter;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.mltgg.TGG;
import mapping.MappingRoot;

public class AdapterUtil {

	public static EPackage loadEPackage(URI uri) throws IOException {
		return (EPackage) loadEObject(uri, new ResourceSetImpl());
	}

	public static TGG loadTGG(URI uri) throws IOException {
		return loadTGG(uri, new ResourceSetImpl());
	}

	public static MappingRoot loadMappings(URI uri) throws IOException {
		return loadMappings(uri, new ResourceSetImpl());
	}
	
	public static MappingRoot loadMappings(URI uri, ResourceSet rs) throws IOException {
		return (MappingRoot) loadEObject(uri, rs);
	}

	public static TGG loadTGG(URI uri, ResourceSet rs) throws IOException {
		return (TGG) loadEObject(uri, rs);
	}
	
	public static EObject loadEObject(URI uri, ResourceSet rs) throws IOException {
		Resource r = rs.createResource(uri);
		r.load(null);
		EcoreUtil.resolveAll(r);
		EObject o = r.getContents().get(0);
		return o;
	}
	
}
