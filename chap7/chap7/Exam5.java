package chap7;

/*
ì£¼ì–´ì§? ë°°ì—´?„ ?‹œê³„ë°©?–¥?œ¼ë¡? 90?„ ?šŒ? „?‹œì¼œì„œ  ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?™„?„±?•˜?‹œ?˜¤.
ì£¼ì–´ì§? ë°°ì—´?— ê°?
  **  
  **  
  *****
  *****
[ê²°ê³¼]
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
