package chap4;

import java.util.*;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int input = scan.nextInt();
		if (input > 0) {
			System.out.println("���");
		} else if (input == 0) {
			System.out.println("��");
		} else
			System.out.println("���");

	}
}
