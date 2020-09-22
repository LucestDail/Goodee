package chap5;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[][] arr = {{10,20},{30,40,50},{60}};
		for(int[] item : arr) {
			for(int itemSpecific : item) {
				System.out.printf("%d\t", itemSpecific);
			}
			System.out.println();
		}
	}
}
