
public class sortingTest {
	public static void main(String[] args) {
		int[] array = {1,5,8,2,24,9,3,5,5,5,1,9,23,7,7,2,5,5,8,134,0,73,4};
		for(int item : array) {
			System.out.print(item + " ");
		}
		System.out.println();
		for(int item : sortingScopeAsc(array,0,array.length-1)) {
			System.out.print(item + " ");
		}
		System.out.println();
		for(int item : sortingScopeDesc(array,0,array.length-1)) {
			System.out.print(item + " ");
		}
		System.out.println();
		
	}
	private static int[] sortingScopeAsc(int[] array, int from, int to) {
		int[] targetArray = array.clone();
		int buf;
		for(int i = from; i < to;i++) {
			for (int j = from; j < to - i - 1; j++) {
				if (i == j) {
					continue;
				}
				if (targetArray[j] >= targetArray[j + 1]) {
					buf = targetArray[j];
					targetArray[j] = targetArray[j+1];
					targetArray[j+1] = buf;
				}
			}
		}
		return targetArray;
	}
	private static int[] sortingScopeDesc(int[] array, int from, int to) {
		int[] targetArray = array.clone();
		int buf;
		for(int i = from; i < to;i++) {
			for (int j = from; j < to - i - 1; j++) {
				if (i == j) {
					continue;
				}
				if (targetArray[j] <= targetArray[j + 1]) {
					buf = targetArray[j];
					targetArray[j] = targetArray[j+1];
					targetArray[j+1] = buf;
				}
			}
		}
		return targetArray;
	}

}
