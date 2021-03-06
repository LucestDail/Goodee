package Test1;

public class Test4 {
	public static void main(String[] args) {
		String str = "������";
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 2, 2));
	}

	private static String format(String str, int i, int j) {
		String answer = str;
		if(str.length() > i) {
			answer = answer.substring(0,i);
		}
		switch (j) {
		case 0:
			answer = String.format("%" + i + "s", answer);
			break;
		case 1:
			int half = i / str.length();
			answer = String.format("%" + half + "s%s%" + half + "s", " ", answer, " ");
			break;
		case 2:
			answer = String.format("%-" + i + "s", answer);
			break;
		}

		return answer;
	}
}
