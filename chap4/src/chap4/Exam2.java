package chap4;

import java.util.*;

public class Exam2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� ���ڸ� �Է��ϼ���");
		String input = scan.next();
		char target = input.charAt(0);
		int targetInteger = target;
		if (targetInteger >= 48 && targetInteger <= 57) {
			System.out.println("����");
		} else if (targetInteger >= 65 && targetInteger <= 90) {
			System.out.println("�빮��");
		} else if (targetInteger >= 97 && targetInteger <= 122) {
			System.out.println("�ҹ���");
		} else {
			System.out.println("��Ÿ����");
		}
	}
}
