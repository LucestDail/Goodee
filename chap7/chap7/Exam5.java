package chap7;

/*
주어�? 배열?�� ?��계방?��?���? 90?�� ?��?��?��켜서  출력?��?�� ?��로그?��?�� ?��?��?��?��?��.
주어�? 배열?�� �?
  **  
  **  
  *****
  *****
[결과]
  ****
  ****
  ** 
  ** 
  ** 
 */

public class Exam5 {
	public static void main(String[] args) {
		char[][] star = {
				{ '*', '*', ' ', ' ', ' ' },
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' } 
		};
		char[][] resultStar = new char[star[0].length][star.length];		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length;j++) {
				resultStar[j][star.length-1-i] = star[i][j];
			}
		}
		
		for(char[] rowArray : resultStar) {
			for(char item : rowArray) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		
	}
}
