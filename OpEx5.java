package chap3;
/*
 * String 클래스 + 연산
 * 
 * 
 */
public class OpEx5 {
	public static void main(String[] args) {
		String str = "number";
		String str2 = new String("number");
		str2 += str;
		System.out.println(str2 + str + 1 + 2 + 3);
		System.out.println(1 + 2 + 3+str2);
	}
}
