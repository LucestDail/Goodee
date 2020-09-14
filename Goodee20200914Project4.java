package GoodeeJavaStudy;
/* 특수 문자 정리
 * 특수 문자 \ 와 관련
 * 출력간 사용시 : 지정된 의미가 아닌 문자열로 강제형변환
 * 
 * 
 * 
 * 
 */

public class Goodee20200914Project4 {
	public static void main(String[] args) {
		char single = '\'';
		System.out.println("single : " + single);
		// 기본적으로 특수문자를 출력하기 위해서는 \ 을 앞에 찍어주면 됩니다.
		
		String str = "hello \"kim\"";
		System.out.println("str : " + str);
		// " 을 출격하고 싶으면 동일하게 \ 을 찍어주면 됩니다.
		
		String dir = "c:\\";
		System.out.println("dir : " + dir);
		// \ 을 출력하고 싶으면 \ 앞에 \ 을 찍어주면 됩니다.
	
		System.out.println("seoul\t incheon\t gyonggi"); // 동일 간격 tab 과 동일
		System.out.println("hello\n world"); // 줄바꿈
		System.out.println("\uD64D"); // 16진법을 표기
	}
}
