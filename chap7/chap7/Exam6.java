package chap7;

/*
?‹¤?Œ?˜ ?¬?†Œ ?–‰? ¬?„ 2ì°¨ì› ë°°ì—´?˜ ?…¼ë¦¬ì  êµ¬ì¡°ë¡? ?‘œ?˜„?•˜?‹œ?˜¤.
 	A=	0	0	0	9			B = 7	4	4
 		0	1	0	0				0	3	9			
 		0	0	0	0				1	1	1				
		0	0	7	0				3	2	7			
 		0	0	0	0				5	0	3				
		3	0	0	0
 		0	0	0	0
 */
public class Exam6 {
	int[][] a = {
			{ 0, 0, 0, 9 },
			{ 0, 1, 0, 0 },
			{ 0, 0, 0, 0 },
			{ 0, 0, 7, 0 },
			{ 0, 0, 0, 0 },
			{ 3, 0, 0, 0 },
			{ 0, 0, 0, 0 }
			};

	public static void main(String[] args) {
		Exam6 e6 = new Exam6();
		int[][] targetArray = e6.a.clone();
		int count = 0;
		int[] targetIndexer = new int[targetArray.length * targetArray[1].length];
		int targetCounter = 0;
		// ë°°ì—´ ?Š¤ìº?
		for (int i = 0; i < targetArray.length; i++) {
			for (int j = 0; j < targetArray[i].length; j++) {
				if (targetArray[i][j] != 0) {
					count++;
					targetIndexer[targetCounter++] = i;
					targetIndexer[targetCounter++] = j;
					targetIndexer[targetCounter++] = targetArray[i][j];
				}
			}
		}
		int[][] resultArray = new int[count + 1][3];

		
		
		int indexPointer = 0;
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = 0; j < resultArray.length; j++) {
				if (i == 0) {
					switch (j) {
					case 0:
						resultArray[i][j] = targetArray.length;
						break;
					case 1:
						resultArray[i][j] = targetArray[i].length;
						break;
					case 2:
						resultArray[i][j] = count;
						break;
					}
				} else if (i > 0) {
					switch (j) {
					case 0:
						resultArray[i][j] = targetIndexer[indexPointer++];
						break;
					case 1:
						resultArray[i][j] = targetIndexer[indexPointer++];
						break;
					case 2:
						resultArray[i][j] = targetIndexer[indexPointer++];
						break;
					}
				}
			}
		}
		for (int[] inArray : resultArray) {
			for (int item : inArray) {
				System.out.print(item + " ");
			}
			System.out.println();
		}

	}
}
