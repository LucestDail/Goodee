package chap7;

import java.util.Scanner;

/*
 * ?ž…? ¥ë°›ì? ?ˆ«?žê°? ì¢Œìš°??ì¹??ˆ˜?¸ì§? ?Œ?‹¨?•˜ê¸?
 * ?ˆ«?žë¥? ?ž…? ¥?•˜?„¸?š”
 * 121 
 * ì¢Œìš°??ì¹??ˆ˜
 * 1212
 * ì¢Œìš°??ì¹??ˆ˜?•„?‹˜
 */
public class Exam10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("?ˆ«?žë¥? ?ž…? ¥?•˜?„¸?š”");
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
			System.out.println("ì¢Œìš°??ì¹?");
		}else {
			System.out.println("ì¢Œìš°??ì¹??ˆ˜?•„?‹˜");
		}
	}
}
