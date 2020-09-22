package chap4;

import java.util.*;

public class Exam8 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		boolean checkNumber = true;
		for(int i = 0; i < input.length();i++) {
			char checkChar = input.charAt(i);
			if(checkChar >= '0' && checkChar <= '9') {
				continue;
			}else {
				System.out.println("조건에 안맞는 대상 발견" + checkChar);
				checkNumber = false;
			}
		}
		if(checkNumber) {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
	}
}
