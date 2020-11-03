package Example;
/**
 * PrintStream class printf method example
 * @author ubuntu
 *
 */
public class PrintStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%c%n", 'A');
		System.out.printf("%5c%n", 'A'); // right side
		System.out.printf("%-5c%n", 'A'); // left side
		System.out.printf("%d%n",12345);
		System.out.printf("%10d%n",12345);
		System.out.printf("%,10d%n",12345);
		System.out.printf("%-,10d%n", 12345);
		System.out.printf("%010d%n", 12345);
		System.out.printf("%o%n", 12345);
		System.out.printf("%o%n", 10);
		System.out.printf("%x%n", 10); //a
		System.out.printf("%X%n", 10); //A
		// 실수 형식 지정 문자
		System.out.printf("%f%n", Math.PI);
		System.out.printf("%.2f%n", Math.PI);
		System.out.printf("%10.2f%n", Math.PI);
		System.out.printf("%,10.2f%n", Math.PI);
		System.out.printf("%-,10.2f%n", Math.PI);
		System.out.printf("%010.2f%n", Math.PI);
		System.out.printf("%e%n", Math.E);
		System.out.printf("%b%n", true);
		System.out.printf("%b%n", false);
		System.out.printf("%b%n", !true);
		System.out.printf("%b%n", !false);
		System.out.printf("(2>3) == %b%n",(2>3));
		System.out.printf("%s%n", "hello");
		System.out.printf("10진수 %d는 8진수 %o이고, 16진수 %X 다", 255,255,255);
	}
}
