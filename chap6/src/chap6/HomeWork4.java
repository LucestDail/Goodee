package chap6;


/*
 * 4. ������ ���� ��� ������ ���� Student Ŭ������ ���� �Ͻÿ�
 * ��� ����
 * String name //�л��̸�
 * int ban,no,kor,eng,math  //��,��ȣ,��������,��������,��������
 *  ��� �޼���
 *  1. getTotal
 *  ��� : ����,����,���� ������ �� ��ȯ
 *  2. getAverage
 *  ��� : ����(����,����,���� ������ ��) �� ������� ���� ��� ��ȯ
 *  ����Ÿ�� : float
 */



class Student{
	String name;
	int ban, no, kor, eng, math;
	int getTotal() {
		int sum = kor + eng + math;
		return sum;
	}
	float getAverage() {
		float average = getTotal() / 3;
		return average;
	}
	
}

public class HomeWork4 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.kor = 100;
		s1.eng = 0;
		s1.math = 50;
		System.out.println(s1.getTotal());
		System.out.println(s1.getAverage());		
	}
}
