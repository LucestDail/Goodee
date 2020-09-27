package chap7.test;

import java.util.Scanner;

/*
 * 입력받은 숫자가 좌우대칭수인지 판단하기
 * 숫자를 입력하세요
 * 121 
 * 좌우대칭수
 * 1212
 * 좌우대칭수아님
 */
public class Exam10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String inputString = scan.next();
		String compareString = "";
		String targetString = "";
		int indexPointer = inputString.length()/2;
		targetString = inputString.substring(0,indexPointer);
		if(inputString.length()%2 == 0) {
			compareString = inputString.substring(indexPointer);
		}else {
			compareString = inputString.substring(indexPointer+1);
		}
		String compareStringReverse = "";
		for(int i = compareString.length(); i>0;i--) {
			compareStringReverse += compareString.charAt(i-1);
		}
		if(targetString.equals(compareStringReverse)) {
			System.out.println("좌우대칭");
		}else {
			System.out.println("좌우대칭수아님");
		}
	}
}
