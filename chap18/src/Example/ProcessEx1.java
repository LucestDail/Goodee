package Example;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class ProcessEx1 {
	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec("ping localhost");
		Reader r = new InputStreamReader(p.getInputStream());
//		InputStream r = p.getInputStream();
		int data = 0;
		while((data = r.read())!= -1) {
			System.out.print((char)data);
		}
		p = Runtime.getRuntime().exec("notepad.exe");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		p.destroy();
	}
}
