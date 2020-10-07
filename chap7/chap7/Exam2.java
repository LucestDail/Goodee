package chap7;

/*
 * 11*11 ?¬ê¸°ì˜ ?‚¬ê°í˜•?´ ?ˆ?‹¤ê³? ê°?? •?• ?•Œ ?‹¤?Œ ê²°ê³¼ë¥? ì¶œë ¥?˜?„ë¡? ?”„ë¡œê·¸?¨ ?‘?„±?•˜ê¸?
X         X
 X       X 
  X     X  
   X   X   
    X X    
     X     
    X X    
   X   X   
  X     X  
 X       X 
X         X
 
*/
public class Exam2 {
 public static void main(String[] args) {
	 final int ARRAY_MAX = 11;
	 String[][] xArray = new String[ARRAY_MAX][ARRAY_MAX];
	 for(int i = 0;i<ARRAY_MAX;i++) {
		 for(int j = 0; j <ARRAY_MAX;j++) {
			 if(i == j || i == ARRAY_MAX-j-1) {
				 xArray[i][j] = "X";
			 }else {
				 xArray[i][j] = " ";
			 }
		 }
	 }
	 
	 for(String[] rowArray : xArray) {
     	for(String column : rowArray) {
     		System.out.print(column + "");
     	}
     	System.out.println();
     }
		 
		 
 }
}



