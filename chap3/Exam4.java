package chap3;

/*
 * ���ڸ� �Է� �޾�, ����� ��� ���, ������ ��� ����, 0�� ��� 0
 * 
 * 
 */
import java.util.*;

public class Exam4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input your number");
		int target = scan.nextInt();
		System.out.println((target >= 0)?
				((target > 0) ? "Positive Number": "Zero") : "Negative Number");
	}
}
