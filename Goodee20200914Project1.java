package GoodeeJavaStudy;
/* 2단원
 * 리터널 상수값
 * 리터널에 사용되는 접미사
 * L, l : long형 리터널로 설정
 * F, f : float형 리터널로 설정
 * D, d : double형 리터널로 설정
 * 
 * 
 * 자료형
 * 기본 자료형 : 8가지
 * 		논리형 : boolean(1바이트)
 * 		문자형 : char(2바이트)
 * 		정수형 : byte(1바이트)
 * 			   short(2바이트)
 * 			   int(4바이트)
 * 			   long(8바이트)
 * 		실수형 : float(4바이트)
 * 			   double(8바이트)
 * 
 * 참조 자료형 : 사용자 정의 자료형 또는 자바 API 클래스 => 객체, 인스턴스
 * 			   배열
 * 			   클래스
 * 			   인터페이스
 * 
 * 형변환 : 기본 자료형 -> 기본 자료형 혹은 참조 자료형 -> 참조 자료형으로 자료형 자체를 변환하는 방식
 * 			  1. 기본자료형과 참조자료형 간 형 변환 불가 -> Wrapper 클래스는 예외
 * 			  2. 기본자료형 중 boolean 제외 7가지의 자료형은 서로 형변환 가능
 * 			  3. 형변환 연산자 생략 가능 => 자동 형변환(묵시적/암시적 형변환)
 * 				  형변환 연산자 생략 불가 => 지정 형변환(명시적 형변환) 
 * 
 */
public class Goodee20200914Project1 {

	public static void main(String args[])
	{
		
		byte b1 = 10;
		System.out.println("byte : " + b1);
		
		short s1 = 100;
		System.out.println("short : " + s1);
		
		int i1 = 1000;
		System.out.println("integer : " + i1);
		
		long l1 = 10000;
		long l2 = 10000L; // long 형 리터널로 초기화
		long l3 = (long)10000;
		System.out.println("long : " + l1 + ',' + l2 + ',' + l3);
		
		
		float f1 = 10.5F;
		float f2 = (float)10.5;
		System.out.println("float : " + f1 + ',' + f2);
		
		double d1 = 10; //int 10의 자동 형변환, 메모리가 더 크기 때문에 암시적으로 자동 형변환
		double d2 = 10D;
		System.out.println("double : " + d1 + ',' + d2);
		
	}
}
