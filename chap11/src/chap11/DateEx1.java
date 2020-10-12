package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일 a");
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
		
		//문제 : day 날자를 2020-12-25 금요일 형식으로 출력
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(sf3.format(day));
	}

}
