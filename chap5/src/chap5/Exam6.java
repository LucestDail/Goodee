package chap5;

/*
 * 2���� �迭�� ��� ���� �� ���ϱ�
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
			System.out.println(i + "���� �� : " + sum);
		}
		for(int i = 0;i<col.length;i++) {
			System.out.println(i + "���� �� : " + col[i]);
		}
	}
}
