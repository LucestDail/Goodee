package src;

class Bike2 {
	int wheel;

	Bike2(int wheel) {
		this.wheel = wheel;
	}

	void drive() {
		System.out.println("페달을 밟는다");
	}

	void stop() {
		System.out.println("브레이크를 잡는다");
	}
	public String toString() {
		return "여긴 Bike2";
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
			System.out.println("전원이 켜졌습니다.");
		else
			System.out.println("전원이 꺼졌습니다.");
	}
	public String toString() {
		return "여긴 AutoBike2";
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
//		System.out.println("바퀴 : " + ab2.wheel + "개가 굴러갑니다.");
//		ab2.stop();
		
		System.out.println(b2);
//		b2.power(); // power 메소드가 Bike2 클래스 맴버가 아니므로 Bike2형 참조변수 호출 불가
		Object obj = b2;
//		obj.wheel = 4; // wheel 맴버 변수가 Object 클래스 맴버가 아니므로
		System.out.println(obj);

	}

}
