package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		//Scanner 모듈
		Scanner scan = new Scanner(System.in);
		
		//포멧 설정
		final String formatString = "yyyy-MM-dd";
		SimpleDateFormat sf = new SimpleDateFormat(formatString);
		
		//기준 날짜 입력
		System.out.println("첫번째 날짜를 입력하세요...(2020년 6월 1일 -> 2020-06-01)");
		String targetDay = scan.next();
		
		//비교 날짜 입력
		System.out.println("두번째 날짜를 입력하세요...(2020년 6월 3일 -> 2020-06-02)");
		String compareDay = scan.next();
		
		//Date 객체 생성
		Date targetDate = new Date();
		Date compareDate = new Date();
		
		//initialize
		targetDate = null;
		compareDate = null;
		
		//parsing
		try {
			targetDate = sf.parse(targetDay);
			compareDate = sf.parse(compareDay);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//int 값 범위 초과하므로 long 으로 결과 반환
		long result = (compareDate.getTime() - targetDate.getTime())/(1000*60*60*24);
		System.out.println(result);
		
	}
}
