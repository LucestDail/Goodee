package chap3;

/*
 * ��� ��� ���� ���� ���� ���ϱ�
 * 1���� ���ڿ� 10���� ����  �� �ִ�.
 * 
 * 
 * 
 */

import java.util.*;

public class Exam6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ������ �Է��ϼ���");
		double number = scan.nextDouble();
		int needBox = (int) Math.ceil((number/10));
		System.out.println("�ʿ��� ������ ���� : " + needBox);
	}
}
