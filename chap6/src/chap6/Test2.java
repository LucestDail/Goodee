package chap6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2 이상의 숫자를 입력하세요");
		int input = scan.nextInt();
		boolean check = true;
		for(int i = 2;i<input;i++) {
			if(input%i == 0)
				check = false;
		}
		System.out.println(check ? "소수입니다." : "소수가 아닙니다.");
	}

}
