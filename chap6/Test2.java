package chap6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2 �̻��� ���ڸ� �Է��ϼ���");
		int input = scan.nextInt();
		boolean check = true;
		for(int i = 2;i<input;i++) {
			if(input%i == 0)
				check = false;
		}
		System.out.println(check ? "�Ҽ��Դϴ�." : "�Ҽ��� �ƴմϴ�.");
	}

}
