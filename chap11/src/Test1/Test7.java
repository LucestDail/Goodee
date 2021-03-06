package Test1;

import java.util.Arrays;

class Student implements Comparable<Student> {
	String name;
	int kor, eng, math;

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (o.kor + o.eng + o.math) - (kor + eng + math);
	}

	public String toString() {
		return "�̸�:" + this.name + ", ����:" + this.kor + ", ����=" + this.eng + ", ����=" + this.math + ",����:"
				+ (kor + eng + math);
	}

}

public class Test7 {
	public static void main(String[] args) {
		Student[] arr = {
				new Student("ȫ�浿", 70, 60, 70),
				new Student("�̸���", 55, 65, 90),
				new Student("���", 95, 65, 80),
				new Student("������", 95, 95, 80)
				};
		Arrays.sort(arr);
		for (Student s : arr)
			System.out.println(s);
	}
}