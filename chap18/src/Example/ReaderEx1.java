package Example;

import java.io.*;

public class ReaderEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader in = new InputStreamReader(System.in); //2바이트 단위로 읽음
		int data;
		while((data = in.read()) != -1) {
			System.out.print((char)data);
		}
	}

}
