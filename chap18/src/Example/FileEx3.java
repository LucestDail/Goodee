package Example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileEx3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		System.out.println("Input your file name except txt");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String fileName = stdin.readLine();
		StringBuffer sb = new StringBuffer();
		sb.append(fileName +".txt");
		File f = new File(sb.toString());
		if(!f.exists()) {
			System.out.println("file is not existed");
			return;
		}
		FileInputStream fis = new FileInputStream(f);
		int len;
		byte[] buf = new byte[8096];
		while((len = fis.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
		fis.close();
		System.out.println("you want to delete this file?(y/n)");
		String deleteSelect = stdin.readLine();
		if(deleteSelect.equals("y")) {
			f.delete();
			System.out.println(sb.toString() + "has been removed");
		}else {
			System.out.println(sb.toString() + "has been remained");
			return;
		}
	}

}
