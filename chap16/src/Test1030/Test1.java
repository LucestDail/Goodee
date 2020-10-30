package Test1030;

import java.util.*;
import java.util.stream.Collectors;

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

	public String toString() {
		return "[name=" + name + ", eng=" + eng + ", math=" + math + ", major=" + major + "]";
	}
}

public class Test1 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 60, 70, "컴공"),
				new Student("김삿갓", 65, 55, "경영"),
				new Student("이몽룡", 80, 75, "화공"),
				new Student("임꺽정", 85, 65, "컴공")
				);
		System.out.println("수학 점수 총점:" + list.stream());
		System.out.println("영어 점수 총점:");
		System.out.println("수학 점수 평균:");
		System.out.println("영어 점수 평균:");
		System.out.println("컴공학생 인원수:");
		System.out.println("컴공학생 목록");
		System.out.println("컴공 수학 점수 총점:");
		System.out.println("컴공영어 점수 총점:");
		System.out.println("컴공 수학 점수 평균:");
		System.out.println("컴공영어 점수 평균:");
		System.out.println("컴공 학생의 목록(이름순):");
		System.out.println("컴공 학생의 목록(총점순):");
	}
}
