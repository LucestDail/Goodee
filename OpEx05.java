package chap3;

import java.util.Scanner;

public class OpEx05 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		System.out.println("������ : ");
		double pi = 3.141592;
		double Radius = Scan.nextDouble();
		
		double Circumference = Radius * Radius * pi;
		double Width = Radius * 2d * pi;
		System.out.println("���� : " + Circumference);
		System.out.println("�ѷ� : " + Width);
	}
}