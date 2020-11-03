package Test1103;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "bin//Example//PrintStreamEx1.class";
		BufferedReader fileIn = new BufferedReader(new FileReader(path));
		int data = 0;
		int counter = 0;
		while((data = fileIn.read()) != -1) {
			System.out.print(String.format("%X", data) + " ");
			counter++;
			if(counter%16 == 0) {
				System.out.println();
			}
		}
		fileIn.close();
	}

}
