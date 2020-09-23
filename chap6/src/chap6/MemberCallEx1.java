package chap6;

public class MemberCallEx1 {
	static int cv1 = 10;
	static int cv2 = cv1; // Ŭ���� �ɹ� �� ���� : ����
	int iv1 = 100;
	int iv2 = iv1; // �ν��Ͻ� �ɹ� �� ���� : ����
	int iv3 = cv1; // �ν��Ͻ� �ɹ����� Ŭ���� �ɹ� ���� : ����
	static int cv3 = new MemberCallEx1().iv1; // Ŭ�������� �ν��Ͻ��� ���� �Ұ��� : ��ȸ�� ��ü ���� �ʿ�
	void method1() { // �ν��Ͻ� �޼ҵ�
		System.out.println("cv1 + cv2 = " + (cv1 + cv2));
		System.out.println("iv1 + iv2 = " + (iv1 + iv2));
	}
	static void method2() { // Ŭ���� �żҵ�
		System.out.println("cv1 + cv2 = " + (cv1 + cv2));
		// Ŭ���� �ɹ����� �ν��Ͻ� �ɹ� ���� ���� �Ұ���
		MemberCallEx1 m = new MemberCallEx1();
		System.out.println("iv1 + iv2 = " + (m.iv1 + m.iv2));
	}
	public static void main(String[] args) {
		// Ŭ���� �ɹ����� �ν��Ͻ� �ɹ� ���� ���� �Ұ���
		new MemberCallEx1().method1(); // ��ȸ�� ��ü ����
		method2();
	}

}
