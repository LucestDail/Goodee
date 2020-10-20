import java.util.*;

/*������ ������ �������ϴ� �ڴ�.*/

class BracketSolution {
	public static String solution(String p) {
		System.out.println("test start");
		return makeString
				(p);
	}
	static String makeString(String str) {
//		1. �Է��� �� ���ڿ��� ���, �� ���ڿ��� ��ȯ�մϴ�. 
		if (str.length() == 0) {
			return "";
		}

		int index = divide(str);
//		2. ���ڿ� w�� �� "�������� ��ȣ ���ڿ�" u, v�� �и��մϴ�. ��, u�� "�������� ��ȣ ���ڿ�"�� �� �̻� �и��� �� ����� �ϸ�, v�� �� ���ڿ��� �� �� �ֽ��ϴ�. 
		String u = str.substring(0, index);
		String v = str.substring(index);
		if (isRight(u)) {
//			3. ���ڿ� u�� "�ùٸ� ��ȣ ���ڿ�" �̶�� ���ڿ� v�� ���� 1�ܰ���� �ٽ� �����մϴ�. 
//			 3-1. ������ ��� ���ڿ��� u�� �̾� ���� �� ��ȯ�մϴ�. 
			return u + makeString(v);
		} else {
//			4. ���ڿ� u�� "�ùٸ� ��ȣ ���ڿ�"�� �ƴ϶�� �Ʒ� ������ �����մϴ�. 
//			  4-1. �� ���ڿ��� ù ��° ���ڷ� '('�� ���Դϴ�. 
//			  4-2. ���ڿ� v�� ���� 1�ܰ���� ��������� ������ ��� ���ڿ��� �̾� ���Դϴ�. 
//			  4-3. ')'�� �ٽ� ���Դϴ�. 
			String temp = "(" + makeString(v) + ")";
//			4-4. u�� ù ��°�� ������ ���ڸ� �����ϰ�, ������ ���ڿ��� ��ȣ ������ ����� �ڿ� ���Դϴ�. 
			StringBuilder sb = new StringBuilder();
			u = u.substring(1, u.length() - 1);
			for (int i = 0; i < u.length(); i++) {
				if (u.charAt(i) == ')') {
					sb.append("(");
				} else {
					sb.append(")");
				}
			}
//			4-5. ������ ���ڿ��� ��ȯ�մϴ�.
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