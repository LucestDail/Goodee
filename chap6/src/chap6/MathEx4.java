package chap6;


/*
 * 오버로딩 메서드 선택 기준
 * 	1. 호출시 입력된 인자값의 자료형과 메소드의 선언부에 정의된 자료형이 동일한 메소드 선택
 * 	2. 1의 조건이 없는경우
 * 		최소 갯수로 자동형변환이 가능한 메소드 선택 => 동일한 조건의 메소드가 여러개인 경우 오류 발생
 * 
 * 오버로딩의 조건
 * 	1. 매개변수가 달라야 한다.(자료형 기준으로 달라야합니다!)
 * 	2. 메소드 이름이 같아야 한다.
 * 
 */

class Mat4{
	long add(int a, int b) {
		System.out.print("int int : ");
		return a+b;
	}
	long add(long a, int b) {
		System.out.print("long int : ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("int long : ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("long long : ");
		return a+b;
	}
}


public class MathEx4 {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		Mat4 m4 = new Mat4();
		m4.add(a,b);
		m4.add((long)a, b);
		m4.add((long)a, b);
		m4.add(a, (long)b);
		m4.add((long)a, (long)b);
	}
}
