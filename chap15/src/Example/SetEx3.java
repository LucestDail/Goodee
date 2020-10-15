package Example;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet 예제
 * Set 인터페이스의 하위 인터페이스 SortedSet 구현 클래스입니다.
 * @author GDJ30
 *
 */
public class SetEx3 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//Set<String> set = new TreeSet<>();
		//SortedSet<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("elev");
		set.add("fan");
		set.add("flower");
		System.out.println(set);
		System.out.println("from : " + from + ", to : "+ to);
		System.out.println(set.subSet(from,  to));
		System.out.println("from : " + from + ", to : " + to + "zzzz");
		System.out.println(set.subSet(from,  to + "zzzz"));
		
	}

}
