import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class BracketSolution {
	public static String solution(String p) {
		System.out.println("==========test Start==========");
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<String>();
		int inCheck = 0;
		int outCheck = 0;
		int index = 0;
		// balance ºÐÇÒ
		System.out.println("----------balancing test----------");
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '(') {
				inCheck++;
			} else {
				outCheck++;
			}
			if (i > 0) {
				if (inCheck == outCheck) {
					list.add(p.substring(index, i + 1));
					index = i + 1;
				}
			}
		}

		// correct check
		System.out.println(list);
		System.out.println("----------correcting test----------");
		for (int i = 0; i < list.size(); i++) {
			boolean checkBracket = false;
			Stack<Character> stack = new Stack<Character>();
			for (int j = 0; j < list.get(i).length(); j++) {
				if(list.get(i).charAt(j) == '(') {
					stack.push(list.get(i).charAt(j));
				}else {
					if(stack.isEmpty()) {
						stack.push(list.get(i).charAt(j));
					}else if(stack.peek() == '(') {
						stack.pop();
					}
				}
			}
			if(stack.isEmpty()) {
				System.out.println(list.get(i) + " correct bracket");
				checkBracket = !checkBracket;
				sb.append(list.get(i));
			}else {
				//incorrecting notice, make it correct
				System.out.println(list.get(i) + " incorrect bracket");
//				Stack<Character> corStack = new Stack<Character>();
//				char[] corArray = new char[list.get(i).length()];
//				for(int k = 0; k < list.get(i).length();k++) {
//					char target = list.get(i).charAt(k);
//
//				}
				

			}
		}
		String answer = sb.toString();
		System.out.println("==========test Ended==========");
		return answer;
	}
}