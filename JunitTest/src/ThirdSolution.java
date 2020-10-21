import java.util.*;

public class ThirdSolution{
	public static int solution(int n) {
		return toDecimalString(reverseOrder(toThirdinayString(n)));
	}
	
	static String toThirdinayString(int n) {
		
		Stack<Integer> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		int curN = n;
		final int THIRDINARY = 3;
		int counter = 1;
		Boolean EndCondition = true;
		while(EndCondition) {
			stack.push(curN%THIRDINARY);
			curN /= THIRDINARY;
			if(curN < THIRDINARY) {
				stack.push(curN);
				EndCondition = !EndCondition;
			}
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			sb.append(stack.pop());
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	static int toDecimalString(String n) {
		Queue<Integer> queue = new LinkedList<>();
		StringBuffer sb = new StringBuffer();
		String str = n;
		long answer = 0;
		final int THIRDINARY = 3;
		int target = Integer.parseInt(str);
		System.out.println("Decimal String convert value : " + target);
		sb.append(Integer.parseInt(str));
		sb.reverse();
		String sbString = sb.toString();
		System.out.println(sbString);
		System.out.println("init answer : " + answer);
		for(int i = 0; i < sbString.length();i++) {
			System.out.println((sbString.charAt(i)-'0') * Math.pow(THIRDINARY, i));
			answer += (sbString.charAt(i)-'0') * Math.pow(THIRDINARY, i);
		}
		System.out.println(answer);
		return (int)answer;
	}
	
	static String reverseOrder(String str) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<str.length(); i++) {
			sb.append(str.charAt(i));
		}		
		return sb.reverse().toString();
	}
}