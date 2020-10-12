package Exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		//���� ������ �Է�
		System.out.println("�⵵�� ���� �Է��ϼ���...��(2020�� 6�� -> 2020 06)");
		
		//��ĳ�� ����
		Scanner scan = new Scanner(System.in);
		
		//day ��ü ����
		Date day = new Date();
		int year = scan.nextInt();
		int month = scan.nextInt();
		String yearMonth = year + "-" + month;
		String formatString = "yyyy-MM";
		SimpleDateFormat sf = new SimpleDateFormat(formatString);
		day = null;
		try {
			day = sf.parse(yearMonth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ý��� �Է� ��� Ȯ��");
		System.out.println(day);
		
		System.out.println(year+"��"+ month + "���� ù��");
		String formatString1 = "yyyy-MM-dd E����";
		SimpleDateFormat sf1 = new SimpleDateFormat(formatString1);
		System.out.println(sf1.format(day));
		
		System.out.println(year+"��"+ month + "���� ����");
		String formatString2 = "yyyy-MM-dd E����";
		SimpleDateFormat sf2 = new SimpleDateFormat(formatString2);
		yearMonth = year + "-" + (month+1);
		formatString = "yyyy-MM";
		sf = new SimpleDateFormat(formatString);
		day = null;
		try {
			day = sf.parse(yearMonth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		day.setTime(day.getTime() - (1000*60*60*24) );
		System.out.println(sf2.format(day));
		scan.close();
	}
}
