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
			System.out.println("1 부터 100 까지 중 숫자를 입력하세요") ;
			try {
				input = scan.nextInt();
				//조건 분기
				if(input < 1 || input > 100) {
					throw new Exception("1 부터 10 까지의 숫자를 입력하세요");
				}
				
				if(input == randomTarget) {
					System.out.print("정답입니다. 입력 횟수 : " + count);
					break;
				}else if(input < randomTarget) {
					System.out.println("큰 수를 입력하세요");
					count++;
					
				}else if(input > randomTarget) {
					System.out.println("작은 수를 입력하세요");
					count++;
				}
			}catch(InputMismatchException e) {
				String str = scan.next();
				System.out.println(str + "는 숫자가 아닙니다.");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}