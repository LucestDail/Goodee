package Example;
/**
 * ����ڰ� ������ Ŭ������ ��ü�� TreeSet�� �����ϱ�
 * ���İ��� �������̽�
 * 1. Comparable<T> �������̽�
 * int compareTo(T) : ��ü�� �⺻ ���� ���
 * 2. Comparator<T> �������̽�
 * int compare(T,T) : �������� ���Ĺ���� �����ϴ� ���
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class PhoneNo implements Comparable<PhoneNo> {
	String name;
	int number;
	public PhoneNo(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return this.name + " :" + this.number;
	}
	@Override
	public int compareTo(PhoneNo o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}

public class SetEx4 {
	public static void main(String[] args){
		System.out.println("List �̸������� �����Ͽ� ����ϱ�");
		List<PhoneNo> list = new ArrayList<>();
		list.add(new PhoneNo("ȫ�浿", 1234));
		list.add(new PhoneNo("���", 2345));
		list.add(new PhoneNo("�̸���", 7890));
		
		System.out.println("TreeSet �̸������� �����Ͽ� ����ϱ�");
		TreeSet<PhoneNo> set = new TreeSet<>(list);
		System.out.println(set);
		
		System.out.println("TreeSet �̸������� �����Ͽ� ����ϱ�");
		TreeSet<PhoneNo> set2 = new TreeSet<>(Comparator.reverseOrder());
		set2.addAll(list);
		System.out.println(set2);
		
		System.out.println("TreeSet ��ȭ��ȣ������ �����Ͽ� ����ϱ�");
		TreeSet<PhoneNo> set3 = new TreeSet<>(new Comparator<PhoneNo>() {

			@Override
			public int compare(PhoneNo o1, PhoneNo o2) {
				// TODO Auto-generated method stub
				return o1.number - o2.number;
			}
			
		});
		set3.addAll(list);
		System.out.println(set3);
		
		System.out.println("TreeSet ��ȭ��ȣ �������� �����Ͽ� ����ϱ�,����");
		set3 = new TreeSet<>((o1,o2)->(o2.number-o1.number));
		set3.addAll(list);
		System.out.println(set3);
	}

}
