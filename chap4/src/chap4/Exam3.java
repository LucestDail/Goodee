package chap4;

import java.util.*;

public class Exam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요");

		int year = scan.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("윤년");
				} else {
					System.out.println("평년");
				}
			} else {
				System.out.println("윤년");
			}
		} else {
			System.out.println("평년");
		}
	}
}
