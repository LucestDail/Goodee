package chap7;

import java.util.Scanner;

/*
 * ?? ₯λ°μ? ?«?κ°? μ’μ°??μΉ???Έμ§? ??¨?κΈ?
 * ?«?λ₯? ?? ₯??Έ?
 * 121 
 * μ’μ°??μΉ??
 * 1212
 * μ’μ°??μΉ????
 */
public class Exam10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("?«?λ₯? ?? ₯??Έ?");
		String inputString = scan.next();
		String compareString = "";
		String targetString = "";
		int indexPointer = inputString.length()/2;
		targetString = inputString.substring(0,indexPointer);
		if(inputString.length()%2 == 0) {
			compareString = inputString.substring(indexPointer);
		}else {
			compareString = inputString.substring(indexPointer+1);
		}
		String compareStringReverse = "";
		for(int i = compareString.length(); i>0;i--) {
			compareStringReverse += compareString.charAt(i-1);
		}
		if(targetString.equals(compareStringReverse)) {
			System.out.println("μ’μ°??μΉ?");
		}else {
			System.out.println("μ’μ°??μΉ????");
		}
	}
}
