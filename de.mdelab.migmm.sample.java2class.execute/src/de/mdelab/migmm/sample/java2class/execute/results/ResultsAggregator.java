package de.mdelab.migmm.sample.java2class.execute.results;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class ResultsAggregator {

	protected static String[] PORTIONS = {"0.25", "0.5", "0.75", "1"};
	
	protected double computeRelativeSDEV(List<Long> values) {
		long mean = computeMean(values);
		
		long totalSquaredDev = 0;
		for(long value:values) {
			long dev = mean - value;
			totalSquaredDev += (dev) * (dev);
		}
		long meanSquareDev = totalSquaredDev/values.size();
		
		return Math.sqrt(meanSquareDev) / (double)mean;
	}

	protected long computeMean(List<Long> values) {
		long total = 0;
		for(long value:values) {
			total += value;
		}
		return total/values.size();
	}

	public String[] readFile(String path) {
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			List<String> lines = new ArrayList<String>();
			String line;
			while((line = br.readLine()) != null) {
				lines.add(line);
			}

			br.close();
			fr.close();
			
			String[] linesArray = new String[lines.size()];
			for(int i = 0; i < lines.size(); i++) {
				linesArray[i] = lines.get(i);
			}
			
			return linesArray;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
