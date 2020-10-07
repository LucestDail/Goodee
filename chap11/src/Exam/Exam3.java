package Exam;

public class Exam3 {

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "12"));
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "6"));

	}

	private static int count(String given, String find) {
		int count = 0;
		int index = 0;
		while (true) {
			index = given.indexOf(find,index);
			if(index<0)
				break;
			count++;
			index++;
		}
		return count;
	}
}
