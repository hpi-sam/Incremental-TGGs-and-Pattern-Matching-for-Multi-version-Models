package de.mdelab.migmm.sample.java2class.execute.results;

public class VanillaBatchResultsAggregator extends BatchResultsAggregator {

	public static void main(String args[]) {
		if(args.length < 2) {
			System.out.println("2 arguments: path, runs");
			return;
		}
		
		String path = args[0];
		int runs = Integer.parseInt(args[1]);
		
		new BatchResultsAggregator().execute(path, runs);
	}
}
