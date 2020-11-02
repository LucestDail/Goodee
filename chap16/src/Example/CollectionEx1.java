package Example;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] strArr = {
			new Student("HongGD",60,75),
			new Student("KimSK",80,65),
			new Student("LeeMR",90,85),
			new Student("LeeJV",60,85)
		};
		System.out.println("save name to List<String>");
		List<String> names = Stream.of(strArr)
				.map(Student::getName)
				.collect(Collectors.toList());
		System.out.println(names);
		System.out.println("Stream<Student> => Student[] Object");
		Student[] stuArr2 = Stream.of(strArr).toArray(Student[]::new);
		for(Student s : stuArr2) {
			System.out.println(s);
		}
		
		System.out.println("save name as a key, create and save object to Map<String, Student>");
		Map<String, Student> map = Stream.of(strArr).collect(Collectors.toMap(s->s.getName(), s->s));
		for(Entry<String, Student> item : map.entrySet()) {
			System.out.println(item.getKey() + " : " + item.getValue());
		}
		
		
		System.out.println("save eng score to List<Integer>");
		List<Integer> engs = Stream.of(strArr).map(Student::getEng).collect(Collectors.toList());
		System.out.println(engs);
		
		System.out.println("save math to List<Integer>");
		List<Integer> maths = Stream.of(strArr).map(Student::getMath).collect(Collectors.toList());
		System.out.println(maths);
		
		System.out.println("save total to List<Integer>");
		List<Integer> totals = Stream.of(strArr).map(s->s.getMath() + s.getEng()).collect(Collectors.toList());
		System.out.println(totals);

		System.out.println("save total to List<Integer> sorting");
		List<Integer> totalsSorting = Stream.of(strArr).map(s->s.getEng() + s.getMath()).sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(totalsSorting);
		
	}

}
