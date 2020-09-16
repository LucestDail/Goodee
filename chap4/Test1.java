package chap4;

/*
 * 화면에서 한개의 문자를 입력받아
 * 대문자인 경우는 소문자로, 
 * 소문자인 경우는 대문자로 
 * 숫자인 경우는 20을 더한 값을 출력하기
 * 그외의 문자는 기타 문자 를 출력하세요
 */

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inpur your number");
		String InputString = scan.next();

		char InputToChar = InputString.charAt(0);
		int CharToInteger = InputToChar;
		if (CharToInteger >= 48 && CharToInteger <= 57) { // finding numbers
			System.out.println(Integer.parseInt(InputString) + 20);
		} else if (CharToInteger >= 65 && CharToInteger <= 90) { // finding upper character
			System.out.println((char) (CharToInteger + 32));
		} else if (CharToInteger >= 97 && CharToInteger <= 122) {// finding lower character
			System.out.println((char) (CharToInteger - 32));
		} else {
			System.out.println("기타문자");
		}
	}

}
