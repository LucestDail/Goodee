package chap3;
/* 
 * 2020.09.15, 10:30
 * ���� ������ �׽��� ������Ʈ
 * 
 * 
 * 
 * 
 * 
 */

public class OpEx1 {

	public static void main(String[] args) {
		int x = 5, y = 5;
		x++;
		y--;
		System.out.println("x = " + x + ", y = " + y);
		++x;
		--y;
		System.out.println("x = " + x + ", y = " + y);
		x = y = 5;
		y = ++x;
		System.out.println("x = " + x + ", y = " + y);
		x = y = 5;
		y = x++;
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("x = " + x++);
		System.out.println("x = " + ++x);
	}
}
