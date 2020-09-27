package chap7.test;

/*
 * 11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기
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



