package chap6;

import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dogCount = 0;
		int birdCount = 0;
		System.out.println("dog bird sum : ");
		int inputNumber = scan.nextInt();
		System.out.println("dog bird leg sum : ");
		int inputLeg = scan.nextInt();
		for(int x = 0; x<inputNumber+1;x++) {
			for(int y = 0;y<inputNumber+1;y++) {
				int sumlegs = 4*x + 2*y;
				if(sumlegs == inputLeg && x+y == inputNumber) {
					dogCount = x;
					birdCount = y;
				}
			}
		}
		System.out.println("dog : " + dogCount);
		System.out.println("bird : " + birdCount);
	}

}
