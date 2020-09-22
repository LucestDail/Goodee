package chap6;

import java.util.*;

public class FactorialEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int input = scan.nextInt();
		System.out.println(input + "! = " + factorial(input));
	}
	private static int factorial(int i) {
		return (i == 1) ? 1 : i*factorial(i-1);
	}

}
