package chap6;
/*
 * 생성자 역시 오버로딩이 가능합니다!
 * 
 * 
 */

class Car2{
	String color;
	int number;
	Car2(String c, int n){
		color = c;
		number = n;
	}
	public Car2(String c) {
		color = c;
	}
	public Car2(int n) {
		number = n;
	}
	public String toString() {
		return color + ',' + number;
	}
}
public class ConstructorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c1 = new Car2("blue", 1234);
		Car2 c2 = new Car2("red");
		Car2 c3 = new Car2(1234);
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);

	}

}
