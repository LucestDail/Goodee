package chap6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("�ݾ��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int won500 = 5;
		int won100 = 5;
		int won50 = 5;
		int won10 = 5;
		int won5 = 5;
		int won1 = 5;
		if(input > 3330) {
			System.out.println("������ �����մϴ�.");
		}else {
			if(input > 500*5) {
				input -= 500*5;
				won500 =0;
			}else {
				won500 -= input/500;
				input %= 500;
			}
			System.out.println("500��:" + (won500));
			if(input > 100*5) {
				input -= 100*5;
				won100 =0;
			}else {
				won100 -= input/100;
				input %= 100;
			}
			System.out.println("100��:" + (won100));
			if(input > 50*5) {
				input -= 50*5;
				won50 =0;				
			}else {
				won50 -= input/50;
				input %= 50;
			}
			System.out.println("50��:" + (won50));
			if(input > 10*5) {
				input -= 10*5;
				won10 =0;
				
			}else {
				won10 -= input/10;
				input %= 10;
			}
			System.out.println("10��:" + (won10));
			if(input > 5*5) {
				input -= 5*5;
				won5 =0;
				
			}else {
				won5 -= input/5;
				input %= 5;
			}
			System.out.println("5��:" + (won5));
			for(int i = 0; i < input; i ++) {
				won1--;
			}
			System.out.println("1��:" + (won1));
			System.out.println("���� ���� 500��:" + won500 + "��");
			System.out.println("���� ���� 100��:" + won100 + "��");
			System.out.println("���� ���� 50��:" + won50 + "��");
			System.out.println("���� ���� 10��:" + won10 + "��");
			System.out.println("���� ���� 5��:" + won5 + "��");
			System.out.println("���� ���� 1��:" + won1 + "��");
		}
	}

}
