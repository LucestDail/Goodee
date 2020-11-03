package Example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

public class FileOutputStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstMethod();
	}
	private static void firstMethod() {
		secondMethod();
	}
	private static void secondMethod() {
		try {
			throw new Exception("saving error message to file");
		}catch(Exception e) {
			e.printStackTrace();
			try {
				/**
				 * error.log,true -> will be named error.log, if file existed, it will be modify
				 * if not, it will be create file.
				 * if condtion true is not existed delete all statement of file and modify,
				 * if true condition available, just add another statement, not modify file statement
				 * if you want to see recenlty error, not use true parameter or use parameter false
				 */
				FileOutputStream fos = new FileOutputStream("error.log",true);
				fos.write(e.getMessage().getBytes());
				e.printStackTrace(new PrintStream(fos));
				fos.write
				((new Date() + " : ============\n\n").getBytes());
			}catch(IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}
