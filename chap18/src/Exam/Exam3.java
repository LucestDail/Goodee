package Exam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Scan file name
 * input saving date scan until exit word input
 * create file as file name fill with saving data, not exit
 * @author ubuntu
 *
 */
public class Exam3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("input your creating file name");
		Scanner scan = new Scanner(System.in);
		String filename = scan.next();
		StringBuffer sb = new StringBuffer();
		sb.append(filename + ".txt");
		FileOutputStream fos = new FileOutputStream(sb.toString());
		//FileWriter fw = new FileWriter(file);
		System.out.println("your file will be created as " + sb.toString() + ", fill it your word");
		while(true) {
			scan = new Scanner(System.in);
			String word = scan.nextLine();
			if(word.equals("exit")) {
				break;
			}
			byte[] buf = word.getBytes();
			fos.write(buf);
		}
		fos.flush();
		fos.close();
	}
}
