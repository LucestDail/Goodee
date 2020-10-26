import java.util.*;

class FailureSolution {
	public static int[] solution(int N, int[] stages) {
		final int STAGE_MAX = N + 1;
		int[] answer = new int[N];
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
		int[] indexArray = new int[N];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = failureRateArray[i];
			System.out.println(resultArray[i]);
			indexArray[i] = i + 1;
		}
		for (int i = 0; i < N; i++) {
			System.out.print(indexArray[i] + " ");
			System.out.print(resultArray[i] + " ");
			System.out.println();
		}
		double d_buf;
		int i_buf;
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = 0; j < resultArray.length - i - 1; j++) {
				if (i == j) {
					continue;
				}
				if (resultArray[j] >= resultArray[j + 1]) {
					d_buf = resultArray[j + 1];
					i_buf = indexArray[j + 1];
					resultArray[j + 1] = resultArray[j];
					indexArray[j + 1] = indexArray[j];
					resultArray[j] = d_buf;
					indexArray[j] = i_buf;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(indexArray[i] + " ");
			System.out.print(resultArray[i] + " ");
			System.out.println();
		}

		for (int i = N; i > 0; i--) {
			answer[N-i] = indexArray[i-1];
		}

		return answer;
	}
}