package chap9;

import chap9.Outer2.StaticInner;

class Outer2{
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	
	static class StaticInner{
//		int siv = outeriv; // 객체 생성후에 사용할수 있음
		int siv = new Outer2().outeriv;
		static int scv = outercv;
	}
	
	void method(int pv) {
		class LocalInner{
			int liv = outeriv;
			int liv2 = outercv;
			void method() {
				System.out.println("pv : " + pv); //로컬 메소드 이너 클래스에서 파라매터는 무조건 상수 처리
				System.out.println("liv : " + liv);
				System.out.println("liv2 : " + liv2);
				System.out.println("outeriv : " + outeriv);
				System.out.println("outercv : " + outercv);
			}
		}
		LocalInner lc = new LocalInner();
//		pv++;
		lc.liv++;
		lc.liv2++;
		outeriv++;
		outercv++;
		lc.method();
	}
}


public class InnerEx2 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(100);
		
		Outer2.InstanceInner inner1 = out.new InstanceInner();
		System.out.println(inner1.iiv);
		System.out.println(inner1.iiv2);
		Outer2.StaticInner inner2 = new Outer2.StaticInner();
		System.out.println(inner2.siv);
		System.out.println(StaticInner.scv);

	}

}
