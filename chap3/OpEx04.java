package chap3;


import java.util.*;

public class OpEx04 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("�غ��� ���� : ");
		int base = scan.nextInt();
		System.out.println("������ ���� : ");
		int height = scan.nextInt();
		double result = (base * height)/2d;
		System.out.println(result);
	}
}