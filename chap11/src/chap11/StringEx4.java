package chap11;

public class StringEx4 {

	public static void main(String[] args) {
		int i = Integer.parseInt("100");
		System.out.println(i + 1); // 정수열 <= 문자열
		double d = Double.parseDouble("100.5");
		System.out.println(d + 0.1);
		float f = Float.parseFloat("0.1");
		System.out.println(f + 0.1);
		System.out.println(++i);
		System.out.println(++d);
		System.out.println(++f);
		String binary = Integer.toBinaryString(i);
		System.out.println(binary);
		String octal = Integer.toOctalString(i);
		System.out.println(octal);
		String hex = Integer.toHexString(i);
		System.out.println(hex);
		hex = Double.toHexString(d);
		System.out.println(binary);//???????
	}

}
