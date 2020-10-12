package Exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		//연산 지정일 입력
		System.out.println("년도와 월을 입력하세요...예(2020년 6월 -> 2020 06)");
		
		//스캐너 선언
		Scanner scan = new Scanner(System.in);
		
		//day 객체 선언
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
		System.out.println("시스템 입력 결과 확인");
		System.out.println(day);
		
		System.out.println(year+"년"+ month + "월의 첫날");
		String formatString1 = "yyyy-MM-dd E요일";
		SimpleDateFormat sf1 = new SimpleDateFormat(formatString1);
		System.out.println(sf1.format(day));
		
		System.out.println(year+"년"+ month + "월의 막날");
		String formatString2 = "yyyy-MM-dd E요일";
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
