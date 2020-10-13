package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam12 {

	public static void main(String[] args) {
		String[] patterns = {
				".", // ���� �ϳ�
				"[0-9]",//���� ���� �Ѱ�
				"[a-z]?", //�ҹ��ڰ� 0�� Ȥ�� 1��
				"[0-9]+", //���ڰ� 1�� �̻�
				"^[0-9]", // ���ڷ� �����ϴ� ���ڿ�
				"[^0-9]", //^(����) ���ڿ� ����
				"[a-z]*", //�ҹ��� 0�� �̻�
				"[a-z]+", // �ҹ��ڰ� 1�� �̻�
				"02|010", //02 �̰ų�, 010 �̰ų�
				"\\w&{0,}",//Ư�����ڰ� �ƴϰ� 1�ڸ� �̻��� ����
				"{3}", // 3�ڸ� ����
				"{2,}", //�ּ� 2�ڸ� ����
				"{1,3}", // 1�ڸ� ~ 3�ڸ� ����
				"\\s", //������ ����
				"\\S", // ������ �ƴ� ����
				"\\d", // ������ ����
				"\\D", // ���ڰ� �ƴ� ����
				"\\w", // �빮�� �ҹ��� ���� �� Ư����ȣ�� �ƴ� �Ϲݹ���
				"\\W"//Ư������
				
		};
		String str = "Java   and JSP and  Spring and HTML and JavaScript and Jquery";
		String pattern = "([a-zA-Z]*)\\s*and\\s*([a-zA-Z]*)\\s*and\\s*([a-zA-Z]*)\\s*and\\s*([a-zA-Z]*)\\s*and\\s*([a-zA-Z]*)\\s*and\\s*([a-zA-Z]*)";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		System.out.println("regex solution");
		int i = 0;
		while(m.find()) {
			System.out.println(m.group(1) + " " + m.group(2) + " " + m.group(3)+ " " + m.group(4)+ " " + m.group(5)+ " " + m.group(6));
		}
		System.out.println("split solution");
		//////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////
		String names = "Java   and JSP and  Spring and HTML and JavaScript and Jquery";
		String[] arr = names.split("\\s*and\\s*");
		for(String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("delimiter solution");
		//////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*");
		while(scan.hasNext()) {
			System.out.print(scan.next() + " ");
		}
	}

}
