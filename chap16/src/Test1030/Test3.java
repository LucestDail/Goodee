package Test1030;

import java.util.Arrays;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList(
				"This is a Java book",
				"Lambda Expressions",
				"Java8 supports lambda Expressions"
				);
		list.stream()
		.flatMap(data -> Arrays.stream(data.split(" ")))
		.distinct()
		.sorted((l1,l2)->l1.compareTo(l2))
		.forEach(System.out::println);
		
	}

}
