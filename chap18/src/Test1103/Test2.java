package Test1103;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "bin//Example//PrintStreamEx1.class";
		FileInputStream fis = new FileInputStream(path);
		int data = 0;
		int counter = 0;
		while((data = fis.read()) != -1) {
			System.out.printf("%02X ", data);
			counter++;
			if(counter%16 == 0) {
				System.out.println();
			}
		}
		fis.close();
	}

}
