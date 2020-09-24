package src;

class Phone{
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power)
			System.out.println("전화걸기");
	}
	void receive() {
		if(power)
			System.out.println("전화받기");
	}
}

class SmartPhone extends Phone{
	void setApp(String name) {
		System.out.println(name + " 앱 설치함");
	}
}

public class InheritEx1 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("네이버");
		
	}

}
