package Test1102;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Test2 {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		System.out.println("읽으려는 파일 명을 입력하세요(확장자 생략)");
		Scanner scan = new Scanner(System.in);
		String targetFile = scan.next();
		sb.append(targetFile + ".txt");
		try {
			FileInputStream fis = new FileInputStream(sb.toString());
			byte[] buf = new byte[fis.available()];
			int data = 0;
			while ((data = fis.read(buf)) != -1) {
				System.out.print(new String(buf, 0, data));
			}
		} catch (IOException e) {
			System.out.println("해당 파일 없음");
			return;
		}
	}
	

}
