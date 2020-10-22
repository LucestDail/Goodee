import java.util.*;

public class ThirdSolution{
	public static int solution(int n) {
		System.out.println("==========TestCase==========");
		System.out.println("argument input : " + n);
		long answer = toDecimalString(reverseOrder(toThirdinayString(n)));
		System.out.println("argument output : " + answer);
		return (int)answer;
	}
	
	static String toThirdinayString(int n) {
		System.out.println("toThirdinaryString input : " + n);
		Stack<Long> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		long curN = n;
		final long THIRDINARY = 3;
		Boolean EndCondition = true;
		while(EndCondition) {
			if(curN < THIRDINARY) {
				stack.push(curN);
				break;
			}
			stack.push(curN%THIRDINARY);
			curN /= THIRDINARY;
			
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println("toThirdinaryString input : " + sb.toString());
		return sb.toString();
	}
	
	static long toDecimalString(String n) {
		System.out.println("toDEcimalString input : " + n);
		Queue<Integer> queue = new LinkedList<>();
		StringBuffer sb = new StringBuffer();
		String str = n;
		long answer = 0;
		final long THIRDINARY = 3;
		sb.append(Long.parseLong(str));
		sb.reverse();
		String sbString = sb.toString();
		for(int i = 0; i < sbString.length();i++) {
			answer += (sbString.charAt(i)-'0') * Math.pow(THIRDINARY, i);
		}
		System.out.println("toDecimalString output : " + answer);
		return answer;
	}
	
	static String reverseOrder(String str) {
		System.out.println("reverseOrder input : " + str);
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<str.length(); i++) {
			sb.append(str.charAt(i));
		}
		String reverseResult = sb.reverse().toString();
		System.out.println("reverseOrder output : " + reverseResult);
		return reverseResult;
	}
}