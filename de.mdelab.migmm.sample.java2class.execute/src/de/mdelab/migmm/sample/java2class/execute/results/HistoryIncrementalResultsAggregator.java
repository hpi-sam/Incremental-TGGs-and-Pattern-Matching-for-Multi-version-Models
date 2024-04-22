package de.mdelab.migmm.sample.java2class.execute.results;

import java.util.List;

public class HistoryIncrementalResultsAggregator extends IncrementalResultsAggregator {

	public static void main(String args[]) {
		if(args.length < 2) {
			System.out.println("2 arguments: path, runs");
			return;
		}
		
		String path = args[0];
		int runs = Integer.parseInt(args[1]);
		
		new HistoryIncrementalResultsAggregator().execute(path, runs);
	}
	
	public void execute(String path, int runs) {
		List<Long> transformationAggregates = getMeanAggregateValues(path, "", runs, false); 
		
		for(int i = 0; i < transformationAggregates.size(); i++) {
			System.out.println((i + 1) + "\t" + transformationAggregates.get(i));
		}
	}
	
}
