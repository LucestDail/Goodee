package Example;

import java.io.File;
import java.io.IOException;

public class FileEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("/home/ubuntu/Documents/temp1");
		System.out.printf("%s Folder Created : %b%n", f1.getAbsolutePath(),f1.mkdir());
		File f2 = new File("/home/ubuntu/Documents/temp1/test.txt");
		System.out.printf("%s File Created : %b%n", f2.getAbsolutePath(),f2.createNewFile());
		System.out.printf("File name : %s, File size : %,d byte%n", f2.getName(), f2.length());
		File f3 = new File("/home/ubuntu/Documents/temp1/test2.txt");
		System.out.printf("%s -> %s name changed : %b%n",f2.getName(), f3.getName(), f2.renameTo(f3));
		System.out.printf("%s file has removed : %b%n", f3.getName(), f3.delete());
		

	}

}
