package Example;

import java.util.*;

public class SortedEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("HongGD","KimSK","LeeMR","LimKJ");
		list.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println("reversing Order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
		

	}

}
