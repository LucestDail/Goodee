package chap6;

class Number1{ // �⺻ ������ ����
	int num;
}

class Number2{ // �⺻ ������ ���� �ȵ�
	int num;
	public Number2(int x){ // < - ������
		num = x;
	}
}


public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		Number2 n2 = new Number2(20);
		System.out.println(n1.num);
		System.out.println(n2.num);
	}
}
