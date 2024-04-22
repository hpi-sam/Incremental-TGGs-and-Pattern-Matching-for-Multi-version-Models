package de.mdelab.migmm.history.util;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.migmm.history.HistoryPackage;

public class HistoryUtil {

	public static boolean isElementWithHistory(EObject object) {
		return object.eClass() == HistoryPackage.Literals.ELEMENT_WITH_HISTORY || object.eClass().getEAllSuperTypes().contains(HistoryPackage.Literals.ELEMENT_WITH_HISTORY);
	}

	public static boolean isEdgeWithHistory(EObject o) {
		return o.eClass().getEAllSuperTypes().contains(HistoryPackage.Literals.EDGE_WITH_HISTORY);
	}

}
