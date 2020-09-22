package chap6;

/*
 * 5. str 문자열에 각각의 알파벳의 갯수를 출력하시오
 * public class Test5 {
 * public static void main(String[] args) {
 * String str = "it is possible to draw a parallel between their experience and ours";
 * }
 * }
 * [결과]
 * a:5개
 * b:2개
 * c:1개
 * d:2개
 * e:10개
 * h:1개
 * i:5개
 * l:4개
 * n:3개
 * o:3개
 * p:3개
 * r:5개
 * s:4개
 * t:4개
 * u:1개
 * w:2개
 * 
 * 
 * 
 * 
 */

public class Homework5 {

	public static void main(String[] args) {
		String str = "it is possible to draw a parallel between their experience and ours";
		char[] strToChar = str.toCharArray();
		int[] CharChecker = new int['z' - 'a'+1];
		System.out.println(CharChecker.length);
		for(int i = 0; i < strToChar.length;i++) {
			for(int j = 'a';j<='z';j++) {
				if(strToChar[i] == (char)j) {
					CharChecker[j-'a']++;
				}
			}
		}
		for(int i = (int)'a'; i <(int)'z' ;i++) {
			if(CharChecker[i-'a'] != 0) {
				System.out.println((char)i + " : " + CharChecker[i - (int)'a'] + "개");
			}
		}
	}
}
