package src;

class Bike2 {
	int wheel;

	Bike2(int wheel) {
		this.wheel = wheel;
	}

	void drive() {
		System.out.println("����� ��´�");
	}

	void stop() {
		System.out.println("�극��ũ�� ��´�");
	}
	public String toString() {
		return "���� Bike2";
	}
}

class AutoBike2 extends Bike2 {
	AutoBike2(int wheel) {
		super(wheel);
	}

	boolean power;

	void power() {
		power = !power;
		if (power)
			System.out.println("������ �������ϴ�.");
		else
			System.out.println("������ �������ϴ�.");
	}
	public String toString() {
		return "���� AutoBike2";
	}
}

public class BikeEx2 {
	boolean power;

	public static void main(String[] args) {
		AutoBike2 ab2 = new AutoBike2(2);
		Bike2 b2;
		b2 = ab2;
		
		System.out.println(b2);
		b2.drive();
		System.out.println("ab2------");
//		ab2.power();
//		ab2.drive();
//		System.out.println("���� : " + ab2.wheel + "���� �������ϴ�.");
//		ab2.stop();
		
		System.out.println(b2);
//		b2.power(); // power �޼ҵ尡 Bike2 Ŭ���� �ɹ��� �ƴϹǷ� Bike2�� �������� ȣ�� �Ұ�
		Object obj = b2;
//		obj.wheel = 4; // wheel �ɹ� ������ Object Ŭ���� �ɹ��� �ƴϹǷ�
		System.out.println(obj);

	}

}
