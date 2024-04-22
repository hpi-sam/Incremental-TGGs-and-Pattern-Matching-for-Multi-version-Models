package de.mdelab.migmm.history.adapter;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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

import mapping.MappingRoot;

public class PackageAdapterHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveShell(event);
		TreeSelection selection = (TreeSelection) HandlerUtil.getVariable(event, ISources.ACTIVE_CURRENT_SELECTION_NAME);
		IResource res = (IResource) selection.getFirstElement();
		
		PackageAdapterDialog dialog = new PackageAdapterDialog(shell, res.getLocationURI());
		
		if (dialog.open() == Window.OK) {
			try {
				PackageAdapter adapter = new PackageAdapter();
				
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
				EcorePackage.eINSTANCE.getName();

				EPackage pkg = AdapterUtil.loadEPackage(URI.createURI(dialog.getInputModel()));
					
				MappingRoot mappings = adapter.adaptPackage(pkg, dialog.getIsCorr());
				EPackage adapted = mappings.getPkg();
				
				String packageOutput = dialog.getOutputModel();
				String dir = packageOutput.substring(0, packageOutput.lastIndexOf("/") + 1);
				String mappingOutput = dir + pkg.getName() + "2" + adapted.getName() + ".mapping";
				saveEObjects(Collections.singleton(adapted), URI.createURI(packageOutput));
				saveEObjects(Collections.singleton(mappings), URI.createURI(mappingOutput));
				
				res.getParent().refreshLocal(IResource.DEPTH_ONE, null);
			} catch (IOException | CoreException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

	private void saveEObjects(Collection<? extends EObject> objects, URI uri) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource out = rs.createResource(uri);
		out.getContents().addAll(objects);
		out.save(null);
	}

}
