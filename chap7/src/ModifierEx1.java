package src;

import test.Modifier2;

class Modifier{
	private int v1 = 100;
	int v2 = 200; //default �� ����, ���� ��Ű�� �������� ���� ����
	protected int v3 = 1; //����� ��쿡 ��� ����
	public void method() {
		System.out.println("package src; class Modifier method method");
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
	}
	
	
}

class Modifier3 extends Modifier2{
	public void method() {
//		System.out.println("v1 : " + v1); //private : Ŭ�������ΰ� �ƴϹǷ� ��� �Ұ�
//		System.out.println("v2 : " + v2); //default : ���� ��Ű���� �ƴϹǷ� ��� �Ұ�
		System.out.println("v3 : " + v3); //protected : �ٸ���Ű��������, ��� �޾����Ƿ� ��� ����
		System.out.println("v4 : " + v4); // public : ��� ����
	}
}

public class ModifierEx1 {

	public static void main(String[] args) {
		Modifier m1 = new Modifier();
//		System.out.println(m1.v1);// private �� ���� Ŭ���������� ������ ����
		System.out.println(m1.v2);// 
		System.out.println(m1.v3);// 
		m1.method();
		System.out.println("-----------------------------");
		Modifier2 m2 = new Modifier2();
//		System.out.println(m2.v1);//private �� �ٸ� Ŭ������ : �ȴ�
//		System.out.println(m2.v2);//���� ��Ű���� �ƴ϶� �ȴ�
//		System.out.println(m2.v3);//��Ӱ��谡 �ƴ϶� �ȴ�
		System.out.println(m2.v4);
		System.out.println(m2);
		System.out.println("-----------------------------");
		Modifier3 m3 = new Modifier3();
//		System.out.println(m3.v1);//private �� �ٸ� Ŭ������ : �ȴ�
//		System.out.println(m3.v2);//���� ��Ű���� �ƴ϶� �ȴ�
//		System.out.println(m3.v3);//��Ӱ���������, �ش� Ŭ������ �ƴϱ⶧���� �ȴ�
		System.out.println(m3.v4);
		System.out.println(m3);
		double pi = Math.PI;
	}

}