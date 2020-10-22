import java.util.*;
import java.util.Map.Entry;

class FailureSolution {
	public static int[] solution(int N, int[] stages) {
		final int STAGE_MAX = N + 1;
		int[] answer = {};
		double[] failureRateArray = new double[STAGE_MAX];
		double servivor = stages.length;
		for (int i = 0; i < failureRateArray.length; i++) {
			double count = 0;
			for (int j = 0; j < stages.length; j++) {
				if (stages[j] == (i + 1)) {
					count++;
				}
			}
			failureRateArray[i] = count / servivor;
			servivor -= count;
		}

		double[] resultArray = new double[N];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = failureRateArray[i];
			System.out.println(resultArray[i]);
		}
		return answer;
	}
}