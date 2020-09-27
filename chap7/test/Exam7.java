package chap7.test;
/*
다음의 희소 행렬을 2차원 배열의 논리적 구조로 표현하시오.
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
