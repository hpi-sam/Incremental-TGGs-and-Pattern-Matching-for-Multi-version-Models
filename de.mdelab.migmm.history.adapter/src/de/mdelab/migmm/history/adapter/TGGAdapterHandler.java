package de.mdelab.migmm.history.adapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;

import de.mdelab.mltgg.MltggPackage;
import de.mdelab.mltgg.TGG;
import mapping.Mapping;
import mapping.MappingRoot;

public class TGGAdapterHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveShell(event);
		TreeSelection selection = (TreeSelection) HandlerUtil.getVariable(event, ISources.ACTIVE_CURRENT_SELECTION_NAME);
		IResource res = (IResource) selection.getFirstElement();
		
		TGGAdapterDialog dialog = new TGGAdapterDialog(shell, res.getLocationURI());
		
		ResourceSet rs = new ResourceSetImpl();
		
		if (dialog.open() == Window.OK) {
			try {
				TGGAdapter adapter = new TGGAdapter();
				MappingTranslator translator = new MappingTranslator();
				
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mltgg", new XMIResourceFactoryImpl());
				MltggPackage.eINSTANCE.getName();

				TGG tgg = AdapterUtil.loadTGG(URI.createURI(dialog.getInputTGG()), rs);
				Collection<Mapping> mappings = new ArrayList<Mapping>();
				
				MappingRoot sourceMapping = AdapterUtil.loadMappings(URI.createURI(dialog.getSourceMapping()), rs);
				translator.fetchElementsFromRegistry(sourceMapping.getMappings());
				mappings.addAll(sourceMapping.getMappings());
				
				MappingRoot corrMapping = AdapterUtil.loadMappings(URI.createURI(dialog.getCorrespondenceMapping()), rs);
				mappings.addAll(corrMapping.getMappings());
				
				MappingRoot targetMapping = AdapterUtil.loadMappings(URI.createURI(dialog.getTargetMapping()), rs);
				translator.fetchElementsFromRegistry(targetMapping.getMappings());
				mappings.addAll(targetMapping.getMappings());
				
				TGG adaptedTGG = adapter.adaptTGG(tgg, createPackageMapping(mappings), corrMapping.getAxiomClass());
				
				String tggOutput = dialog.getOutputModel();
				saveEObjects(Collections.singleton(adaptedTGG), URI.createURI(tggOutput));
				
				res.getParent().refreshLocal(IResource.DEPTH_ONE, null);
			} catch (IOException | CoreException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

	private Map<EModelElement, EClass> createPackageMapping(Collection<Mapping> mappings) {
		Map<EModelElement, EClass> packageMapping = new HashMap<EModelElement, EClass>();
		for(Mapping mapping:mappings) {
			if(mapping.getTarget().eClass() == EcorePackage.Literals.ECLASS) {
				packageMapping.put((EModelElement) mapping.getSource(), (EClass) mapping.getTarget());
			}
		}
		return packageMapping;
	}

	private void saveEObjects(Collection<? extends EObject> objects, URI uri) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource out = rs.createResource(uri);
		out.getContents().addAll(objects);
		out.save(null);
	}

}
