package Example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("hong");
		ps.println(1234);
		ps.println(true);
		ps.println(65);
		ps.write(65);
		ps.println('A');
		ps.flush();
		ps.close();

	}

}
