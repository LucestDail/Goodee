package Example;

import java.util.function.Function;
import java.util.function.ToIntFunction;

/**
 * Function Interface 매개변수 있음, 리턴값 있음. R applyXXX(parameter argument)
 * 
 * @author ubuntu
 *
 */

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;

	public Student(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
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

	public String getMajor() {
		return major;
	}
}

public class LambdaEx8 {

	private static Student[] list = {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 85, 75, "통계")
			};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("학생의 이름 : ");
		for (Student s : list) {
			System.out.print(s.getName() + " ");
		}
		System.out.println();
		
		
		System.out.print("학생의 이름 : ");
		printString(t -> t.getName());

		System.out.print("전공의 이름 : ");
		for (Student s : list) {
			System.out.print(s.getMajor() + " ");
		}
		System.out.println();
		
		System.out.print("전공의 이름 : ");
		printString(t -> t.getMajor());
		
		System.out.print("수학 점수 : ");
		printString(t -> Integer.toString(t.getMath()));
		
		System.out.print("영어 점수 : ");
		printString(t -> Integer.toString(t.getEng()));
		
		System.out.print("학생이름(영어점수,수학점수) : ");
		printString(t-> t.getName() + "(" + t.getEng() +"," + t.getMath() + ")");
		
		System.out.print("학생들의 영어 점수 합계 : ");
		printTotal(t -> t.getEng());
	}

	
	
	private static void printTotal(ToIntFunction<Student> f) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}



	private static void printString(Function<Student, String> f) {// 매개변수는 Student 타입, 리턴은 String
		// TODO Auto-generated method stub
		for(Student s : list) {
			System.out.print(f.apply(s) + " ");
		}
		System.out.println();
	}

}
