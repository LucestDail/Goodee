package Example;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fileinputstream = new FileInputStream("C:\\Users\\dhtmd\\OneDrive\\Documents\\GitHub\\Goodee\\chap18\\src\\Example\\InputStreamEx1.java");
		System.out.println("read() 메소드를 이용하여 읽기");
		int data = 0;
//		while((data = fileinputstream.read()) != -1) {
//			System.out.print((char)data);
//		}
		System.out.println();
		System.out.println("readBuf 이용하여 읽기");
		byte[] buf = new byte[fileinputstream.available()];
//		while((data = fileinputstream.read(buf)) != -1) {
//			System.out.print(new String(buf,0,data));
//		}
		System.out.println();
		System.out.println("readBuf 이용하여 읽기");

		while((data = fileinputstream.read(buf,10,buf.length-10)) != -1) {
			System.out.println(new String(buf,0,data));
		}
	}

}
