package chap5;

import java.util.Scanner;

/*
 * ���� ���� ����� �ʿ�� ����
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println("��ȯ�� 10������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		long input = scan.nextLong();
		System.out.println("Hex : " + Hex(input));
		System.out.println("Octal : " +Octal(input));
		System.out.println("Binary : " +Binary(input));
	}
	static String Hex(long target) {
		String result = Long.toHexString(target).toUpperCase();
		return result;
	}
	static String Binary(long target) {
		String result = Long.toBinaryString(target);
		return result;
	}
	static String Octal(long target) {
		String result = Long.toOctalString(target);
		return result;
	}
}