package chap5;

public class ArrayEx2 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int a : arr) {
			System.out.println(a);
		}
		arr = new int[] { 100, 200, 300 };
		for (int a : arr) {
			System.out.println(a);
		}
	}

}
