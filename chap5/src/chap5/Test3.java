package chap5;
import java.util.Scanner;
public class Test3 {
	public static void main(String[] args) {
		System.out.println("길이를 홀수로 입력하세요");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		input = (input/2)+1;
		for(int i = input-1; i>0;i--) {
			for(int j = input-1; j > i;j--) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			for(int j = 0; j < i;j++) {
				System.out.print("*\t*\t");
			}
			System.out.println("");
		}
		for(int i = 0; i<input;i++) {
			for(int j = input; j > i+1;j--) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			for(int j = 0; j < i;j++) {
				System.out.print("*\t*\t");
			}
			System.out.println("");
		}
	}
}