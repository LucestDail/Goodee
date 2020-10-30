package Test;
import java.util.function.BinaryOperator;

class Student {
	private String name;
	private int eng;
	private int math;

	public Student(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		return getMath() + getEng();
	}

	@Override
	public String toString() {
		return "[name=" + name + ",eng=" + eng + ",math=" + math + ",����:" + (eng + math) + "]";
	}
}

public class Test1 {
	private static Student[] list = {
			new Student("ȫ�浿", 75, 80),
			new Student("���", 85, 85),
			new Student("�̸���", 80, 70),
			new Student("�Ӳ���", 90, 95)
			};

	public static void main(String[] args) {
		System.out.println("�����ְ��� �л�=>" + getMaxOrMin((a,b) -> (a.getEng() >= b.getEng()) ? a : b));
		System.out.println("���������� �л�=>" + getMaxOrMin((a,b) -> (a.getEng() <= b.getEng()) ? a : b));
		System.out.println("�����ְ��� �л�=>" + getMaxOrMin((a,b) -> (a.getMath() >= b.getMath()) ? a : b));
		System.out.println("���������� �л�=>" + getMaxOrMin((a,b) -> (a.getMath() <= b.getMath()) ? a : b));
		System.out.println("�հ��ְ��� �л�=>" + getMaxOrMin((a,b) -> (a.getTotal() >= b.getTotal()) ? a : b));
		System.out.println("�հ������� �л�=>" + getMaxOrMin((a,b) -> (a.getTotal() <= b.getTotal()) ? a : b));
	}

	private static Student getMaxOrMin(BinaryOperator<Student> f) {
		Student result = list[0];
		for (Student s : list) {
			result = f.apply(result, s);
		}
		return result;
	}
}