package Exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input your file name");
		String fileName = stdin.readLine();
		System.out.println("input print starting line, and print lines");
		String stdnum = stdin.readLine();
		String[] strnum = stdnum.split(" ");
		int start = Integer.parseInt(strnum[0].trim());
		int len = Integer.parseInt(strnum[1].trim());
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		int line = 0;
		String data = null;
		int cnt = 0;
		while ((data = br.readLine()) != null) {
			++line;
			if (line < start) {
				continue;
			}
			if (cnt >= len) {
				break;
			}
			++cnt;
			System.out.println(line + " : " + data);
		}
		br.close();
	}
}
