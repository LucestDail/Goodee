package chap3;
/*
 * ���� ������ : ���� ������
 * ���ǽ� ? trueCondition : falseCondition
 * 
 * 
 */

import java.util.*;

public class OpEx8 {

	public static void main(String[] args) {
		System.out.println("input your number");
		Scanner scan = new Scanner(System.in);
		int yourNumber = scan.nextInt();
		System.out.println((yourNumber>=60) ?
				((yourNumber>=70) ? "complete fine" : "retry") : "not fine");
	}
}
