package Example;
/**
 * boxed() : intStream -> Stream<Integer>
 * asLongStream() : IntStream => LongStream
 * asDoubleStream() : IntStream => DoubleStream
 * @author ubuntu
 *
 */
import java.util.*;
public class BoxStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60};
		System.out.println("IntStream -> Stream<Integer>");
		Arrays.stream(arr).boxed().forEach(i -> System.out.println(i.hashCode()));
		Integer arr2[] = {10,20,30,40,50,60};
		System.out.println("Integer -> intStream");
		Arrays.stream(arr2).forEach(i -> System.out.println(i.hashCode()));
		int sum = Arrays.stream(arr2).mapToInt(a -> a.intValue()).sum();
		System.out.println("sum : " + sum);
		System.out.println("intStream -> LongStream");
		Arrays.stream(arr).asLongStream().forEach(i -> System.out.println(i));
		System.out.println("intStream -> DoubleStream");
		Arrays.stream(arr).asDoubleStream().forEach(i -> System.out.println(i));

	}

}
