package chap4;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		System.out.println("�ڿ����� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int sum = 0;
		while(input != 0) {
			sum += input%10;
			input /= 10;
		}
		System.out.println("�ڸ��� �� : " + sum);
	}
}
