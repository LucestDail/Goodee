package Exam;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABC123";
		System.out.println("main : " + str);
		str = change(str);
		System.out.println("change ���� main : " + str);
	}

	private static String change(String str) {
		// TODO Auto-generated method stub
		str += "456";
		System.out.println("change : " + str);
		return str;
	}

}
