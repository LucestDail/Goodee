package chap3;

import java.util.*;


public class Exam7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("10부터 99사이의 두자리 자연수를 입력하세요");
		int input = scan.nextInt();
		double beforeCeiling = input / 10d;
		int tenCeiling = (int) (Math.ceil(beforeCeiling) * 10);
		int result = tenCeiling - input;
		System.out.println(tenCeiling + " - " + input + " = " + result);
	}
}
