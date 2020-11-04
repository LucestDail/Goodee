package Example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
	public static void main(String[] args) throws IOException {
		
		String filePath = "../chap18/src/Example";
		File f1 = new File(filePath);
		String[] files = f1.list();
		System.out.println("====================your file list====================");
		for(String f : files) {
			File f2 = new File(filePath,f);
			if(!f2.isDirectory()) {
				System.out.printf("%s : %,dbyte%n", f,f2.length());
			}
		}
		System.out.println("Input your file name keyword which you want to copy except txt");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String fileName = stdin.readLine();
		String targetRegex = "[\\w]*.java$";
		for(String f : files) {
			File f2 = new File(filePath,f);
			if(f2.getName().matches(targetRegex) && f2.getName().contains(fileName)) {
				System.out.printf("%s : matching%n", f2);
				BufferedReader fileIn = new BufferedReader(new FileReader(f2.getAbsolutePath()));
				int lastdot = f2.getName().lastIndexOf(".");
				StringBuffer sb = new StringBuffer(f2.getName().substring(0, lastdot) + ".txt");
				FileWriter fw = new FileWriter(sb.toString());
				String data = null;
				while((data = fileIn.readLine()) != null) {
					fw.write(data + "\n");
				}
				fw.flush();
				System.out.println(f2.getName() + " => " + sb.toString() + " copy complete");
			}
		}
	}
}
