package Example;
/**
 * 람다식 예제 : jdk8.0 이후부터 사용이 가능
 * 람다식에서 사용되는 인터페이스는 FunctionalInterface 여야만 합니다.
 * FunctionalInterface : 추상메소드가 한개만 존재하는 메소드
 * 추상 메소드의 매개변수가 없고, 리턴타입도 없는 경우
 * () -> {......}
 * 람다식 내부에서 실행되는 구문이 1개뿐인 경우는 {} 생략이 가능
 * @author GDJ30
 */
@FunctionalInterface // => 어노테이션
interface LambdaInterface1{
	void method();
}


public class LambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaInterface1 fi = new LambdaInterface1() {
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("기존 방식으로 코딩");
				
			}
		};
		fi.method();
		
		fi = ()->{
			String str = "이건 람다방식";
			System.out.println(str);
		};
		fi.method();
		
		fi = ()->System.out.println("또다른 람다 방식");
		fi.method();
		execute(()->System.out.println("이것이 람다의 세계"));
	}
	static void execute(LambdaInterface1 f) {
		f.method();
	}

}
