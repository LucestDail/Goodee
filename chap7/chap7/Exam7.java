package chap7;
/*
?‹¤?Œ?˜ ?¬?†Œ ?–‰? ¬?„ 2ì°¨ì› ë°°ì—´?˜ ?…¼ë¦¬ì  êµ¬ì¡°ë¡? ?‘œ?˜„?•˜?‹œ?˜¤.
	A=	7	4	4			B = 0	0	0	9 
		0	3	9				0	1	0	0				
		1	1	1				0	0	0	0				
		3	2	7				0	0	7	0			
		5	0	3 				0	0	0	0				
								3	0	0	0
								0	0	0	0
*/
public class Exam7 {
	static int[][] a = {
			{7,4,4},
			{0,3,9},
			{1,1,1},
			{3,2,7},
			{5,0,3}
			};
	public static void main(String[] args) {
		int[][] targetArray = a.clone();
		int[][] resultArray = new int[targetArray[0][0]][targetArray[0][1]];
		for(int i = 1; i < targetArray.length;i++) {
			resultArray[targetArray[i][0]][targetArray[i][1]] = targetArray[i][2];
		}
		for(int[] inArray : resultArray) {
			for(int item : inArray) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}
}
