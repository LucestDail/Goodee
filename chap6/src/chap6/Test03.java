package chap6;

class Sort {
	public int[] bubblebubble(int result[]) {
		int buffer = 0;
		for (int i = result.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (result[j] > result[j + 1]) {
					buffer = result[j];
					result[j] = result[j + 1];
					result[j + 1] = buffer;
				}
			}
		}
		return result;
	}
}

class Print {
	public void prinrin(int target[]) {
		int count = target.length-1;
		System.out.println(count);
		int input = 5;
		input = (input / 2) + 1;
		for (int i = input - 1; i > 0; i--) {
			System.out.print(target[count--] +"\t");
			for (int j = 0; j < i; j++) {
				System.out.print(target[count--] +"\t"+target[count--] +"\t");
			}
			System.out.println("");
		}
		for (int i = 0; i < input; i++) {
			System.out.print(target[count--] +"\t");
			for (int j = 0; j < i; j++) {
				System.out.print(target[count--] +"\t"+target[count--] +"\t");
			}
			System.out.println("");
		}
	}
}

public class Test03 {
	public static void main(String[] args) {
		int arr[] = { 50, 7, 5, 8, 1, 33, 16, 2, 28, 25, 29, 17, 44, 15, 13, 9, 31 };
		// sorting
		Sort mySort = new Sort();
		int[] setArray = mySort.bubblebubble(arr);
		Print prinprin = new Print();
		prinprin.prinrin(setArray);
	}
}
