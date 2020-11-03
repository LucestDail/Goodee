package Example;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter Example
 * Create File with test type data
 * 
 * method
 * void write(int data) : printing 2 byte
 * void write(char[] buf) : printing buf statement
 * void write(char[] buf, int start, int len) : printing from buf start index to len
 * void write(String data) : printing String data
 * @author ubuntu
 *
 */
public class FileWriterEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("out2.txt file will be printing");
		FileWriter fos = new FileWriter("out2.txt");
		fos.write('1');
		fos.write('2');
		fos.write('3');
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.write('가');
		fos.write('나');
		fos.write('다');
		char[] buf = "\n fileWriter 예제 출력중\n".toCharArray();
		fos.write(buf);
		fos.write(buf,1,11);
		fos.write("hello, 파일 출력중입니다.");
		fos.flush();
	}

}
