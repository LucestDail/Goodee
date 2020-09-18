package chap5;

/*
 * 10진수 입력받아 8진수 출력하기
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		System.out.println("8진수로 변환할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int arr[] = new int[32];
		int count = 0;
		while(input > 0) {
			arr[count] = input%8;
			input /= 8;
			count++;
		}
		for(;count>=0;count--) {
			System.out.print(arr[count]);
		}
	}

}
