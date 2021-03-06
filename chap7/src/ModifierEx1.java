package src;

import test.Modifier2;

class Modifier{
	private int v1 = 100;
	int v2 = 200; //default 는 생략, 동일 패키지 내에서만 접근 가능
	protected int v3 = 1; //상속할 경우에 허용 가능
	public void method() {
		System.out.println("package src; class Modifier method method");
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
	}
	
	
}

class Modifier3 extends Modifier2{
	public void method() {
//		System.out.println("v1 : " + v1); //private : 클래스내부가 아니므로 사용 불가
//		System.out.println("v2 : " + v2); //default : 같은 패키지가 아니므로 사용 불가
		System.out.println("v3 : " + v3); //protected : 다른패키지이지만, 상속 받았으므로 사용 가능
		System.out.println("v4 : " + v4); // public : 사용 가능
	}
}

public class ModifierEx1 {

	public static void main(String[] args) {
		Modifier m1 = new Modifier();
//		System.out.println(m1.v1);// private 는 같은 클래스에서만 접근이 가능
		System.out.println(m1.v2);// 
		System.out.println(m1.v3);// 
		m1.method();
		System.out.println("-----------------------------");
		Modifier2 m2 = new Modifier2();
//		System.out.println(m2.v1);//private 라서 다른 클래스임 : 안댐
//		System.out.println(m2.v2);//같은 패키지가 아니라서 안댐
//		System.out.println(m2.v3);//상속관계가 아니라서 안댐
		System.out.println(m2.v4);
		System.out.println(m2);
		System.out.println("-----------------------------");
		Modifier3 m3 = new Modifier3();
//		System.out.println(m3.v1);//private 라서 다른 클래스임 : 안댐
//		System.out.println(m3.v2);//같은 패키지가 아니라서 안댐
//		System.out.println(m3.v3);//상속관계이지만, 해당 클래스가 아니기때문에 안댐
		System.out.println(m3.v4);
		System.out.println(m3);
		double pi = Math.PI;
	}

}
