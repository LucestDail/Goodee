package Example;

import java.util.*;

public class FlatMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list1 = Arrays.asList(
				new Student("HongGD",70,80),
				new Student("JangGD",75,70)
				);
		List<Student> list2 = Arrays.asList(
				new Student("KimSK",90,88),
				new Student("KimGD",95,75)
				);
		List<List<Student>> list = new ArrayList<List<Student>>();
		list.add(list1);
		list.add(list2);
		list.stream().flatMap(s -> s.stream()).forEach(s -> System.out.println(s));

	}

}
