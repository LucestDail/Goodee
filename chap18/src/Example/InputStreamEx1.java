package Example;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
		 InputStream in = System.in; // 1바이트 단위로 읽음
		 int data = 0;
		 while((data = in.read()) != -1) {
			 System.out.println((char)data);
		 }
	}

}
