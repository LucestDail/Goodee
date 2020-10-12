package chap11;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println(today.get(Calendar.YEAR));//로컬 연도 표시
		System.out.println(today.get(Calendar.MONTH)+1);//로컬 월 표시
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));//년도 기준 몇째주
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));//월 기준 몇째주
		System.out.println(today.get(Calendar.DATE));//로컬 일 표시
		System.out.println(today.get(Calendar.DAY_OF_WEEK));// 일요일 기준 몇번째 날짜인지?(일요일 = 0
		System.out.println(today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(today.get(Calendar.AM_PM));// 오전-0, 오후-1 출력
		System.out.println(today.get(Calendar.HOUR));//현재 시
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.MINUTE));//현재 분
		System.out.println(today.get(Calendar.SECOND));//현재 초 
		System.out.println(today.get(Calendar.MILLISECOND)); //현재 밀리초
		System.out.println(today.get(Calendar.ZONE_OFFSET/(60*60*1000)));//표준시간 기준 현재 시간대 반환
		System.out.println(today.getActualMaximum(Calendar.DATE));
		System.out.println(today.getFirstDayOfWeek());
	}
}
