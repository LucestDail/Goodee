package chap3;

import java.util.*;

public class Exam5 {
	public static void main(String[] args) {
		System.out.println(args);
		Scanner scan = new Scanner(System.in);
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		String Stringtarget = scan.next();
		char charTarget = Stringtarget.charAt(0);
		int intTarget = (int)charTarget;
		System.out.println((intTarget > 96 && intTarget < 123) ?
				(char)(intTarget-32) : "�ҹ��� �ƴ�");
	}
}