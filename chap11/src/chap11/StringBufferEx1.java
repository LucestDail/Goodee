package chap11;

public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		if(sb1 == sb2) System.out.println("sb1 - sb2 : same object");
		else System.out.println("sb1 - sb2 : not same object");
		if(sb1.equals(sb2)) System.out.println("sb1 - sb2 : same value");
		else System.out.println("sb1 - sb2 : not same value");
		if(sb1.toString().equals(sb2.toString())) System.out.println("sb1 - sb2 : same value");
		else System.out.println("sb1 - sb2 : not same value");
	}

}
