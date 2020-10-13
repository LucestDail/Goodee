package chap11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("C:\\Users\\GDJ30\\eclipse-workspace\\chap11\\score.txt"));
		int cnt = 0;
		int totalSum = 0;
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			Scanner scan2 = new Scanner(line);
			scan2 = scan2.useDelimiter(",");
			double sum = 0;
			int i = 0;
			String name = scan2.next();
			System.out.print(name + " : ");
			while(scan2.hasNextDouble()) {
				double score = scan2.nextDouble();
				sum += score;
				System.out.print(score + ",");
				i++;
			}
			System.out.printf("sum = %.1f, avg = %.2f\n",sum,sum/i);
			cnt++;
		}
		System.out.println("시험 응시 인원 : "+ cnt);
		
	}

}
