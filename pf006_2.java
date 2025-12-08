import java.util.List;
import java.util.ArrayList;

class F1_2 {
	static double averageTime(List<Double> lapTimes) {
		double time = F1.totalTime(lapTimes);
		int laps = lapTimes.size() - 1;
		return time/laps;
	}

	public static void main(String args[]){
		List<Double> lapTimes = new ArrayList<>();

		lapTimes.add(31.0); //warmup lap (does not count)
		lapTimes.add(20.9);
		lapTimes.add(21.1);
		lapTimes.add(21.3);

		System.out.printf("Total time: %.1f sec\n", F1.totalTime(lapTimes));
		System.out.printf("Average time: %.1f sec\n", F1_2.averageTime(lapTimes));
	}	
}
