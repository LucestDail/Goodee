package chap5;

import java.util.*;

public class Exam9 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int count = input * input;
		for(int i = 0; i<input;i++) {
			for(int j = input; j > i+1;j--) {
				System.out.print("\t");
			}
			System.out.print(count-- + "\t");
			for(int j = 0; j < i;j++) {
				System.out.print(count-- + "\t" + count-- + "\t");
			}
			System.out.println("");
			}
		}
	}
