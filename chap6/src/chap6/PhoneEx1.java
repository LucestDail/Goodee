package chap6;

class Phone{
	String color;
	boolean power;
	String no;
	void power() {
		power = !power;
	}
	void send(String no) {
		System.out.println(no + "번호로 전화 송신 중");
	}
	void receive(String no) {
		System.out.println(no + "번호로 전화 착신 중");
	}
	
	
}
// 구동 클래스 : main 메소드를 가지고 있는 클래스
public class PhoneEx1{

	public static void main(String[] args) {
		String myNum = "01024299420";
		String mySecondNum = "01049269420";
		Phone myPhone = new Phone();
		myPhone.color = "white";
		myPhone.power = false;
		myPhone.power();
		myPhone.no = myNum;
		myPhone.send(myNum);
		myPhone.receive(myNum);
		System.out.println("color : " + myPhone.color + " number : " + myPhone.no);
		System.out.println("power condition : " + myPhone.power);
		Phone mySecondPhone = new Phone();
		
		mySecondPhone.power = true;
		mySecondPhone.power();
		mySecondPhone.no = mySecondNum;
		mySecondPhone.send(mySecondNum);
		mySecondPhone.receive(mySecondNum);
		System.out.println("color : " + mySecondPhone.color + " number : " + mySecondPhone.no);
		mySecondPhone = myPhone;
		mySecondPhone.color = "black";
		System.out.println("power condition : " +mySecondPhone.power);
		System.out.println("color : " + mySecondPhone.color + " number : " + mySecondPhone.no);

		System.out.println((mySecondPhone.no == myPhone.no)?"true":"false");
		System.out.println("color : " + myPhone.color + " number : " + myPhone.no);
	}

}
