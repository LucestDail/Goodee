package Exam;

import java.util.Calendar;
import java.util.Scanner;

public class Exam11 {
	public enum Week{
		��,
		��,
		ȭ,
		��,
		��,
		��,
		��,
	}
	
	public static void main(String[] args) {
		System.out.println("�⵵�� ���� �Է��ϼ���...��(2020�� 6�� -> 2020 06)");
		//��ĳ�� ����
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		final int point = 1;
		Calendar cal = Calendar.getInstance();
		Week[] week = Week.values();
		
		
		// 2020-06-01 ������
		cal.set(year,month-1,1);
		System.out.print(year + "��" + month + "�� ù ��¥ : ");
		System.out.println();
		System.out.print(cal.get(Calendar.YEAR));
		System.out.print("��");
		System.out.print(cal.get(Calendar.MONTH)+1);
		System.out.print("��");
		System.out.print(cal.get(Calendar.DATE));
		System.out.print("��,");
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK) - point] + "����");

		
		//2020-06-30 ȭ����
		cal.set(year,month-1,cal.getActualMaximum(Calendar.DATE));
		System.out.print(year + "��" + month + "�� ù ��¥ : ");
		System.out.println();
		System.out.print(cal.get(Calendar.YEAR));
		System.out.print("��");
		System.out.print(cal.get(Calendar.MONTH)+1);
		System.out.print("��");
		System.out.print(cal.getActualMaximum(Calendar.DATE));
		System.out.print("��,");
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK) - point] + "����");
	}
}
