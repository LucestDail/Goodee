package chap11;

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis()); // 난수를 다양하게 설정
		Random rand2 = new Random();
		System.out.println(System.currentTimeMillis());
		rand2.setSeed(System.currentTimeMillis());
		System.out.println("rand ===>");
		for(int i = 0; i < 5; i++) {
			System.out.println(i + " : " + rand.nextInt(100));
		}
		System.out.println();
		System.out.println("rand2 ===>");
		for(int i = 0; i < 5; i++) {
			System.out.println(i + " : " + rand2.nextInt(100));
		}
	}
}
