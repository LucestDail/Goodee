package chap6;

/*
 * �����ε� ����(��ü���� ���α׷����� Ư¡ - �������� ���)
 * 		1. Ŭ���� ���ο� ���� �̸��� �޼��尡 ������ ������ �� �ִ�.
 * 		2. �Ű����� ����� �޶�� �Ѵ�.(�����, ����, ����)
 * 
 * 
 */

class Math2{
	int a = 100;
	int add(int b) {
		System.out.println("int add  : ");
		return a+b;
	}
	double add(double b) {
		System.out.println("double add : ");
		return a+b;
	}
	String add(String b) {
		System.out.println("String add : ");
		return a+b;
	}
}

public class OverloadingEx1 {
	public static void main(String[] args) {
		Math2 m = new Math2();
		System.out.println(m.add(10));
		System.out.println(m.add(10.5));
		System.out.println(m.add("��"));
	}
}
