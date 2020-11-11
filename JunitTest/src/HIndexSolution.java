import java.util.Arrays;

public class HIndexSolution {

	public static int solution(int[] citations) {
		System.out.println("test start");
		// TODO Auto-generated method stub

		int h = 0;
		Arrays.sort(citations);
		if(citations[0] == 0) {
			return 0;
		}
		for (int i = 0; i < citations.length; i++) {
			h = citations.length - i;
			if (citations[i] >= h) {
				return h;
			}
		}
		return h;
	}

}
