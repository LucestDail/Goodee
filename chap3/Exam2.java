package chap3;

import java.util.*;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("input your 100 type floor target number in 0 ~ 999 scope");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int target = scan.nextInt();
		
		if(target > 999 || target < 0) {
			System.out.println("i have told about scope, you idiot");
		}else {
			int floor100 = target / 100;
			System.out.println("your 100 type floor output : " + floor100 * 100);
		}
	}

}
