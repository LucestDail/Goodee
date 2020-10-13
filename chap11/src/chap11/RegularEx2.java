package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {

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
		String[] datas = {
				"a1",
				"",
				"a",
				"1",
				"12",
				"012",
				"abc",
				"02",
				" ",
				"A",
				"5",
				"a",
				"*"
		};
		for(String d : datas) {
			if(d.equals("")) {
				System.out.print("빈문자\"\"의 패턴 => ");
			}else if(d.equals(" ")) {
				System.out.print("공백문자 \" \" 의 패턴 => ");
			}else {
				System.out.print(d + " 문자의 패턴 => ");
			}
			for(String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(d);
				if(m.matches()) {
					System.out.print(p + ", ");
				}
			}
			System.out.println();
		}
	}

}
