package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam12 {

	public static void main(String[] args) {
		String[] patterns = {
				".", // 문자 하나
				"[0-9]",//지정 문자 한개
				"[a-z]?", //소문자가 0개 혹은 1개
				"[0-9]+", //숫자가 1개 이상
				"^[0-9]", // 숫자로 시작하는 문자열
				"[^0-9]", //^(지정) 문자열 제외
				"[a-z]*", //소문자 0개 이상
				"[a-z]+", // 소문자가 1개 이상
				"02|010", //02 이거나, 010 이거나
				"\\w&{0,}",//특수문자가 아니고 1자리 이상의 문자
				"{3}", // 3자리 문자
				"{2,}", //최소 2자리 문자
				"{1,3}", // 1자리 ~ 3자리 문자
				"\\s", //공백인 문자
				"\\S", // 공백이 아닌 문자
				"\\d", // 숫자인 문자
				"\\D", // 숫자가 아닌 문자
				"\\w", // 대문자 소문자 숫자 등 특수기호가 아닌 일반문자
				"\\W"//특수문자
				
		};
		String str = "Java   and JSP and  Spring and HTML and JavaScript and Jquery";
		String pattern = "([a-zA-Z]*)\\s*and\\s*([a-zA-Z]*)\\s*and\\s*([a-zA-Z]*)\\s*and\\s*([a-zA-Z]*)\\s*and\\s*([a-zA-Z]*)\\s*and\\s*([a-zA-Z]*)";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		System.out.println("regex solution");
		int i = 0;
		while(m.find()) {
			System.out.println(m.group(1) + " " + m.group(2) + " " + m.group(3)+ " " + m.group(4)+ " " + m.group(5)+ " " + m.group(6));
		}
		System.out.println("split solution");
		//////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////
		String names = "Java   and JSP and  Spring and HTML and JavaScript and Jquery";
		String[] arr = names.split("\\s*and\\s*");
		for(String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("delimiter solution");
		//////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*");
		while(scan.hasNext()) {
			System.out.print(scan.next() + " ");
		}
	}

}
