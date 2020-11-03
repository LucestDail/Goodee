package Example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream Example
 * Saving data as a file
 * if file is not existed, create file
 * if file is existed, modify file
 * 
 * void write(int data) : print 1 byte
 * void write(byte[] buf) : print buf statement
 * void write(byte[] buf, int start, int len) : print statement from buf start index to len
 * 
 * we should throw exception as FileNotFoundException
 * in linux, user has an authorization part from normal user to root(chef authorized user)
 * when normal user has authorized 111(which has just access, not modify, not create, not delete, then, this source would not be work
 * so we should throw FileNotFoundException for this case 
 * @author ubuntu
 *
 */
public class FileOutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("out.txt file will be print");
		FileOutputStream fos = new FileOutputStream("out.txt");
		fos.write('1');
		fos.write('2');
		fos.write('3');
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.write('가');
		fos.write('나');
		fos.write('다');
		fos.write(' ');
		
		byte[] buf = "\n아웃풋 스트림 예제 출력\n".getBytes();
		fos.write(buf);
		fos.write(buf,1,6);
	}

}
