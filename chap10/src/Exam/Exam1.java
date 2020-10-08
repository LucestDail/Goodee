package Exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		while(true) {
			System.out.print("1 ���� 10 ���� �� ���ڸ� �Է��ϼ���(���� : 99) : ") ;
			try {
				input = scan.nextInt();
				if(input == 99) {
					System.out.println("���α׷� ����");
					break;
				}
				if(input < 1 || input > 10) {
					throw new Exception("1 ���� 10 ������ ���ڸ� �Է��ϼ���");
				}
				System.out.print(input + ":");
				for(int i = 0; i < input; i++) {
					
					System.out.print("*");
				}
				System.out.println();
			}catch(InputMismatchException e) {
				String str = scan.next();
				System.out.println(str + "�� ���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���.");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}