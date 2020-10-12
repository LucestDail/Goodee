package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateEx2 {

	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now.getTime());
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat sf = new SimpleDateFormat(
				"yyyy-MM-dd");
		String target = "2021-03-01";
		Date day = null;
		try {
			day = sf.parse(target);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(target + ":" + new SimpleDateFormat("E요일").format(day));	
		System.out.println(day.getTime());
		
		
		day.setTime(now.getTime() + (1000*60*60*24*3));
		SimpleDateFormat sf2 = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss E요일");
		System.out.println(sf2.format(day));
	}
}
