package Exam;

import java.util.HashSet;
import java.util.Set;

class Student {
	String studno;
	String name;
	String major;

	Student(String studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return studno.equals(s.studno) && name.equals(s.name);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return studno.hashCode() + name.hashCode();
	}

	public String toString() {
		return "�й�=" + this.studno + ", �̸�=" + this.name + ", ����=" + this.major;
	}
}

public class Exam2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("1234", "ȫ�浿", "�濵"));
		set.add(new Student("2345", "ȫ���", "�濵"));
		set.add(new Student("2345", "ȫ���", "�İ�"));
		set.add(new Student("1234", "ȫ�浿", "���"));
		set.add(new Student("4567", "ȫ���", "�濵"));
		System.out.println("��� �л� �� : " + set.size());
		System.out.println("----------����л�----------");
		for (Student s : set) {
			System.out.println(s);
		}
	}
}
