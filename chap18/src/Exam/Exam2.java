package Exam;

import java.util.Arrays;
import java.util.Random;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new Random().ints(100, 0, 100).toArray();
		System.out.println();
		System.out.println("Total : " + Arrays.stream(arr).sum());
		System.out.println("Sum : " + Arrays.stream(arr).average().getAsDouble());
		System.out.println("Even average : " + Arrays.stream(arr).filter(i -> i % 2 == 0).average().getAsDouble());
		System.out.println("Odd average : " + Arrays.stream(arr).filter(i -> i % 2 == 1).average().getAsDouble());
		System.out.println("Even counting : " + Arrays.stream(arr).filter(i -> i % 2 == 0).count());
		System.out.println("Odd counting : " + Arrays.stream(arr).filter(i -> i % 2 == 1).count());
		System.out.println("Deduplication counting : " + Arrays.stream(arr).distinct().count());
		System.out.println("Max number : " + Arrays.stream(arr).max());
		System.out.println("Min number : " + Arrays.stream(arr).min());
		System.out.println("Even Max number : " + Arrays.stream(arr).filter(i -> i%2 == 0).max());
		System.out.println("Even Min number : " + Arrays.stream(arr).filter(i -> i%2 == 0).min());
		System.out.println("Odd Max number : " + Arrays.stream(arr).filter(i -> i%2 == 1).max());
		System.out.println("Odd Min number : " + Arrays.stream(arr).filter(i -> i%2 == 1).min());


	}
}
