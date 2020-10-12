package Exam;

import java.util.Calendar;
import java.util.Scanner;

public class Exam11 {
	public enum Week{
		일,
		월,
		화,
		수,
		목,
		금,
		토,
	}
	
	public static void main(String[] args) {
		System.out.println("년도와 월을 입력하세요...예(2020년 6월 -> 2020 06)");
		//스캐너 선언
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		final int point = 1;
		Calendar cal = Calendar.getInstance();
		Week[] week = Week.values();
		
		
		// 2020-06-01 월요일
		cal.set(year,month-1,1);
		System.out.print(year + "년" + month + "월 첫 날짜 : ");
		System.out.println();
		System.out.print(cal.get(Calendar.YEAR));
		System.out.print("년");
		System.out.print(cal.get(Calendar.MONTH)+1);
		System.out.print("월");
		System.out.print(cal.get(Calendar.DATE));
		System.out.print("일,");
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK) - point] + "요일");

		
		//2020-06-30 화요일
		cal.set(year,month-1,cal.getActualMaximum(Calendar.DATE));
		System.out.print(year + "년" + month + "월 첫 날짜 : ");
		System.out.println();
		System.out.print(cal.get(Calendar.YEAR));
		System.out.print("년");
		System.out.print(cal.get(Calendar.MONTH)+1);
		System.out.print("월");
		System.out.print(cal.getActualMaximum(Calendar.DATE));
		System.out.print("일,");
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK) - point] + "요일");
	}
}
