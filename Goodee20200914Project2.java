package GoodeeJavaStudy;
/* �ڷ��� ���� ���� �׽���
 * 
 * 1. �ٸ� �ڷ��� ���� ���� �� ����� ū �ڷ����� ���󰩴ϴ�.
 * 
 * 
 */

public class Goodee20200914Project2 {
	public static void main(String args[])
	{
		byte b1 = 10;
		int i1 = 20;
		float f1 = 10.5f;
		double d1 = 1.0;
		
		int i2 = b1 + i1; // byte + int -> int ����
		byte b2 = (byte)(b1 + i1); // byte + int -> byte �Ұ���, ���� ���Ѵٸ� ������� ����ȯ
		System.out.println("int + byte : " + i2);
		System.out.println("int + byte : " + b2);
		
		float f2 = i1 + f1;
		System.out.println("int + float : " + f2);
		
		double d2 = f1 + d1;
		System.out.println("float + long : " + d2);
		
		float f3 = f1 + 1000l; // float �ڷ�����  double ���� ũ�Ƿ�, float + long -> float
		System.out.println("float + long : " + f3);
		
		byte b3 = 10;
		byte b4 = (byte)(b1 + b3);
		System.out.println("byte + byte : " + b3 + ',' + b4);
		// int �� ���� ���� �ڷ����� ������� ���� �ڷ����� ��� ���� int ������ ��ȯ
		// ���� ����� �ٲܷ��� �ش� ������ ��ü ����� byte ������ ����ȯ �� ������ �Ҵ�
		
		//ASCII ����ȯ
		//�빮�� + 32 : �ҹ��ڷ� ����
		char c1 = 'A';
		System.out.println("c1 : " + c1 + ',' + "int c1 : " + (int)c1);
		char c2 = (char)(c1 + 32);
		System.out.println("c1 + 32 : " + c2 + ',' + "int c2 : " + (int)c2);
		char c3 = (char)(c2 + 1);
		System.out.println("c2 + 1 : " + c3 + ',' + "int c3 : " + (int)c3);
		
	}

}
