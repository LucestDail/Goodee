package Exam;

public class Exam8 {

	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5","~!@#$%^&*()"));
	}

	private static String delChar(String target, String delete) {
		StringBuilder sb = new StringBuilder("");

		for(int i = 0; i < target.length(); i++) {
			String compareTarget = Character.toString(target.charAt(i));
			if(!delete.contains(compareTarget))sb.append(compareTarget);
		}
		return sb.toString();
	}

}
