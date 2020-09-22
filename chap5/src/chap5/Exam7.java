package chap5;

import java.util.*;


public class Exam7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int input = scan.nextInt();
		int count = (int) ((input * input) + input)/2;
		for(int i =0;i<input;i++) {
			for(int k = input-i;k<input;k++) {
				System.out.print("\t");
			}
			for(int j = i; j <input;j++) {
				
				System.out.print(count-- + "\t");
			}
			System.out.println();
		}
	}
}
