package chap4;

import java.util.*;

public class Exam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");

		int year = scan.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("����");
				} else {
					System.out.println("���");
				}
			} else {
				System.out.println("����");
			}
		} else {
			System.out.println("���");
		}
	}
}
