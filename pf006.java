import java.util.List;
import java.util.ArrayList;

class F1 {
	static double totalTime(List<Double> lapTimes) {
		List<Double> lT = new ArrayList<>(lapTimes);
		lT.remove(0);
		double sum = 0;
		for (double x : lT){
			sum += x;
		}
		return sum;
	}

	public static void main(String args[]){
		List<Double> lapTimes = new ArrayList<>();

		lapTimes.add(31.0); //warmup lap (does not count)
		lapTimes.add(20.9);
		lapTimes.add(21.1);
		lapTimes.add(21.3);

		System.out.printf("Total time: %.1f sec\n", totalTime(lapTimes));
	}
}
