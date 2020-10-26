package Example;

interface LambdaInterface5{
	void method();
}

class Outer{
	public int iv = 10;
	void method() {
		int iv = 20;
		LambdaInterface5 f = ()->{
			System.out.println("outer.this.iv = " + Outer.this.iv);
			System.out.println("this.iv = " + this.iv);
			System.out.println("iv = " + iv);
		};
		f.method();
	}
}

public class LambdaEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer().method();


	}

}
