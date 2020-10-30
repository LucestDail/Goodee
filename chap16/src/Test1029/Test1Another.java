package Test1029;

import java.util.*;
import java.util.function.IntPredicate;

public class Test1Another {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new Random().ints(10, 1, 101).toArray();
		for (int a : arr)
			System.out.print(a + " ");
		System.out.println();
		System.out.print("소수목록 :");
		// forEach : 최종 단계 반복자.
		// peek : 중간 단계 반복자.
		IntPredicate f = a -> {
			int cnt = 0;
			for (int i = 2; i < a; i++) {
				if (a % i == 0)
					cnt++;
			}
			if (cnt > 0)
				return false;
			else
				return true;
		};
		Arrays.stream(arr).filter(f).distinct().forEach(a -> System.out.print(a + " "));
		System.out.println();
		long count = Arrays.stream(arr).distinct().filter(f).count();
		System.out.println("소수의 갯수 :" + count);
		System.out.println("=============");
		System.out.print("소수목록 :");
		count = Arrays.stream(arr).distinct().filter(f).peek(s -> System.out.print(s + " ")).count();
		System.out.println();
		System.out.println("소수의 갯수:" + count);

	}

}
