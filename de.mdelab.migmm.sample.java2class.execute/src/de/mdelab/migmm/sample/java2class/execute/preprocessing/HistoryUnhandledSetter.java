package de.mdelab.migmm.sample.java2class.execute.preprocessing;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.timing.TimingPackage;

public class HistoryUnhandledSetter {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("1+ arguments: inputFile, (isXMI)");
			return;
		}
		
		String inputFile = args[0];
		boolean isXMI = args.length > 1 ? Boolean.parseBoolean(args[1]) : false;
		
		initializeEPackages();

		System.out.println("LOADING HISTORY");
		History h = (History) (isXMI ? EMFUtil.loadXmi(inputFile) : EMFUtil.loadMDELabModel(inputFile).getContents().get(0));
		for(ElementWithHistory element:h.getOwnedElements()) {
			element.setUnhandled(EcoreUtil.copy(element.getValidIn()));
		}
		if(isXMI) {
			EMFUtil.writeXMI(h, inputFile);
		}
		else {
			EMFUtil.writeMDELabModel(h, inputFile);
		}
	}

	private static void initializeEPackages() {
		HistoryPackage.eINSTANCE.getName();
		TimingPackage.eINSTANCE.getName();
		Java_adaptedPackage.eINSTANCE.getName();
	}
	
}
