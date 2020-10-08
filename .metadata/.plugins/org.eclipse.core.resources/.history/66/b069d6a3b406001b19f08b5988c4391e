package chap7.test;

/*
주어진 배열을 시계방향으로 90도 회전시켜서  출력하는 프로그램을 완성하시오.
주어진 배열에 값
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
