import java.util.Stack;

public class Kakao1Solution {
	
	public static String solution(int n, int t, int m, int p) {
		System.out.println("test start");
		StringBuilder sb = new StringBuilder();
		int counter = 0;
		while(sb.toString().length() < t*m) {
			sb.append(convertNcimal(n,counter++));
		}
		System.out.println(sb.toString());
		String convertNcimalString = sb.toString();
		sb = new StringBuilder();
		for(int i = 0; i<convertNcimalString.length(); i++) {
			if(i%m == p-1) {
				sb.append(convertNcimalString.charAt(i));
			}
		}
		System.out.println(sb.toString().substring(0, t));
		return sb.toString().substring(0, t);
	}

	private static String convertNcimal(int n, int i) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		int target = i;
		if(i == 0) {
			return "0";
		}
		while(target > 0) {
			String pushItem = "";
			int checker = target%n;
			if(checker >= 10) {
				char charBuff = (char) (checker + 55);
				pushItem = charBuff +"";
			}else {
				pushItem = Integer.toString(checker);
			}
			target /= n;
			stack.push(pushItem);
		}
		while(!stack.empty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}
	

}
