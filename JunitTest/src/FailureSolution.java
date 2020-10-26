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

		Map<Integer, Double> map = new LinkedHashMap<>();
		double[] resultArray = new double[N];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = failureRateArray[i];
			System.out.println(resultArray[i]);
			map.put(i + 1, failureRateArray[i]);
		}
		System.out.println("Before sorting : " + map);
		sortByValue(map);
		System.out.println("After sorting : " + map);
		double compareIndex = resultArray[0];
		double buf;
		for(int i = 0; i < resultArray.length; i++) {
			for(int j = 0; j < resultArray.length-i-1;j++) {
				if(resultArray[i] <= resultArray[i+1]) {
					buf = resultArray[i];
					resultArray[i] = resultArray[i+1];
					resultArray[i+1] = buf;
				}
			}
		}
		for(double item : resultArray) {
			System.out.print(item + " ");
		}
		
		
		
		
		
		return answer;
	}

	private static <K, V> Map<K, V> sortByValue(Map<K, V> map) {
		List<Entry<K, V>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Object>() {
			@SuppressWarnings("unchecked")
			public int compare(Object o1, Object o2) {
				return ((Comparable<V>) ((Map.Entry<K, V>) (o1)).getValue())
						.compareTo(((Map.Entry<K, V>) (o2)).getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<>();
		for (Iterator<Entry<K, V>> it = list.iterator(); it.hasNext();) {
			Map.Entry<K, V> entry = (Map.Entry<K, V>) it.next();
			result.put(entry.getKey(), entry.getValue());
		}

		return result;
	}
}