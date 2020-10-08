package chap11;

/*
 * Wrapper Ŭ���� : 8 ���� �⺻ �ڷ����� ��üȭ �ϱ� ���� Ŭ����
 * 
 * 
 * �⺻�ڷ���		Wrapper Ŭ����
 * boolean		Boolean
 * char			Character
 * byte			Byte
 * short		Short
 * int			Integer
 * long			Long
 * float		Float
 * double		Double
 * 
 * �⺻�ڷ����� �����ڷ����� ����ȯ�� �Ұ�����
 * ��) String str = 'A'; -> �Ұ���
 * 
 * ���������� �⺻�ڷ����� Wrapper Ŭ���� ���� ����ȯ�� ����(jdk5 ����)
 * �⺻�� <= ������ : auto UnBoxing
 * ������ <= �⺻�� : auto Boxing
 * 
 */


public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1 == 100);
		System.out.println(i2 == 100);
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.SIZE);
		
		System.out.println(Integer.parseInt("123",8));
		System.out.println(Integer.parseInt("EE",15));
		System.out.println(Byte.parseByte("127"));
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toOctalString(255));
		System.out.println(Integer.toHexString(255));
		
	}

}