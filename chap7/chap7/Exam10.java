package chap7;

import java.util.Scanner;

/*
 * ?��?��받�? ?��?���? 좌우??�??��?���? ?��?��?���?
 * ?��?���? ?��?��?��?��?��
 * 121 
 * 좌우??�??��
 * 1212
 * 좌우??�??��?��?��
 */
public class Exam10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("?��?���? ?��?��?��?��?��");
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
			System.out.println("좌우??�?");
		}else {
			System.out.println("좌우??�??��?��?��");
		}
	}
}
