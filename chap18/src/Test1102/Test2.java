package Test1102;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Test2 {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		System.out.println("�������� ���� ���� �Է��ϼ���(Ȯ���� ����)");
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
			System.out.println("�ش� ���� ����");
			return;
		}
	}
	

}
