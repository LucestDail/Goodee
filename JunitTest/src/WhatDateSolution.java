import java.text.ParseException;
import java.text.SimpleDateFormat;

class WhatDateSolution {
	public static String solution(int a, int b){
		int year = 2016;
		int month = a;
		int day = b;
		String answer = "";
		String targetDate = year + "-" + month + "-" + day;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			targetDate = sf.parse(targetDate).toString();
			answer = targetDate.substring(0,3).toUpperCase();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return answer;
	}
}