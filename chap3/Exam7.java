package chap3;

import java.util.*;


public class Exam7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("10���� 99������ ���ڸ� �ڿ����� �Է��ϼ���");
		int input = scan.nextInt();
		double beforeCeiling = input / 10d;
		int tenCeiling = (int) (Math.ceil(beforeCeiling) * 10);
		int result = tenCeiling - input;
		System.out.println(tenCeiling + " - " + input + " = " + result);
	}
}
