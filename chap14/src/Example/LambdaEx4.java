package Example;
/**
 * 매개변수도 있고, 리턴값도 있는 경우
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
		System.out.println("두 수 "+a+", "+b+"의 곱 : " + f.method(a, b));
		f = (x,y) -> x+y;
		System.out.println("두 수 "+a+", "+b+"의 합 : " + f.method(a, b));
		f = (x,y) -> x-y;
		System.out.println("두 수 "+a+", "+b+"의 차 : " + f.method(a, b));
		f = (x,y) -> x%y;
		System.out.println("두 수 "+a+", "+b+"의 나누기 연산 후 나머지 : " + f.method(a, b));
		f = (x,y) -> x>y ? x : y;
		System.out.println("두 수 "+a+", "+b+" 중 큰수 : " + f.method(a, b));
		f = (x,y) -> x>y ? y : x;
		System.out.println("두 수 "+a+", "+b+" 중 작은수 : " + f.method(a, b));
	}

}
