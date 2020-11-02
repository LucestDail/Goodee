
public class hashadSolution {
	public static boolean solution(int x) {
		String xToString = Integer.toString(x);
		int StringSum = 0;
		for(int i = 0; i < xToString.length(); i++) {
			StringSum += xToString.charAt(i) - '0';
		}
		if(x%StringSum == 0) {
			return true;
		}else {
			return false;
		}
	}

}
