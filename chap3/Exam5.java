package chap3;

import java.util.*;

public class Exam5 {
	public static void main(String[] args) {
		System.out.println(args);
		Scanner scan = new Scanner(System.in);
		System.out.println("한개의 문자를 입력하세요");
		String Stringtarget = scan.next();
		char charTarget = Stringtarget.charAt(0);
		int intTarget = (int)charTarget;
		System.out.println((intTarget > 96 && intTarget < 123) ?
				(char)(intTarget-32) : "소문자 아님");
	}
}