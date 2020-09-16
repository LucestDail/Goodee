package chap4;

import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주사위를 던집니다.");
		int UserRandom = (int) (Math.random() * 6 + 1);
		int SystemRandom = (int) (Math.random() * 6 + 1);
		if (UserRandom > SystemRandom) {
			System.out.println("시스템 주사위값: " + SystemRandom + ", 사용자 주사위값 : " + UserRandom + " => 사용자 승리");
		} else if (SystemRandom > UserRandom) {
			System.out.println("시스템 주사위값: " + SystemRandom + ", 사용자 주사위값 : " + UserRandom + " => 시스템 승리");
		} else {
			System.out.println("시스템 주사위값: " + SystemRandom + ", 사용자 주사위값 : " + UserRandom + " => 동점입니다.");
		}

	}

}
