package chap5;

import java.util.*;


public class Exam7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
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
