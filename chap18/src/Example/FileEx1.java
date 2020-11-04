package Example;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "../chap18/src/Example";
		File f1 = new File(filePath);
		String[] files = f1.list();
		for(String f : files) {
			File f2 = new File(filePath,f);
			if(f2.isDirectory()) {
				System.out.printf("%s : Directory%n", f);
			}else {
				System.out.printf("%s : File(%,dbyte)%n", f,f2.length());
			}
		}

	}

}
