package src;

class Bike{
	int wheel;
	Bike(int wheel){
		this.wheel = wheel;
	}
	String drive() {
		return "페달을 밟는다";
	}
	String stop() {
		return "브레이크를 잡는다";
	}
	@Override
	public String toString() {
		return "부모클래스의 바퀴수 : " + wheel;
	}
}

class AutoBike extends Bike{
	boolean power;
	AutoBike(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
	}
	@Override
	String drive() {
		System.out.println(super.drive());
		return "시동을 키다";
	}
	@Override
	String stop() {
		return "시동을 끄다";
	}
}

public class BikeEx1 {

	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println(ab.stop());
		Bike b = new Bike(2);
		System.out.println(b.drive());
		System.out.println(b.stop());
	}

}
