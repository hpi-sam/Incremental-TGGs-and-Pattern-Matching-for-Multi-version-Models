package de.mdelab.migmm.history.projection;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.util.HistoryUtil;

public class HistoryProjector {

	public void project(TimingUnit t, Collection<EObject> inputElements) {
		for(EObject root:inputElements) {
			projectRoot(t, root);
		}
	}

	private void projectRoot(TimingUnit t, EObject root) {
		if(HistoryUtil.isElementWithHistory(root)) {	//TODO replacement root class in metamodel?
			if(((ElementWithHistory) root).getValidIn().contains(t)) {
				((ElementWithHistory) root).setInProjection(true);
			}
			else {
				((ElementWithHistory) root).setInProjection(false);
			}
		}
		for(EObject child:root.eContents()) {
			projectRoot(t, child);
		}
	}

	public void unproject(Collection<EObject> inputElements) {
		for(EObject root:inputElements) {
			unprojectRoot(root);
		}
	}

	private void unprojectRoot(EObject root) {
		if(HistoryUtil.isElementWithHistory(root)) {
			((ElementWithHistory) root).setInProjection(false);
		}
		for(EObject child:root.eContents()) {
			unprojectRoot(child);
		}
	}

	public void setUnhandled(EObject ... roots) {
		for(EObject root:roots) {
			setUnhandledRoot(root);
		}
	}
	
	public static void setUnhandledRoot(EObject root) {
		if(HistoryUtil.isElementWithHistory(root)) {	//TODO replacement root class in metamodel?
			((ElementWithHistory) root).setUnhandled(EcoreUtil.copy(((ElementWithHistory) root).getValidIn()));
		}
		for(EObject child:root.eContents()) {
			setUnhandledRoot(child);
		}
	}

}
