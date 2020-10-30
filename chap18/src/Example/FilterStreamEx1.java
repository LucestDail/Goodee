package Example;

import java.util.Arrays;
import java.util.*;
public class FilterStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList(
				"hongKD", "kimSK","hongKD","limKJ","hongKD","kimJV","parkJV"
				);
		System.out.println("I want to see whole of name just one time, except same name");
		list.stream().distinct().forEach(s->System.out.print(s + " "));
		System.out.println();
		
		System.out.println("I want to know how many 'hong' do i have");
		list.stream().filter(s -> s.startsWith("hong")).forEach(s->System.out.print(s + " "));
		System.out.println();

		System.out.println("I want to know how many 'hong' do i have and want to see just once");
		list.stream().filter(s -> s.startsWith("hong")).distinct().forEach(s->System.out.print(s + " "));
		System.out.println();

		System.out.println("I want to know how many 'JV' named do i have");
		list.stream().filter(s -> s.endsWith("JV")).forEach(s->System.out.print(s + " "));
		System.out.println();
		
	}

}
