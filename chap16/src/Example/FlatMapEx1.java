package Example;
/**
 * flatMap : Stream 구조를 변경(Stream -> Stream)
 * flatMapToInt : Strema -> IntStream
 */
import java.util.*;
import java.util.stream.IntStream;

public class FlatMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("java 8 version","added Stream","lets learn");
		list1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(System.out::println);
		System.out.println();
		List<String> list2 = Arrays.asList("10,20,30","40,50,60");
		//flatMapToInt : IntStream 으로 리턴
		IntStream isr = list2.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for(int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		});
//		isr.forEach(n ->System.out.println(n));
		//Total sum print
//		System.out.println("sum" + isr.sum());
//		System.out.println("count : " + isr.count());
		System.out.println("average : " + isr.average().getAsDouble());
	}

}
