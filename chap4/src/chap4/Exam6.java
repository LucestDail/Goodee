package chap4;

import java.util.*;

public class Exam6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		String str = scan.next();
		int sum = 0;
		for(int i = 0; i < str.length();i++) {
			char targetToChar = str.charAt(i);
			sum += targetToChar- '0';
		}
		System.out.println(str + "의 자리수 합 : " + sum);
	}

}
