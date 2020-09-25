package src;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 회사 예제
 * 회사의 직원은 여러 유형으로 나뉩니다.
 * 1. 직원구분, 이름, 주소, 소속부서를 가진다.
 * -> 급여 : 연봉/12
 * 2. 비정규직원 : 계약 만료일, 기본 임금을 가진다.
 * -> 급여 : 기본 임금
 * 3. 임시직원 : 시간당 임금, 근무시간
 * -> 급여 : 시간당 임금 * 근무시간 지급;
 * 4. 모든 직원은 급여를 받습니다.getPay 메소드 구현
 * 5. 모든 직원들은 자신의 맴버변수 내용을 입력받아 객체로 생성
 */

abstract class Employee {
	String type;
	String name;
	String address;
	String dept;

	Employee(String type, String name, String address, String dept) {
		this.type = type;
		this.name = name;
		this.address = address;
		this.dept = dept;
	}

	abstract int getPay();
}

class FormalEmployee extends Employee {
	int deptNo;
	String job;
	int wagePerYear;

	FormalEmployee(int deptno, String job, int wagePerYear, String name, String address, String dept) {
		super("FormalEmployee", name, address, dept);
		this.deptNo = deptno;
		this.job = job;
		this.wagePerYear = wagePerYear;

	}

	@Override
	int getPay() {
		return this.wagePerYear / 12;
	}

	public String toString() {
		return "[type : " + this.type + "] name : " + this.name + " (wage : " + getPay() + ")";
	}
}

class InformalEmployee extends Employee {
	Date date;
	int basicSalary;

	InformalEmployee(Date date, int basicSalary, String name, String address, String dept) {
		super("InformalEmployee", name, address, dept);
		this.date = date;
		this.basicSalary = basicSalary;

	}

	@Override
	int getPay() {
		return this.basicSalary;
	}

	public String toString() {
		return "[type : " + this.type + "] name : " + this.name + " (wage : " + getPay() + ")";
	}
}

class TempEmployee extends Employee {
	int wagePerHour;
	int workedHour;

	TempEmployee(int wagePerHour, int workedHour, String name, String address, String dept) {
		super("TempEmployee", name, address, dept);
		this.wagePerHour = wagePerHour;
		this.workedHour = workedHour;
	}

	@Override
	int getPay() {
		return this.wagePerHour * this.workedHour;
	}

	public String toString() {
		return "[type : " + this.type + "] name : " + this.name + " (wage : " + getPay() + ")";
	}
}

public class Exam4 {
	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		Date exDate = new Date();
		exDate.setTime(exDate.getTime() + (1000L * 60 * 60 * 24 * 465));
		emps[0] = new FormalEmployee(1, "worker", 12000, "Mike", "Seoul", "QA");
		emps[1] = new InformalEmployee(exDate, 2000, "Alice", "Inchoen", "DB");
		emps[2] = new TempEmployee(10, 300, "Kate", "Busan", "Dev");

		long total = 0;
		for (Employee worker : emps) {
			System.out.println(worker);
			total += worker.getPay();
			if (worker instanceof FormalEmployee) {

			} else if (worker instanceof InformalEmployee) {
				System.out.println("  ExpiredDate : "
						+ new SimpleDateFormat("yyyy-MM-dd").format(((InformalEmployee) worker).date));
				System.out.println();
			} else if (worker instanceof TempEmployee) {

			} else {
				System.out.println("error occured");
			}
		}
		System.out.println();
		System.out.println("total payment : " + total);
	}
}
