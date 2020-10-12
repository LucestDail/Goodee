package chap11;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		final int point = 1;
		cal.set(2020, 12-point, 27);
		System.out.print(cal.get(Calendar.YEAR));
		System.out.print("년");
		System.out.print(cal.get(Calendar.MONTH)+1);
		System.out.print("월");
		System.out.print(cal.get(Calendar.DATE));
		System.out.print("일, ");
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		default:
			System.out.println("토요일");
			break;
		}
	}

}
