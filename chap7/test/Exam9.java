package chap7.test;

/* 
[결과]
0부터 31까지의 숫자 중 한개를 생각하세요
16 17 18 19 20 
21 22 23 24 25 
26 27 28 29 30 
31 
번호가 있으면 y 아니면 n 입력
y
8 9 10 11 12 
13 14 15 24 25 
26 27 28 29 30 
31 
번호가 있으면 y 아니면 n 입력
y
4 5 6 7 12 
13 14 15 20 21 
22 23 28 29 30 
31 
번호가 있으면 y 아니면 n 입력
n
2 3 6 7 10 
11 14 15 18 19 
22 23 26 27 30 
31 
번호가 있으면 y 아니면 n 입력
n
1 3 5 7 9 
11 13 15 17 19 
21 23 25 27 29 
31 
번호가 있으면 y 아니면 n 입력
y
당신의 번호:25
 
*/
import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		
		final int MAX = 32;
		System.out.println("0부터 31까지의 숫자 중 한개를 생각하세요");
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < MAX;i *= 2) {
			
		}

//		int a = 32;
//		int res = 0, tab = 0;
//		boolean x = true;
//
//		System.out.println("0부터 31까지의 숫자 중 한개를 생각하세요");
//		Scanner scan = new Scanner(System.in);
//
//		for (int i = 2; i <= a; i *= 2) {
//			tab = 0; // 5개의 숫자가 출력되면 줄을 바꿀때 사용할 변수 tab
//			for (int j = 1; j < i; j += 2) { // 2^n승으로 나눌수
//				for (int z = a / i * j; z < (a / i) * (j + 1); z++) // 1~31를 두조각으로 나누었을때 오른쪽값 나눌수록 중첩되어 4조각 8조각 16조각이 됨
//				{
//					System.out.printf("%4d", z);
//					tab++;
//					if (tab % 5 == 0)
//						System.out.println();
//				}
//			}
//			System.out.println("\n번호가 있으면 y 아니면 n 입력");
//			if (scan.next().charAt(0) == 'y') // y는 조각으로 나누었을때 오른쪽에 있는 수 일경우
//				res += (a / i);
//		}
//		System.out.println("당신의 번호:" + res);
	}

}