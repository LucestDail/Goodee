package Example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ObjectOutputStream
 * 1. 객체를 외부로 전송할 수 있는 스트림
 * 2. 전송이 되는 객체는 반드시 Serializable 인터페이스 객체여야 함
 * 3. 객체를 외부로 전송하는 기능을 직렬화라고 합니다.
 * 4. ObjectInputStream 으로 객체를 읽어야 한다.
 * @author ubuntu
 *
 */

class Customer implements Serializable{
	private String name;
	private int age;
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return String.format("[%s : %d]", this.name, this.age);
	}
}

public class ObjectOutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Customer c1 = new Customer("hong",20);
		Customer c2 = new Customer("kim",30);
		oos.writeObject(c1);
		oos.writeObject(c2);
		System.out.println(c1 + "," + c2);
	}

}
