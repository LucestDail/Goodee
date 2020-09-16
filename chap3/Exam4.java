package chap3;

/*
 * 숫자를 입력 받아, 양수인 경우 양수, 음수일 경우 음수, 0일 경우 0
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
