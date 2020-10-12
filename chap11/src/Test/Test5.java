package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		//Scanner ���
		Scanner scan = new Scanner(System.in);
		
		//���� ����
		final String formatString = "yyyy-MM-dd";
		SimpleDateFormat sf = new SimpleDateFormat(formatString);
		
		//���� ��¥ �Է�
		System.out.println("ù��° ��¥�� �Է��ϼ���...(2020�� 6�� 1�� -> 2020-06-01)");
		String targetDay = scan.next();
		
		//�� ��¥ �Է�
		System.out.println("�ι�° ��¥�� �Է��ϼ���...(2020�� 6�� 3�� -> 2020-06-02)");
		String compareDay = scan.next();
		
		//Date ��ü ����
		Date targetDate = new Date();
		Date compareDate = new Date();
		
		//initialize
		targetDate = null;
		compareDate = null;
		
		//parsing
		try {
			targetDate = sf.parse(targetDay);
			compareDate = sf.parse(compareDay);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//int �� ���� �ʰ��ϹǷ� long ���� ��� ��ȯ
		long result = (compareDate.getTime() - targetDate.getTime())/(1000*60*60*24);
		System.out.println(result);
		
	}
}
