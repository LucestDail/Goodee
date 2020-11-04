package Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		User u1 = (User) ois.readObject();
		User u2 = (User) ois.readObject();
		System.out.println("read object : " + u1 + "," + u2);
	}

}
