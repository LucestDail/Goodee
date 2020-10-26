package Example;
/**
 * 추상메소드의 매개변수가 있고, 리턴타입이 없는 경우
 * (매개변수) -> {......}
 * 매개 변수의 갯수가 한개인 경우 () 생략 가능
 * 실행 구문이 한 문장인 경우 {} 생략 가능
 * @author GDJ30
 *
 */
@FunctionalInterface
interface LambdaInterface3{
	void method(int a);
}

public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LambdaInterface3 fi = (a)->{
			System.out.println(a*5);
		};
		fi.method(2);
		fi.method(10);
		fi = x -> System.out.println((x + x));
		fi.method(2);
		fi.method(10);
		System.out.println("===========");
		calc((x) -> System.out.println(x + x));
		calc((x) -> System.out.println(x*x));
	}
	
	static void calc(LambdaInterface3 f) {
		f.method(10);
	}

}
