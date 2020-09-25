package src;

abstract class Abs1{
	int a = 10;
	abstract int getA();
}

abstract class Abs2 extends Abs1{
	int b = 20;
	abstract int getB();
}

class Normal extends Abs2{

	@Override
	int getB() {
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	
}

public class AbstractEx1 {

	public static void main(String[] args) {
		Normal n = new Normal();
		System.out.println(n.a); //10
		System.out.println(n.getA()); //10
		System.out.println(n.b); //20
		System.out.println(n.getB()); //20
		Abs2 a2 = n;
		System.out.println(a2.a);
		System.out.println(a2.getA());
		System.out.println(a2.b);
		System.out.println(a2.getB());
		Abs1 a1 = (Abs2) a2;
		System.out.println(a1.a);
		System.out.println(a1.getA());
//		System.out.println(a1.b);
//		System.out.println(a1.getB());
		Object obj = a1;
//		System.out.println(obj.a);
//		System.out.println(obj.getA());
//		System.out.println(obj.b);
//		System.out.println(obj.getB());
	}

}
