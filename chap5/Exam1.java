package chap5;
/*
 * 10���� -> 2���� ����
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		System.out.println("2������ ��ȯ�� 10������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int arr[] = new int[32];
		int count = 0;
		while(input > 0) {
			arr[count] = input%2;
			input /= 2;
			count++;
		}
		for(;count>=0;count--) {
			System.out.print(arr[count]);
		}
	}
}
