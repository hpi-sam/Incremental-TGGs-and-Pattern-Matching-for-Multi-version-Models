package de.mdelab.migmm.sample.java2class.execute.results;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class IncrementalResultsAggregator extends ResultsAggregator {


	public List<Long> getMeanAggregateValues(String pathStub, String startKey, int runs, boolean skipFirst) {
		List<List<Long>> values = new ArrayList<List<Long>>();
		for(int i = 1; i <= runs; i++) {
			String[] fileContents = readFile(pathStub + "_" + i + ".txt");
			values.add(getAggregateValues(fileContents, startKey, skipFirst));
		}
		
		List<Long> totals = new ArrayList<Long>();
		for(List<Long> run:values) {
			totals.add(run.get(run.size() - 1));
		}
		double relativeSDEV = computeRelativeSDEV(totals);
		System.out.println("sdev: " + relativeSDEV);

		List<Long> meanValues = new ArrayList<Long>();
		for(int i = 0; i < values.get(0).size(); i++) {
			long total = 0;
			for(int j = 0; j < values.size(); j++) {
				total += values.get(j).get(i);
			}
			meanValues.add(total / values.size());
		}
		
		return meanValues;
	}

	public List<Long> getAggregateValues(String[] fileContents, String startKey, boolean skipFirst) {
		int i;
		for(i = 0; i < fileContents.length; i++) {
			if(fileContents[i].startsWith(startKey)) {
				i++;
				if(skipFirst) {
					i++;
				}
				break;
			}
		}
		
		List<Long> aggregates = new ArrayList<Long>();
		for(;i < fileContents.length;i++) {
			String line = fileContents[i];
			if(!line.contains("=")) {
				break;
			}
			
			long newValue = Long.parseLong(line.split(Pattern.quote("="))[1]);
			long oldValue = aggregates.size() > 0 ? aggregates.get(aggregates.size() - 1) : 0;
			aggregates.add(oldValue + newValue);
		}
		return aggregates;
	}
}
