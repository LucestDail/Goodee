package src;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ȸ�� ����
 * ȸ���� ������ ���� �������� �����ϴ�.
 * 1. ��������, �̸�, �ּ�, �ҼӺμ��� ������.
 * -> �޿� : ����/12
 * 2. ���������� : ��� ������, �⺻ �ӱ��� ������.
 * -> �޿� : �⺻ �ӱ�
 * 3. �ӽ����� : �ð��� �ӱ�, �ٹ��ð�
 * -> �޿� : �ð��� �ӱ� * �ٹ��ð� ����;
 * 4. ��� ������ �޿��� �޽��ϴ�.getPay �޼ҵ� ����
 * 5. ��� �������� �ڽ��� �ɹ����� ������ �Է¹޾� ��ü�� ����
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
