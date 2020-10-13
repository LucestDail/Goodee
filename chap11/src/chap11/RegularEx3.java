package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {

	public static void main(String[] args) {
		String source = "�ڵ���:010-1111-1111,��:02-123-5678,"+
	"�̸���:regular@aaa.bbb,���¹�ȣ:301-12-123456";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		int i = 0;
		System.out.print("��ȭ��ȣ : ");
		while(m.find()) {
			System.out.println(++i + " : " + m.group() + " -> " + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		
		pattern = "(\\d{3})-(\\d{2})-(\\d{6})";
		p = Pattern.compile(pattern);
		m = p.matcher(source);
		i = 0;
		System.out.print("���¹�ȣ : ");
		while(m.find()) {
			System.out.println(++i + " : " + m.group() + " -> " + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		
		pattern = "([a-zA-Z]*)@([a-zA-z]*).([a-zA-Z]*)";
		p = Pattern.compile(pattern);
		m = p.matcher(source);
		i = 0;
		System.out.print("�̸��� : ");
		while(m.find()) {
			System.out.println(++i + " : " + m.group() + " -> " + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		

	}

}
