package GoodeeJavaStudy;
/* Ư�� ���� ����
 * Ư�� ���� \ �� ����
 * ��°� ���� : ������ �ǹ̰� �ƴ� ���ڿ��� ��������ȯ
 * 
 * 
 * 
 * 
 */

public class Goodee20200914Project4 {
	public static void main(String[] args) {
		char single = '\'';
		System.out.println("single : " + single);
		// �⺻������ Ư�����ڸ� ����ϱ� ���ؼ��� \ �� �տ� ����ָ� �˴ϴ�.
		
		String str = "hello \"kim\"";
		System.out.println("str : " + str);
		// " �� ����ϰ� ������ �����ϰ� \ �� ����ָ� �˴ϴ�.
		
		String dir = "c:\\";
		System.out.println("dir : " + dir);
		// \ �� ����ϰ� ������ \ �տ� \ �� ����ָ� �˴ϴ�.
	
		System.out.println("seoul\t incheon\t gyonggi"); // ���� ���� tab �� ����
		System.out.println("hello\n world"); // �ٹٲ�
		System.out.println("\uD64D"); // 16������ ǥ��
	}
}
