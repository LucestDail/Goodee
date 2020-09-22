package chap4;

import java.util.*;

public class Exam2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한 개의 문자를 입력하세요");
		String input = scan.next();
		char target = input.charAt(0);
		int targetInteger = target;
		if (targetInteger >= 48 && targetInteger <= 57) {
			System.out.println("슛자");
		} else if (targetInteger >= 65 && targetInteger <= 90) {
			System.out.println("대문자");
		} else if (targetInteger >= 97 && targetInteger <= 122) {
			System.out.println("소문자");
		} else {
			System.out.println("기타문자");
		}
	}
}
