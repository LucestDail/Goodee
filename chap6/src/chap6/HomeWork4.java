package chap6;


/*
 * 4. 다음과 같은 멤버 변수를 갖는 Student 클래스를 정의 하시오
 * 멤버 변수
 * String name //학생이름
 * int ban,no,kor,eng,math  //반,번호,국어점수,영어점수,수학점수
 *  멤버 메서드
 *  1. getTotal
 *  기능 : 국어,영어,수학 점수의 합 반환
 *  2. getAverage
 *  기능 : 총점(국어,영어,수학 점수의 합) 을 과목수로 나눈 평균 반환
 *  리턴타입 : float
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
