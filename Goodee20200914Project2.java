package GoodeeJavaStudy;
/* 자료형 간의 연산 테스팅
 * 
 * 1. 다른 자료형 간의 연산 시 결과는 큰 자료형을 따라갑니다.
 * 
 * 
 */

public class Goodee20200914Project2 {
	public static void main(String args[])
	{
		byte b1 = 10;
		int i1 = 20;
		float f1 = 10.5f;
		double d1 = 1.0;
		
		int i2 = b1 + i1; // byte + int -> int 가능
		byte b2 = (byte)(b1 + i1); // byte + int -> byte 불가능, 만약 원한다면 결과값을 형변환
		System.out.println("int + byte : " + i2);
		System.out.println("int + byte : " + b2);
		
		float f2 = i1 + f1;
		System.out.println("int + float : " + f2);
		
		double d2 = f1 + d1;
		System.out.println("float + long : " + d2);
		
		float f3 = f1 + 1000l; // float 자료형이  double 보다 크므로, float + long -> float
		System.out.println("float + long : " + f3);
		
		byte b3 = 10;
		byte b4 = (byte)(b1 + b3);
		System.out.println("byte + byte : " + b3 + ',' + b4);
		// int 형 보다 작은 자료형의 결과값은 기존 자료형과 상관 없이 int 형으로 반환
		// 따라서 결과를 바꿀려면 해당 수식의 전체 결과를 byte 형으로 형변환 후 변수에 할당
		
		//ASCII 형변환
		//대문자 + 32 : 소문자로 구성
		char c1 = 'A';
		System.out.println("c1 : " + c1 + ',' + "int c1 : " + (int)c1);
		char c2 = (char)(c1 + 32);
		System.out.println("c1 + 32 : " + c2 + ',' + "int c2 : " + (int)c2);
		char c3 = (char)(c2 + 1);
		System.out.println("c2 + 1 : " + c3 + ',' + "int c3 : " + (int)c3);
		
	}

}
