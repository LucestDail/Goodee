package chap6;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열 크기를 입력하세요");
		int input = scan.nextInt();
		int count = 1;
		int numCount = 0;
		int[][] inputArray = new int[input][];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = new int[i + 1];
		}

		for (int i = inputArray.length - 1; i > -1; i--) {
			for (int j = inputArray[i].length - 1; j > -1; j--) {
				if (j == inputArray[i].length - 1) {
					inputArray[i][j] = 1+((count * (count-1))/2);
					count++;
				} else {
					int num = numCount + i-j+1;
					inputArray[i][j] = (int) (inputArray[i][j+1] + num);
				}
			}
			numCount++;
		}

		for (int[] rowArray : inputArray) {
			for (int item : rowArray) {
				System.out.print(item + "\t");
			}
			System.out.println();
		}

	}
}
