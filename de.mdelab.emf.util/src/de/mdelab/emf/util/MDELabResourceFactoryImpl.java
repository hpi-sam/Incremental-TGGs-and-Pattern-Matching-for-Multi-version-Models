package de.mdelab.emf.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class MDELabResourceFactoryImpl extends ResourceFactoryImpl {

	public Resource createResource(URI uri) {
		return new MDELabResourceImpl(uri);
	}
	
}
