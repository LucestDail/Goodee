package chap6;

/*
 * 5. str ���ڿ��� ������ ���ĺ��� ������ ����Ͻÿ�
 * public class Test5 {
 * public static void main(String[] args) {
 * String str = "it is possible to draw a parallel between their experience and ours";
 * }
 * }
 * [���]
 * a:5��
 * b:2��
 * c:1��
 * d:2��
 * e:10��
 * h:1��
 * i:5��
 * l:4��
 * n:3��
 * o:3��
 * p:3��
 * r:5��
 * s:4��
 * t:4��
 * u:1��
 * w:2��
 * 
 * 
 * 
 * 
 */

public class Homework5 {

	public static void main(String[] args) {
		String str = "it is possible to draw a parallel between their experience and ours";
		char[] strToChar = str.toCharArray();
		int[] CharChecker = new int['z' - 'a'+1];
		System.out.println(CharChecker.length);
		for(int i = 0; i < strToChar.length;i++) {
			for(int j = 'a';j<='z';j++) {
				if(strToChar[i] == (char)j) {
					CharChecker[j-'a']++;
				}
			}
		}
		for(int i = (int)'a'; i <(int)'z' ;i++) {
			if(CharChecker[i-'a'] != 0) {
				System.out.println((char)i + " : " + CharChecker[i - (int)'a'] + "��");
			}
		}
	}
}
