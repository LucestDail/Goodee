package chap4;

/*
 * If 조건문 예제
 * if(조건식){
 * 조건일 경우에 시행할 명령
 * }
 * 
 * 
 * 
 */

import java.util.*;

public class IfEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		if(score >= 60) {
			System.out.println("합격을 축하합니다.");
			System.out.println("합격증을 받으러 오세요.");
		}else {
			System.out.println("불합격입니다.");
		}
		if(score >= 90) {
			System.out.println("A 학점");
		}else if(score >= 80) {
			System.out.println("B 학점");
		}else if(score >= 70) {
			System.out.println("C 학점");
		}else if(score >= 60) {
			System.out.println("D 학점");
		}else {
			System.out.println("F 학점");
		}
	}

}
