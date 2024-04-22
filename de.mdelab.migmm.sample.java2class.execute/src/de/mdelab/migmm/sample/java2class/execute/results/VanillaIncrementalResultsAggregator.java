package de.mdelab.migmm.sample.java2class.execute.results;

import java.util.List;

public class VanillaIncrementalResultsAggregator extends IncrementalResultsAggregator {

	public static void main(String args[]) {
		if(args.length < 2) {
			System.out.println("2 arguments: path, runs");
			return;
		}
		
		String path = args[0];
		int runs = Integer.parseInt(args[1]);
		
		new VanillaIncrementalResultsAggregator().execute(path, runs);
	}
	
	public void execute(String path, int runs) {
		List<Long> transformationAggregates = getMeanAggregateValues(path, "----------TRANSFORMATION----------", runs, true); 
		List<Long> copyingAggregates = getMeanAggregateValues(path, "----------COPYING----------", runs, false);

		System.out.println("----------TOTAL----------");
		for(int i = 0; i < copyingAggregates.size(); i++) {
			System.out.println((i + 1) + "\t" + (copyingAggregates.get(i) + transformationAggregates.get(i)));
		}
		
		System.out.println("----------COPYING----------");
		for(int i = 0; i < copyingAggregates.size(); i++) {
			System.out.println((i + 1) + "\t" + copyingAggregates.get(i));
		}
		
		System.out.println("----------TRANSFORMATION----------");
		for(int i = 0; i < transformationAggregates.size(); i++) {
			System.out.println((i + 1) + "\t" + transformationAggregates.get(i));
		}
	}
	
}
