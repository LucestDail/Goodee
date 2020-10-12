package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E���� a");
		// System.out.println(now);
		// System.out.println(sf.format(now));
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = "2020-12-25 10:00:00";
		Date day = null;
		try {
			day = sf2.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day);
		
		//���� : day ���ڸ� 2020-12-25 �ݿ��� �������� ���
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd E����");
		System.out.println(sf3.format(day));
	}

}
