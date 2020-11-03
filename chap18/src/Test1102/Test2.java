package Test1102;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Test2 {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		System.out.println("input your file name");
		Scanner scan = new Scanner(System.in);
		String targetFile = scan.next();
		try {
			FileInputStream fis = new FileInputStream(targetFile);
			byte[] buf = new byte[fis.available()];
			int data = 0;
			while ((data = fis.read(buf)) != -1) {
				System.out.print(new String(buf, 0, data));
			}
		} catch (IOException e) {
			System.out.println("file is not existed");
			return;
		}
	}
	

}
