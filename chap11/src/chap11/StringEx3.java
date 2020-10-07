package chap11;
/*
 * String ũ���� : format �޼ҵ� ����
 * 				=> ����ȭ ���ڸ� ����� �� �ִ� �޼ҵ�
 * 				=> Ŭ���� �޼ҵ���
 */
public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String.format("%.2f", 0.124));//�Ҽ��� ���� 2�ڸ��� ���
		//3�ڸ����� 5�̻��� ���� �ݿø�, %f : �Ǽ��� ���ڸ� ����ȭ�ϴ� ��ȣ
		
		System.out.println(String.format("%10d", 12345));
		//10�� ���ڸ� 10�ڸ� Ȯ���Ͽ�, �����������
		
		System.out.println(String.format("%-10d", 12345));
		//10�� ���ڸ� 10�ڸ� Ȯ���Ͽ�, �����������
		
		System.out.println(String.format("%010d", 12345));
		//10�� ���ڸ� 10�ڸ� Ȯ���Ͽ� �������, ���ڸ� 0���� ä��
		
		System.out.println(String.format("%,10d", 12345));
		//3�ڸ������� , �Է�
		
		System.out.println(String.format("%X", 255));
		//16�� ������ ����ȭ, �빮�ڷ� ǥ��
		
		System.out.println(String.format("%x", 255));
		//16�� ������ ����ȭ, �빮�ڷ� ǥ��
		
		System.out.println(String.format("%o", 12345));
		//8�� ������ ����ȭ, �빮�ڷ� ǥ��
		
		System.out.println(String.format("%s", "ȫ�浿"));
		//���� ����ȭ ��ȣ
		
		System.out.println(String.format("%c", 'A'));
		//char ���� ��ȣ
		
		System.out.println(String.format("%s�� ������ %c�Դϴ�.", "ȫ�浿",'A'));
		//���ڿ�, �ܹ��� ���� ����
	}

}
