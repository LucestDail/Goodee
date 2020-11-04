package Test1103;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Input your file name.txt(terminating : input \"exit\"");
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			String inputKeyword = stdin.readLine();
			if(inputKeyword.equals("exit")) {
				break;
			}
			try {
				int lastdot = inputKeyword.lastIndexOf(".");
				if(lastdot < 0) {
					System.out.println("Wrong file format.");
					continue;
				}
				String fileName = inputKeyword.substring(0, lastdot);
				BufferedReader fileIn = new BufferedReader(new FileReader(inputKeyword));
				StringBuffer sb = new StringBuffer(fileName + ".bak");
				FileWriter fw = new FileWriter(sb.toString());
				String data = null;
				while((data = fileIn.readLine()) != null) {
					System.out.println(data);
					fw.write(data + "\n");
				}
				fw.flush();
				fw.close();
				fileIn.close();
				System.out.println(inputKeyword + " => " + sb.toString() + " copy complete");
			} catch (IOException e) {
				e.getStackTrace();
				System.out.println(e + "\n====================File is not existed====================");
			}
		}
	}
}