package chap4;

/*
 * ȭ�鿡�� �Ѱ��� ���ڸ� �Է¹޾�
 * �빮���� ���� �ҹ��ڷ�, 
 * �ҹ����� ���� �빮�ڷ� 
 * ������ ���� 20�� ���� ���� ����ϱ�
 * �׿��� ���ڴ� ��Ÿ ���� �� ����ϼ���
 */

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inpur your number");
		String InputString = scan.next();

		char InputToChar = InputString.charAt(0);
		int CharToInteger = InputToChar;
		if (CharToInteger >= 48 && CharToInteger <= 57) { // finding numbers
			System.out.println(Integer.parseInt(InputString) + 20);
		} else if (CharToInteger >= 65 && CharToInteger <= 90) { // finding upper character
			System.out.println((char) (CharToInteger + 32));
		} else if (CharToInteger >= 97 && CharToInteger <= 122) {// finding lower character
			System.out.println((char) (CharToInteger - 32));
		} else {
			System.out.println("��Ÿ����");
		}
	}

}
