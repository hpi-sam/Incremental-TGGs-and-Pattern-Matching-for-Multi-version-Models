package de.mdelab.migmm.sample.java2class.execute.results;

public class MemoryResultsAggregator extends BatchResultsAggregator {
	
	public static void main(String args[]) {
		if(args.length < 2) {
			System.out.println("2 arguments: path, runs");
			return;
		}
		
		String path = args[0];
		int runs = Integer.parseInt(args[1]);
		
		new MemoryResultsAggregator().execute(path, runs);
	}
	
	@Override
	public void execute(String path, int runs) {
		int totalVersions = path.endsWith("rete_modisco") ? RETE_VERSIONS : HENSHIN_VERSIONS;
		
		StringBuffer sb = new StringBuffer();
		for(String portion:PORTIONS) {
			
			String portionPath = path + "_" + portion;

			int versions = (int) Math.ceil(totalVersions * Double.parseDouble(portion));
			
			long meanMemory = getMeanPropertyValue("MEMORY CONSUMPTION", portionPath, runs);
			sb.append(versions + "\t" + "memory" + "\t" + meanMemory + "\n");
		}
		
		System.out.println();
		System.out.println(sb);
	}
	
}
