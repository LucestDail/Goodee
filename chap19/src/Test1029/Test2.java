package Test1029;

import java.util.*;
import java.util.stream.IntStream;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input target number");
		int target = scan.nextInt();
		System.out.println("Total sum : " + IntStream.rangeClosed(1, target).sum());
		System.out.println(IntStream.rangeClosed(1, target).filter(i -> i%2 == 0).sum());
		System.out.println(IntStream.rangeClosed(1, target).filter(i -> i%2 == 1).sum());
	}
}
