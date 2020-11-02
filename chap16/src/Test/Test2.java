package Test;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class Test2 {
	private static int[] arr = new int[10];

	public static void main(String[] args) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		System.out.println("홀수 최대값:" + maxOrMin((a,b) -> a >= b ? a : b, a->a%2 != 0));
		System.out.println("짝수 최대값:" + maxOrMin((a,b) -> a >= b ? a : b, a->a%2 == 0));
		System.out.println("홀수 최소값:" + maxOrMin((a,b) -> a <= b ? a : b, a->a%2 != 0));
		System.out.println("짝수 최소값:" + maxOrMin((a,b) -> a <= b ? a : b, a->a%2 == 0));
		System.out.println("최대값:" + maxOrMin((a,b) -> a >= b ? a : b, a->true));
		System.out.println("최소값:" + maxOrMin((a,b) -> a <= b ? a : b, a->true));
		
	}

	private static int maxOrMin(IntBinaryOperator op, IntPredicate p) {
		int result = 0;
		for(int a : arr) {
			if(p.test(a)) {
				result = a;
				break;
			}	
		}

		for(int a : arr) {
			if(p.test(a)) {
				result = op.applyAsInt(result, a);
			}	
		}
		return result;
	}
}