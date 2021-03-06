package chap11;

/*
 * Wrapper 클래스 : 8 개의 기본 자료형을 객체화 하기 위한 클래스
 * 
 * 
 * 기본자료형		Wrapper 클래스
 * boolean		Boolean
 * char			Character
 * byte			Byte
 * short		Short
 * int			Integer
 * long			Long
 * float		Float
 * double		Double
 * 
 * 기본자료형과 참조자료형은 형변환이 불가능함
 * 예) String str = 'A'; -> 불가능
 * 
 * 예외적으로 기본자료형과 Wrapper 클래스 간의 형변환은 가능(jdk5 이후)
 * 기본형 <= 참조형 : auto UnBoxing
 * 참조형 <= 기본형 : auto Boxing
 * 
 */


public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1 == 100);
		System.out.println(i2 == 100);
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.SIZE);
		
		System.out.println(Integer.parseInt("123",8));
		System.out.println(Integer.parseInt("EE",15));
		System.out.println(Byte.parseByte("127"));
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toOctalString(255));
		System.out.println(Integer.toHexString(255));
		
	}

}
