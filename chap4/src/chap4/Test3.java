package chap4;

import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ֻ����� �����ϴ�.");
		int UserRandom = (int) (Math.random() * 6 + 1);
		int SystemRandom = (int) (Math.random() * 6 + 1);
		if (UserRandom > SystemRandom) {
			System.out.println("�ý��� �ֻ�����: " + SystemRandom + ", ����� �ֻ����� : " + UserRandom + " => ����� �¸�");
		} else if (SystemRandom > UserRandom) {
			System.out.println("�ý��� �ֻ�����: " + SystemRandom + ", ����� �ֻ����� : " + UserRandom + " => �ý��� �¸�");
		} else {
			System.out.println("�ý��� �ֻ�����: " + SystemRandom + ", ����� �ֻ����� : " + UserRandom + " => �����Դϴ�.");
		}

	}

}
