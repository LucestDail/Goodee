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
		return "[name=" + name + ",eng=" + eng + ",math=" + math + ",total:" + getTotal() + "]";
	}
}

public class Test1 {
	private static Student[] list = {
			new Student("hong", 75, 80),
			new Student("kim", 85, 85),
			new Student("lee", 80, 70),
			new Student("lim", 90, 95)
			};

	public static void main(String[] args) {
		System.out.println("eng max =>" + getMaxOrMin((a,b) -> (a.getEng() >= b.getEng()) ? a : b));
		System.out.println("eng min =>" + getMaxOrMin((a,b) -> (a.getEng() <= b.getEng()) ? a : b));
		System.out.println("math max =>" + getMaxOrMin((a,b) -> (a.getMath() >= b.getMath()) ? a : b));
		System.out.println("math min =>" + getMaxOrMin((a,b) -> (a.getMath() <= b.getMath()) ? a : b));
		System.out.println("total max =>" + getMaxOrMin((a,b) -> (a.getTotal() >= b.getTotal()) ? a : b));
		System.out.println("total min =>" + getMaxOrMin((a,b) -> (a.getTotal() <= b.getTotal()) ? a : b));
	}

	private static Student getMaxOrMin(BinaryOperator<Student> f) {
		Student result = list[0];
		for (Student s : list) {
			result = f.apply(result, s);
		}
		return result;
	}
}