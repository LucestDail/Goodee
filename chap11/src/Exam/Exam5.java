package Exam;

public class Exam5 {
	public static void main(String[] args) {
		String s1 = "HTML-CSS-JavaScript-JAVA-JSP-������";
		String s2 = "ȫ�浿, ���,�̸���,������,�Ӳ���,�����";
		String[] s1array = s1.split("-");
		String[] s2array = s2.split(",");
		for(int i = 0; i < s1array.length; i++) {
			System.out.println(s1array[i] +"=>" +s2array[i]);
		}
	}

}
