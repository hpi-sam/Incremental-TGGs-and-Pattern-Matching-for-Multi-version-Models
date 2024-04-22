package de.mdelab.migmm.sample.java2class.execute.preprocessing;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.timing.TimingPackage;
import de.mdelab.migmm.history.timing.dag.HistoryAdapter;

public class HistoryRecreationRemover {

	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("2+ arguments: inputFile, outputFile, (isXMI)");
			return;
		}
		
		String inputFile = args[0];
		String outputFile = args[1];
		boolean isXMI = args.length > 2 ? Boolean.parseBoolean(args[2]) : false;
		
		initializeEPackages();

		System.out.println("LOADING HISTORY");
		History h = (History) (isXMI ? EMFUtil.loadXmi(inputFile) : EMFUtil.loadMDELabModel(inputFile).getContents().get(0));
		new HistoryAdapter().removeRecreations(h);
		if(isXMI) {
			EMFUtil.writeXMI(h, outputFile);
		}
		else {
			EMFUtil.writeMDELabModel(h, outputFile);
		}
	}

	private static void initializeEPackages() {
		HistoryPackage.eINSTANCE.getName();
		TimingPackage.eINSTANCE.getName();
		Java_adaptedPackage.eINSTANCE.getName();
	}
	
}
