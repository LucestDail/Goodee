package Test;

import java.util.Calendar;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("�⵵�� ���� �Է��ϼ���...��(2020�� 6�� -> 2020 06)");

		// ��ĳ�� ���� �� ���� util ���� ����
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		final int point = 1;
		int startDate = 1;

		// Calendar ��ü ����
		Calendar calendar = Calendar.getInstance();
		
		//���� calendar ����
		calendar.set(year, month - point, 1);
		int addPoint = calendar.get(Calendar.DAY_OF_WEEK);
		// ���
		System.out.println("\t\t" + year + "��\t" + month + "��");
		System.out.print("��\tȭ\t��\t��\t��\t��\t��");
		System.out.println();
		//���
		for (int i = 0; i < calendar.getActualMaximum(Calendar.DATE)+addPoint; i++) {
			if(i < addPoint) {
				System.out.print("\t");
			}else {
				System.out.print(startDate++ + "\t");
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
	}

}
