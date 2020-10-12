package Test;

import java.util.Calendar;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("년도와 월을 입력하세요...예(2020년 6월 -> 2020 06)");

		// 스캐너 선언 및 기초 util 관련 선언
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		final int point = 1;
		int startDate = 1;

		// Calendar 객체 선언
		Calendar calendar = Calendar.getInstance();
		
		//기준 calendar 설정
		calendar.set(year, month - point, 1);
		int addPoint = calendar.get(Calendar.DAY_OF_WEEK);
		// 헤더
		System.out.println("\t\t" + year + "년\t" + month + "월");
		System.out.print("월\t화\t수\t목\t금\t토\t일");
		System.out.println();
		//출력
		for (int i = 0; i < calendar.getActualMaximum(Calendar.DATE)+addPoint; i++) {
			if(i < addPoint) {
				System.out.print("\t");
			}else {
				System.out.print(startDate++ + "\t");
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
	}

}
