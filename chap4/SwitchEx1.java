package chap4;

import java.util.*;

public class SwitchEx1 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade;
		switch(score/10) {
		case 10:
		case 9:
		case 8:
		case 7:
		case 6:
			grade = "PASS";
			break;
		default:
			grade = "FAIL";
			break;
		}
		System.out.println(score + "점 :  " + grade);
	}
}