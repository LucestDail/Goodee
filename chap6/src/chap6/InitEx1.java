package chap6;
/*
 * �ʱ�ȭ �� ����
 * 
 */
public class InitEx1 {
	static int cv;
	int iv;
	InitEx1(){
		System.out.println("5. ������ ȣ��");
	}
	static {
		cv = (int)(Math.random() * 100);
		System.out.println("1. static �ʱ�ȭ �� ����, cv = " + cv);
	}
	{
		iv = (int)(Math.random() * 100);
		System.out.println("4. �ν��Ͻ� �ʱ�ȭ �� ����, iv = " + iv);
	}

	public static void main(String[] args) {
		System.out.println("2. main �޼ҵ� ����");
		System.out.println("3. InitEx1 Ŭ���� �����ڸ� ���� Init1 ��ü ����");
		InitEx1 Init1 = new InitEx1();
		System.out.println(Init1.iv);
		System.out.println("3. InitEx1 Ŭ���� �����ڸ� ���� Init2 ��ü ����");
		InitEx1 Init2 = new InitEx1();
		System.out.println(Init2.iv);

	}

}
