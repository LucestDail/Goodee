package Exam;

public class Exam6 {

	public static void main(String[] args) {
		String str = "1,234";
		int strToInt = Integer.parseInt(str.replaceAll(",", "")) * 10;
		System.out.printf("%,d",strToInt);
	}
}
