package chap5;

public class ArrayEx1 {

	public static void main(String[] args) {

		int[] arr1 = new int[5];
		arr1[0] = 100;
		arr1[1] = 200;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1 [" + i + "] = " + arr1[i]);
		}

		int[] arr2 = new int[10];
		arr2 = arr1;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}

	}

}
