import java.util.*;

/*스스로 생각을 하지못하는 코더.*/

class BracketSolution {
	public static String solution(String p) {
		System.out.println("test start");
		return makeString
				(p);
	}
	static String makeString(String str) {
//		1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다. 
		if (str.length() == 0) {
			return "";
		}

		int index = divide(str);
//		2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다. 
		String u = str.substring(0, index);
		String v = str.substring(index);
		if (isRight(u)) {
//			3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다. 
//			 3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다. 
			return u + makeString(v);
		} else {
//			4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다. 
//			  4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다. 
//			  4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다. 
//			  4-3. ')'를 다시 붙입니다. 
			String temp = "(" + makeString(v) + ")";
//			4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다. 
			StringBuilder sb = new StringBuilder();
			u = u.substring(1, u.length() - 1);
			for (int i = 0; i < u.length(); i++) {
				if (u.charAt(i) == ')') {
					sb.append("(");
				} else {
					sb.append(")");
				}
			}
//			4-5. 생성된 문자열을 반환합니다.
			return temp + sb.toString();
		}
	}

	static int divide(String str) {
		int open = 0;
		int close = 0;
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == '(') {
				open++;
			} else {
				close++;
			}
			if (open == close) {
				return i + 1;
			}
		}
		return str.length();
	}

	static Boolean isRight(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(stack);
			if (!stack.isEmpty() && str.charAt(i) == ')' && stack.peek() == '(') {
				System.out.println(str.charAt(i) + " pop " + stack.peek());
				stack.pop();
				continue;
			} else {
				System.out.println(str.charAt(i) + " is push");
				stack.push(str.charAt(i));
			}
		}
		return stack.isEmpty();
	}
}