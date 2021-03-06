package chap9;

class Outer1{
	class InstanceInner{ // 인스턴스 이너 클래스
		int iv = 100;
//		static int cv = 10; // static 맴버 불가 단,
		final static int MAX = 200; // 상수는 가능!
	}
	static class StaticInner{ // 스태틱 이너 클래스
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() {
		class LocalInner{
			int iv = 600;
//			static int cv = 700; // static 맴버 불가 단,
			final static int MAX = 800; // 상수는 가능!
		}
		LocalInner lc = new LocalInner();
		System.out.println("Local 내부 클래스 iv 변수 : " + lc.iv);
		System.out.println("Local 내부 스태틱 MAX 변수 : " + LocalInner.MAX);
	}
}

public class InnerEx1 {

	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method();
//		Outer1.InstanceInner inner1 = out.new InstanceInner();
		Outer1.InstanceInner inner1 = new Outer1().new InstanceInner();
		
		Outer1.StaticInner inner2 = new Outer1.StaticInner();
		
		System.out.println("InstanceInner 클래스 인스턴스 맴버 변수 iv : " + inner1.iv);
		System.out.println("InstanceInner 클래스 스태틱 맴버 변수 MAX : " + Outer1.InstanceInner.MAX);
	}

}
