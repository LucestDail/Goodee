package chap11;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println(today.get(Calendar.YEAR));//���� ���� ǥ��
		System.out.println(today.get(Calendar.MONTH)+1);//���� �� ǥ��
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));//�⵵ ���� ��°��
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));//�� ���� ��°��
		System.out.println(today.get(Calendar.DATE));//���� �� ǥ��
		System.out.println(today.get(Calendar.DAY_OF_WEEK));// �Ͽ��� ���� ���° ��¥����?(�Ͽ��� = 0
		System.out.println(today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(today.get(Calendar.AM_PM));// ����-0, ����-1 ���
		System.out.println(today.get(Calendar.HOUR));//���� ��
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.MINUTE));//���� ��
		System.out.println(today.get(Calendar.SECOND));//���� �� 
		System.out.println(today.get(Calendar.MILLISECOND)); //���� �и���
		System.out.println(today.get(Calendar.ZONE_OFFSET/(60*60*1000)));//ǥ�ؽð� ���� ���� �ð��� ��ȯ
		System.out.println(today.getActualMaximum(Calendar.DATE));
		System.out.println(today.getFirstDayOfWeek());
	}
}
