package Example;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * Supplier Interface
 * 매개 변수 없음, 리턴값 존재
 * T getXXX() 메소드를 추상 메소드로 가짐
 * @author ubuntu
 *
 */
public class LambdaEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s1 = () -> "java";
//		Supplier<String> s1 = () ->{
//			return "java";
//		};
		System.out.println(s1.get());
		IntSupplier s2 = () -> (int)(Math.random() *6) +1;
//		IntSupplier s2 () -> {
//			return (int)(Math.random() * 6) +1;
//		};
		System.out.println(s2.getAsInt());
		IntSupplier s3 = () -> {
			int sum = 0;
			for(int i = 0; i <= 100; i++) {
				sum += i;
			}
			return sum;
		};
		System.out.println(s3.getAsInt());
		
		double[] arr = {1.1,2.4,2.4,5.3,10.3};
		DoubleSupplier s4 = () -> {
			double sum = 0;
			for(double item : arr) {
				sum += item;
			}
			return sum;
		};
		System.out.println(s4.getAsDouble());
	}

}
