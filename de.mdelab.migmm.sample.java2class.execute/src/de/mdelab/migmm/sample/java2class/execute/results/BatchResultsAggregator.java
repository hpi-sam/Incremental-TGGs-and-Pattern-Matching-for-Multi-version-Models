package de.mdelab.migmm.sample.java2class.execute.results;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BatchResultsAggregator extends ResultsAggregator {

	protected static String[] PORTIONS = {"0.25", "0.5", "0.75", "1.0"};

	protected int RETE_VERSIONS = 64;
	protected int HENSHIN_VERSIONS = 2615;
	
	public void execute(String path, int runs) {
		StringBuffer sb = new StringBuffer();
		int totalVersions = path.endsWith("rete_modisco") ? RETE_VERSIONS : HENSHIN_VERSIONS;
		
		for(String portion:PORTIONS) {
			String portionPath = path + "_" + portion;
			
			long meanTotal = getMeanPropertyValue("TOTAL TIME", portionPath, runs);
			long meanIndex = getMeanPropertyValue("INDEX TIME", portionPath, runs);
			long meanExecute = getMeanPropertyValue("EXECUTE TIME", portionPath, runs);
			long meanInit = meanTotal - (meanIndex + meanExecute);

			int versions = (int) Math.ceil(totalVersions * Double.parseDouble(portion));
			
			sb.append(versions + "\t" + "init" + "\t" + meanInit + "\n");
			sb.append(versions + "\t" + "index" + "\t" + meanIndex+ "\n");
			sb.append(versions + "\t" + "execute" + "\t" + meanExecute + "\n");
		}
		System.out.println();
		System.out.println(sb);
	}
	
	public long getMeanPropertyValue(String property, String pathStub, int runs) {
		List<Long> values = new ArrayList<Long>();
		for(int i = 1; i <= runs; i++) {
			String[] fileContents = readFile(pathStub + "_" + i + ".txt");
			values.add(getPropertyValue(property, fileContents));
		}
		
		double relativeSDEV = computeRelativeSDEV(values);
		System.out.println(property + " sdev: " + relativeSDEV);
		
		return computeMean(values);
	}

	public long getPropertyValue(String property, String[] fileContents) {
		for(String line:fileContents) {
			if(line.startsWith(property)) {
				return Long.parseLong(line.split(Pattern.quote("="))[1]);
			}
		}
		return -1;
	}
}
