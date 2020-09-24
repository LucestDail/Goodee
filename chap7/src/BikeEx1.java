package src;

class Bike{
	int wheel;
	Bike(int wheel){
		this.wheel = wheel;
	}
	String drive() {
		return "����� ��´�";
	}
	String stop() {
		return "�극��ũ�� ��´�";
	}
	@Override
	public String toString() {
		return "�θ�Ŭ������ ������ : " + wheel;
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
		return "�õ��� Ű��";
	}
	@Override
	String stop() {
		return "�õ��� ����";
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