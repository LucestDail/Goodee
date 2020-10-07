package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int randomTarget = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 1;
		while(true) {
			System.out.println("1 ���� 100 ���� �� ���ڸ� �Է��ϼ���") ;
			try {
				input = scan.nextInt();
				//���� �б�
				if(input < 1 || input > 100) {
					throw new Exception("1 ���� 10 ������ ���ڸ� �Է��ϼ���");
				}
				
				if(input == randomTarget) {
					System.out.print("�����Դϴ�. �Է� Ƚ�� : " + count);
					break;
				}else if(input < randomTarget) {
					System.out.println("ū ���� �Է��ϼ���");
					count++;
					
				}else if(input > randomTarget) {
					System.out.println("���� ���� �Է��ϼ���");
					count++;
				}
			}catch(InputMismatchException e) {
				String str = scan.next();
				System.out.println(str + "�� ���ڰ� �ƴմϴ�.");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}