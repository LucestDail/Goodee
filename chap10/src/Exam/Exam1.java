package Exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		while(true) {
			System.out.print("1 부터 10 까지 중 숫자를 입력하세요(종료 : 99) : ") ;
			try {
				input = scan.nextInt();
				if(input == 99) {
					System.out.println("프로그램 종료");
					break;
				}
				if(input < 1 || input > 10) {
					throw new Exception("1 부터 10 까지의 숫자를 입력하세요");
				}
				System.out.print(input + ":");
				for(int i = 0; i < input; i++) {
					
					System.out.print("*");
				}
				System.out.println();
			}catch(InputMismatchException e) {
				String str = scan.next();
				System.out.println(str + "는 숫자가 아닙니다. 숫자만 입력하세요.");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
