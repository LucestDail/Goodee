import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BigNumberSolution {
	public static String solution(int[] numbers) {
		String answer = "";
		Set<Long> set = new HashSet<>();
		long maxcount = 1;
		for (int i = 1; i <= numbers.length; i++) {
			maxcount *= i;
		}
		// making all possibility
		long maxValue = -1;
		while (set.size() < maxcount) {
			Set<Integer> randset = new HashSet<>();
			StringBuffer sb = new StringBuffer();
			while (randset.size() < numbers.length) {
				int randomNumber = (int) (Math.random() * numbers.length);
				if(randset.add(randomNumber)) {
					sb.append(numbers[randomNumber]);
				}
			}
			set.add(Long.parseLong(sb.toString()));
			if(Long.parseLong(sb.toString()) >= maxValue) {
				maxValue = Long.parseLong(sb.toString());
			}
		}
		return maxValue +"";
	}
}