package chap4;

import java.util.*;

public class Exam8 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		boolean checkNumber = true;
		for(int i = 0; i < input.length();i++) {
			char checkChar = input.charAt(i);
			if(checkChar >= '0' && checkChar <= '9') {
				continue;
			}else {
				System.out.println("���ǿ� �ȸ´� ��� �߰�" + checkChar);
				checkNumber = false;
			}
		}
		if(checkNumber) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("���ڰ� �ƴմϴ�.");
		}
	}
}
