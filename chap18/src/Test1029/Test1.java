package Test1029;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new Random().ints(100, 1, 100).toArray();
		int count = 0;
		System.out.print("Prime number : ");
		for(int item : arr) {
			if(isPrime(item)) {
				System.out.print(item + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Prime number counting : " + count);
	}

	static boolean isPrime(int target) {
		if (target == 1) {
			return false;
		} else if (target == 2) {
			return true;
		} else {
			for (int i = 2; i < target; i++) {
				if (target % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
