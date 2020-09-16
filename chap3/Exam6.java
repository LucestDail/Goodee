package chap3;

/*
 * 사과 담기 위한 상자 갯수 구하기
 * 1개의 삿자에 10개를 담을  수 있다.
 * 
 * 
 * 
 */

import java.util.*;

public class Exam6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사과의 갯수를 입력하세요");
		double number = scan.nextDouble();
		int needBox = (int) Math.ceil((number/10));
		System.out.println("필요한 상자의 갯수 : " + needBox);
	}
}
