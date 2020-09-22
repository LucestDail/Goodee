package chap3;
/*
 * 비트 연산자
 * 
 * 
 * 
 */

public class OpEx6 {

	public static void main(String[] args) {
	
		int test1 = 6 & 3;
		System.out.println(test1);
		
		int test2 = 6 | 3;
		System.out.println(test2);
		
		int test3 = 6 ^ 3;
		System.out.println(test3);
		
		int test4 = ~10;
		System.out.println(test4);
		
		boolean test5 = true & false;
		System.out.println(test5);

		boolean test6 = true | false;
		System.out.println(test6);
		
		boolean test7 = true ^ false;
		System.out.println(test7);
		
		boolean test8 = !true;
		System.out.println(test8);
	}
}