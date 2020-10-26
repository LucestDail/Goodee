package Example;
/**
 * �Ű������� �ְ�, ���ϰ��� �ִ� ���
 * @author GDJ30
 *
 */

@FunctionalInterface
interface LambdaInterface4{
	int method(int x, int y);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		LambdaInterface4 f = (x,y)->{
			return x*y;
		};
		int a = 2;
		int b = 5;
		System.out.println("�� �� "+a+", "+b+"�� �� : " + f.method(a, b));
		f = (x,y) -> x+y;
		System.out.println("�� �� "+a+", "+b+"�� �� : " + f.method(a, b));
		f = (x,y) -> x-y;
		System.out.println("�� �� "+a+", "+b+"�� �� : " + f.method(a, b));
		f = (x,y) -> x%y;
		System.out.println("�� �� "+a+", "+b+"�� ������ ���� �� ������ : " + f.method(a, b));
		f = (x,y) -> x>y ? x : y;
		System.out.println("�� �� "+a+", "+b+" �� ū�� : " + f.method(a, b));
		f = (x,y) -> x>y ? y : x;
		System.out.println("�� �� "+a+", "+b+" �� ������ : " + f.method(a, b));
	}

}
