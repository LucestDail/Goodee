package chap6;

class Car3{
	String color;
	int number;
	int serialNo;
	static int sno;
	Car3(String color, int number){
		System.out.println("Car3(string, int)");
		this.color = color;
		this.number = number;
		serialNo = ++sno;
	}
	Car3(String color) {
		this(color, 1111); // �ݵ�� �������� ù�ٿ� �ۼ��ؾ���
		System.out.println("Car3(string)");
	}
	Car3(int number) {
		this("white",number);
		System.out.println("Car3(int)");
	}
	Car3() {
		this("white",1111);
		System.out.println("Car3()");
	}
	public Car3(Car3 c) {
		this(c.color,c.number);
	}
	public String toString() {
		return serialNo + "�� ������ : "+this.color + ',' + this.number;
	}
}

public class ThisEx1 {
	public static void main(String[] args) {
		Car3 c1 = new Car3("blue", 1234);
		Car3 c2 = new Car3();
		Car3 c3 = new Car3("red");
		Car3 c4 = new Car3(1234);
		Car3 c5 = new Car3(c1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
	}

}
