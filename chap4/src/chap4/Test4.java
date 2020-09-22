package chap4;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		if (score >= 95) {
			System.out.println("A+");
		} else if (score <= 94 && score >= 90) {
			System.out.println("A0");
		} else if (score <= 89 && score >= 85) {
			System.out.println("B+");
		} else if (score <= 84 && score >= 80) {
			System.out.println("B0");
		} else if (score <= 79 && score >= 75) {
			System.out.println("C+");
		} else if (score <= 74 && score >= 70) {
			System.out.println("C0");
		} else if (score <= 69 && score >= 65) {
			System.out.println("D+");
		} else if (score <= 64 && score >= 60) {
			System.out.println("D0");
		} else {
			System.out.println("F");
		}

	}
}
