package GoodeeJavaStudy;
/* 2�ܿ�
 * ���ͳ� �����
 * ���ͳο� ���Ǵ� ���̻�
 * L, l : long�� ���ͳη� ����
 * F, f : float�� ���ͳη� ����
 * D, d : double�� ���ͳη� ����
 * 
 * 
 * �ڷ���
 * �⺻ �ڷ��� : 8����
 * 		���� : boolean(1����Ʈ)
 * 		������ : char(2����Ʈ)
 * 		������ : byte(1����Ʈ)
 * 			   short(2����Ʈ)
 * 			   int(4����Ʈ)
 * 			   long(8����Ʈ)
 * 		�Ǽ��� : float(4����Ʈ)
 * 			   double(8����Ʈ)
 * 
 * ���� �ڷ��� : ����� ���� �ڷ��� �Ǵ� �ڹ� API Ŭ���� => ��ü, �ν��Ͻ�
 * 			   �迭
 * 			   Ŭ����
 * 			   �������̽�
 * 
 * ����ȯ : �⺻ �ڷ��� -> �⺻ �ڷ��� Ȥ�� ���� �ڷ��� -> ���� �ڷ������� �ڷ��� ��ü�� ��ȯ�ϴ� ���
 * 			  1. �⺻�ڷ����� �����ڷ��� �� �� ��ȯ �Ұ� -> Wrapper Ŭ������ ����
 * 			  2. �⺻�ڷ��� �� boolean ���� 7������ �ڷ����� ���� ����ȯ ����
 * 			  3. ����ȯ ������ ���� ���� => �ڵ� ����ȯ(������/�Ͻ��� ����ȯ)
 * 				  ����ȯ ������ ���� �Ұ� => ���� ����ȯ(����� ����ȯ) 
 * 
 */
public class Goodee20200914Project1 {

	public static void main(String args[])
	{
		
		byte b1 = 10;
		System.out.println("byte : " + b1);
		
		short s1 = 100;
		System.out.println("short : " + s1);
		
		int i1 = 1000;
		System.out.println("integer : " + i1);
		
		long l1 = 10000;
		long l2 = 10000L; // long �� ���ͳη� �ʱ�ȭ
		long l3 = (long)10000;
		System.out.println("long : " + l1 + ',' + l2 + ',' + l3);
		
		
		float f1 = 10.5F;
		float f2 = (float)10.5;
		System.out.println("float : " + f1 + ',' + f2);
		
		double d1 = 10; //int 10�� �ڵ� ����ȯ, �޸𸮰� �� ũ�� ������ �Ͻ������� �ڵ� ����ȯ
		double d2 = 10D;
		System.out.println("double : " + d1 + ',' + d2);
		
	}
}
