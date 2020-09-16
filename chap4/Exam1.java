package chap4;

import java.util.*;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int input = scan.nextInt();
		if (input > 0) {
			System.out.println("양수");
		} else if (input == 0) {
			System.out.println("영");
		} else
			System.out.println("움수");

	}
}
