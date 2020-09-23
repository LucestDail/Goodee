package chap6;
/*
 * 초기화 블럭 예제
 * 
 */
public class InitEx1 {
	static int cv;
	int iv;
	InitEx1(){
		System.out.println("5. 생성자 호출");
	}
	static {
		cv = (int)(Math.random() * 100);
		System.out.println("1. static 초기화 블럭 실행, cv = " + cv);
	}
	{
		iv = (int)(Math.random() * 100);
		System.out.println("4. 인스턴스 초기화 블럭 실행, iv = " + iv);
	}

	public static void main(String[] args) {
		System.out.println("2. main 메소드 시작");
		System.out.println("3. InitEx1 클래스 생성자를 통해 Init1 객체 생성");
		InitEx1 Init1 = new InitEx1();
		System.out.println(Init1.iv);
		System.out.println("3. InitEx1 클래스 생성자를 통해 Init2 객체 생성");
		InitEx1 Init2 = new InitEx1();
		System.out.println(Init2.iv);

	}

}
