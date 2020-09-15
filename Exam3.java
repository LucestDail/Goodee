package chap3;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("input your money");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int target = scan.nextInt();
		int fivebaek = target / 500;
		int last = target % 500;
		int baek = last / 100;
		last %= 100;
		int fiveship = last / 50;
		last %= 50;
		int ship = last / 10;
		last %= 10;
		System.out.println("500 : " + fivebaek +
				" / 100 : "  + baek +
				" / 50 : " + fiveship + 
				" / 10 : " + ship +
				" / 1 : " + last);
	}
}
