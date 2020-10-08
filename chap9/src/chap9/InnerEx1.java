package chap9;

class Outer1{
	class InstanceInner{ // �ν��Ͻ� �̳� Ŭ����
		int iv = 100;
//		static int cv = 10; // static �ɹ� �Ұ� ��,
		final static int MAX = 200; // ����� ����!
	}
	static class StaticInner{ // ����ƽ �̳� Ŭ����
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() {
		class LocalInner{
			int iv = 600;
//			static int cv = 700; // static �ɹ� �Ұ� ��,
			final static int MAX = 800; // ����� ����!
		}
		LocalInner lc = new LocalInner();
		System.out.println("Local ���� Ŭ���� iv ���� : " + lc.iv);
		System.out.println("Local ���� ����ƽ MAX ���� : " + LocalInner.MAX);
	}
}

public class InnerEx1 {

	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method();
//		Outer1.InstanceInner inner1 = out.new InstanceInner();
		Outer1.InstanceInner inner1 = new Outer1().new InstanceInner();
		
		Outer1.StaticInner inner2 = new Outer1.StaticInner();
		
		System.out.println("InstanceInner Ŭ���� �ν��Ͻ� �ɹ� ���� iv : " + inner1.iv);
		System.out.println("InstanceInner Ŭ���� ����ƽ �ɹ� ���� MAX : " + Outer1.InstanceInner.MAX);
	}

}