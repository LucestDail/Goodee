package Example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserInfo{
	protected String name;
	protected String password;
	public UserInfo() {
		
	}
	public UserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public String toString() {
		return String.format("[%s, %s]", name, password);
	}
}

class User extends UserInfo implements Serializable{
	private int age;
	public User(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}
	public String toString() {
		return String.format("[%s, %s, %d]", name, password, age);
	}
	//직렬화에 추가할 수 있는 기능 삽입
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject();
	}
	//직렬화에서 복원된 객체에서 추가된 내용 읽을 수 있도록
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
}

public class ObjectOutputStreamEx2 {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream
				(new FileOutputStream("object2.ser"));
		User u1 = new User("Hong","1234",20);
		User u2 = new User("Kim","5678",30);
		oos.writeObject(u1);
		oos.writeObject(u2);
		System.out.println("User : " + u1 + ", " + u2);
	}
}
