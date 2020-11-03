package Example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int MAX_BUF = 47928;
		FileReader fis = new FileReader("src//Example//FileReaderEx1.java");
		int data;
		System.out.println("===read() method===");
		while((data = fis.read()) != -1) {
			System.out.print((char)data);
		}
		System.out.println();
		System.out.println("===read(buf) method===");
		fis = new FileReader("comment.txt");
		char[] buf = new char[MAX_BUF];
		while((data = fis.read()) != -1) {
			System.out.print(new String(buf,0,data));
		}
		System.out.println();
		System.out.println("===read(buf,start,len) method===");
		fis = new FileReader("comment.txt");
		while((data = fis.read(buf,0,buf.length)) != -1) {
			System.out.print(new String(buf,0,data));
		}
	}
}
