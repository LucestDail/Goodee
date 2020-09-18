package chap5;

import java.util.Scanner;

/*
 * 굳이 손이 고생할 필요는 없지
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println("변환할 10진수를 입력하세요");
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