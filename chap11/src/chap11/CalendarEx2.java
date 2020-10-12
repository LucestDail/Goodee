package chap11;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		final int point = 1;
		cal.set(2020, 12-point, 27);
		System.out.print(cal.get(Calendar.YEAR));
		System.out.print("��");
		System.out.print(cal.get(Calendar.MONTH)+1);
		System.out.print("��");
		System.out.print(cal.get(Calendar.DATE));
		System.out.print("��, ");
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.println("�Ͽ���");
			break;
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("ȭ����");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("�����");
			break;
		case 6:
			System.out.println("�ݿ���");
			break;
		default:
			System.out.println("�����");
			break;
		}
	}

}
