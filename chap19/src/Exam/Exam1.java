package Exam;

import java.util.Arrays;

public class Exam1 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() *100) + 1;
			System.out.println( arr[i]+" ");
		}
		System.out.println();
		System.out.println("Total : " + Arrays.stream(arr).sum());
		System.out.println("Sum : " + Arrays.stream(arr).average().getAsDouble());
		System.out.println("Even average : " + Arrays.stream(arr).filter(i -> i%2 ==0).average().getAsDouble());
		System.out.println("Odd average : " + Arrays.stream(arr).filter(i -> i%2 ==1).average().getAsDouble());
		System.out.println("Even counting : " + Arrays.stream(arr).filter(i -> i%2 ==0).count());
		System.out.println("Odd counting : " + Arrays.stream(arr).filter(i -> i%2 ==1).count());
		System.out.println("Deduplication counting : " + Arrays.stream(arr).distinct().count());
	}
}
