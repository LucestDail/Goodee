package chap4;

import java.util.*;

public class Exam6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		String str = scan.next();
		int sum = 0;
		for(int i = 0; i < str.length();i++) {
			char targetToChar = str.charAt(i);
			sum += targetToChar- '0';
		}
		System.out.println(str + "�� �ڸ��� �� : " + sum);
	}

}
