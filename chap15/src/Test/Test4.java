package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	String name;
	int kor;
	int eng;
	int math;

	public Student(String name, int kor, int eng, int math) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return this.kor + this.eng + this.math;
	}

	public String toString() {
		return this.name + ":����(" + this.kor + "),����(" + this.eng + "),����(" + this.math + "),����(" + getTotal() + "),���("
				+ String.format("%.2f", (getTotal() / 3d)) + ")";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}

public class Test4 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("ȫ�浿", 90, 80, 70));
		list.add(new Student("���", 95, 85, 75));
		list.add(new Student("�̸���", 80, 95, 95));
		list.add(new Student("�Ӳ���", 60, 75, 100));
		System.out.println("�⺻���Ĺ��");
		TreeSet<Student> set1 = new TreeSet<>();
		set1.addAll(list);
		for (Student s : set1)
			System.out.println(s);
		System.out.println("�������� �������� ����");
		TreeSet<Student> set2 = new TreeSet<>((o1,o2)->(o2.getTotal() - o1.getTotal()));
		set2.addAll(list);
		for (Student s : set2)
			System.out.println(s);
		System.out.println("���� ������������ ����");
		TreeSet<Student> set3 = new TreeSet<>((o1,o2)->(o2.kor - o1.kor));
		set3.addAll(list);
		for (Student s : set3)
			System.out.println(s);
		System.out.println("���� ������������ ����");
		TreeSet<Student> set4 = new TreeSet<>((o1,o2)->(o2.eng - o1.eng));
		set4.addAll(list);
		for (Student s : set4)
			System.out.println(s);
		System.out.println("���� ������������ ����");
		TreeSet<Student> set5 = new TreeSet<>((o1,o2)->(o2.math - o1.math));
		set5.addAll(list);
		for (Student s : set5)
			System.out.println(s);
	}
}