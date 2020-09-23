package chap6;


/*
 * �����ε� �޼��� ���� ����
 * 	1. ȣ��� �Էµ� ���ڰ��� �ڷ����� �޼ҵ��� ����ο� ���ǵ� �ڷ����� ������ �޼ҵ� ����
 * 	2. 1�� ������ ���°��
 * 		�ּ� ������ �ڵ�����ȯ�� ������ �޼ҵ� ���� => ������ ������ �޼ҵ尡 �������� ��� ���� �߻�
 * 
 * �����ε��� ����
 * 	1. �Ű������� �޶�� �Ѵ�.(�ڷ��� �������� �޶���մϴ�!)
 * 	2. �޼ҵ� �̸��� ���ƾ� �Ѵ�.
 * 
 */

class Mat4{
	long add(int a, int b) {
		System.out.print("int int : ");
		return a+b;
	}
	long add(long a, int b) {
		System.out.print("long int : ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("int long : ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("long long : ");
		return a+b;
	}
}


public class MathEx4 {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		Mat4 m4 = new Mat4();
		m4.add(a,b);
		m4.add((long)a, b);
		m4.add((long)a, b);
		m4.add(a, (long)b);
		m4.add((long)a, (long)b);
	}
}
