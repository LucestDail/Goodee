package chap4;

/*
 * �ý��۰� ����(1), ����(2), ��(3)�� �ϱ�
 * �ý����� 1,2,3 ���� �Ѱ��� ���ڸ� �����ϰ�,
 * �Ѱ��� ���ڸ� �Է¹޾� ���������� �����ϱ�
 */

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("�ý��۰� �������� ���� �մϴ�.");
		System.out.println("����(1), ����(2), ��(3)");
		System.out.println("���ڸ� �Է����ּ���");

		int Input = scan.nextInt();
		int RSP = (int) (Math.random() * 3) + 1;
		String RSPString = "";
		if (RSP == 3) {
			RSPString = "��";
		} else if (RSP == 2) {
			RSPString = "����";
		} else {
			RSPString = "����";
		}
		String InputString = "";
		if (Input == 3) {
			InputString = "��";
		} else if (Input == 2) {
			InputString = "����";
		} else {
			InputString = "����";
		}
		if (((RSP == 3) && (Input == 1)) || ((RSP == 2) && (Input == 3)) || ((RSP == 1) && (Input == 2))) {
			System.out.println("����� : " + InputString + " / �ý���  : " + RSPString + " => ����� �¸�");
		} else if (((RSP == 3) && (Input == 2)) || ((RSP == 2) && (Input == 1)) || ((RSP == 1) && (Input == 3))) {
			System.out.println("����� : " + InputString + " / �ý���  : " + RSPString + " => �ý��� �¸�");
		} else if (Input == RSP) {
			System.out.println("����� : " + InputString + " / �ý���  : " + RSPString + " => ���º�");
		} else {
			System.out.println("�ý��� ����");
			System.out.println("input : " + Input + ", RSP : " + RSP);
		}
	}
}
