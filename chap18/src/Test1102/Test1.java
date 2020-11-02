package Test1102;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	private String name; // 이름
	private String work; // 업무
	private String position; // 직급
	private int age; // 나이

	public Employee(String name, String work, String position, int age) {
		this.name = name;
		this.work = work;
		this.position = position;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getWork() {
		return work;
	}

	public String getPosition() {
		return position;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", work=" + work + ", position=" + position + ", age=" + age;
	}
}

class CONST{
	final int NAME = 0;
	final int WORK = 1;
	final int POSITION = 2;
	final int AGE = 3;
	final int ERROR = 4;
}

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		Stream<Employee> st = null;
		CONST c = new CONST();
		
		// 1. emp.txt 파일을 읽어서, st 객체에 저장
		st = StreamMaker();
		
		// 2. 사원들이 속한 직급 정보 출력하기
		System.out.println("=== 사원들이 속한 직급 정보 ===");
		st.map(stObj -> stObj.getPosition()).distinct().forEach(stObj -> System.out.print(stObj + " "));
		System.out.println();
		// 3. 업무별 이름 출력하기
		System.out.println("=== 업무별 이름 출력하기 ===");
		st = StreamMaker();
		st.collect(Collectors.groupingBy(s->s.getWork())).forEach((k,v) -> {
			System.out.print(k + " : ");
			for(Employee e : v) {
				System.out.print(e.getName() + " ");
			}
			System.out.println();
		});
		// 4. 직급별 나이의 평균 출력하기
		System.out.println("=== 직급별 나이의 평균 출력하기 ===");
		st = StreamMaker();
		st.collect(Collectors.groupingBy(s->s.getPosition())).forEach((k,v) -> {
			System.out.print(k + " : ");
			int count = 0;
			int sum = 0;
			for(Employee e : v) {
				count++;
				sum += e.getAge();
			}
			System.out.println((double)sum/count);
		});
		System.out.println();
	}
	private static Stream<Employee> StreamMaker() throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream("emp.txt"), "UTF-8"));
		Stream<Employee> st = null;
		CONST c = new CONST();
		st = buff.lines().map(stObj -> {
			String[] str = stObj.split(",");
			String temp = "";
			try {
				temp = str[c.ERROR];
			} catch (ArrayIndexOutOfBoundsException e) {
				temp = "";
			}
			return new Employee(str[c.NAME], str[c.WORK], str[c.POSITION], Integer.parseInt(str[c.AGE]));
		});
		return st;
	}

}