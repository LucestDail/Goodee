package chap5;

/*
 * 2차원 배열의 행과 열의 합 구하기
 * 
 * 
 */
public class Exam6 {

	public static void main(String[] args) {

		int arr[][] = { { 1 }, { 10, 20, 3, 4, 5, 6 }, { 30, 40, 50 }, { 60, 70, 80, 90 } };
		int maxCol = 0;
		for(int i=0;i<arr.length;i++) {
			if(maxCol<arr[i].length) {
				maxCol = arr[i].length;
			}
		}
		int col[] = new int[maxCol];
		for(int i =0 ;i < arr.length;i++) {
			int sum = 0;
			for(int j = 0; j < arr[i].length;j++) {
				sum += arr[i][j];
				col[j] +=arr[i][j];
			}
			System.out.println(i + "행의 합 : " + sum);
		}
		for(int i = 0;i<col.length;i++) {
			System.out.println(i + "열의 합 : " + col[i]);
		}
	}
}
