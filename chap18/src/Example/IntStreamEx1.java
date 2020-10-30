package Example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		System.out.println("Arrays.stream -> IntStream");
		IntStream is1 = Arrays.stream(arr);
		is1.forEach(System.out::print); //method reference
		//Stream.forEach(Consumer)
		//Consumer 인터페이스 : FunctionalInterface, 매개변수가 있다. 리턴값 없다... 컨슘(소비)해버리기 때문에!!!
//		is1.forEach(i -> System.out.print(i)); //method call
		System.out.println();
		
		System.out.println("IntStream.of -> IntStream");
		IntStream is2 = IntStream.of(arr);
		is2.forEach(s->System.out.print(s + " "));
		System.out.println();
		
		System.out.println("IntStream.range(1,11) -> IntStream(1~10 print)");
		IntStream is3 = IntStream.range(1,11);
		is3.forEach(s->System.out.print(s + " "));
		System.out.println();
		
		System.out.println("IntStream.rangeClosed(1,11) -> IntStream(1~11 print)");
       IntStream is4 = IntStream.rangeClosed(1,11);
       is4.forEach(s->System.out.print(s+ " "));
       System.out.println();
       
       System.out.println("IntStream.range[Closed](1,[101]100).sum -> IntStream(1~100 sumation)");
       System.out.println(IntStream.range(1, 101).sum());
       System.out.println(IntStream.rangeClosed(1,100).sum());
       
       System.out.println("IntStream.range[Closed](1,[101]100).filter.sum -> IntStream(1~100 even sumation)");
       System.out.println(IntStream.range(1, 101).filter(i -> i%2 == 0).sum());
       System.out.println(IntStream.rangeClosed(1,100).filter(i -> i%2 == 0).sum());
       System.out.println();
       
       System.out.println("IntStream.range[Closed](1,[101]100).filter.sum -> IntStream(1~100 odd sumation)");
       System.out.println(IntStream.range(1, 101).filter(i -> i%2 == 1).sum());
       System.out.println(IntStream.rangeClosed(1,100).filter(i -> i%2 == 1).sum());
       System.out.println();
       
       System.out.println("1 ~ 100 Even counting");
       System.out.println(IntStream.rangeClosed(1, 100).filter(i -> i%2 == 0).count());
       System.out.println(IntStream.range(1, 101).filter(i -> i%2 == 0).count());
       System.out.println();

       
       System.out.println("1 ~ 100 Odd counting");
       System.out.println(IntStream.rangeClosed(1, 100).filter(i -> i%2 == 1).count());
       System.out.println(IntStream.range(1, 101).filter(i -> i%2 == 1).count());
       System.out.println();

       System.out.println("1 ~ 100 Average");
       System.out.println(IntStream.rangeClosed(1, 100).average().getAsDouble());
       System.out.println(IntStream.range(1, 101).average().getAsDouble());
       System.out.println();
       
       System.out.println("1 ~ 100 Even Average");
       System.out.println(IntStream.rangeClosed(1, 100).filter(i -> i%2 == 0).average().getAsDouble());
       System.out.println(IntStream.range(1, 101).filter(i -> i%2 == 0).average().getAsDouble());
       System.out.println();

       System.out.println("1 ~ 100 Odd Average");
       System.out.println(IntStream.rangeClosed(1, 100).filter(i -> i%2 == 1).average().getAsDouble());
       System.out.println(IntStream.range(1, 101).filter(i -> i%2 == 1).average().getAsDouble());
       System.out.println();
	}

}
