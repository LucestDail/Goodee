package chap6;
/*
 * 2. ���� ����� ��µǵ��� ����Ŭ������ ����Ŭ����(Test2)�� �����ϱ� 
 * ����Ŭ����(Animal)
 * ������� : �̸�(name), ����(age)
 * ����޼���: eat() ;
 * ��� : ���ְ� ��� ���
 * [���]
 * �̸�(name):������
 * ����(age):20
 * ���ְ� ��� 
 */



class Animal{
	String name;
	int age;
	public String toString(){
		return "���ְ� ���";
	}
}
public class Homework2 {

	public static void main(String[] args) {
		
		Animal ������ = new Animal();
		������.name = "������";
		������.age = 20;
		System.out.println("�̸�(name) : " + ������.name);
		System.out.println("����(age) : " + ������.age);
		System.out.println(������);
	}
}
