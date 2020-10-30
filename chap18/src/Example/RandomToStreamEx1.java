package Example;

import java.util.Random;

public class RandomToStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Generate Int 3 of type random number");
		new Random().ints(3).forEach(s -> System.out.print(s + " "));
		System.out.println();

		System.out.println("I want to use 10 of random int number which has a range between 0 to 2!");
		new Random().ints(10, 0, 3).forEach(s -> System.out.print(s + " "));
		System.out.println();

		System.out.println("I want to use 3 of random Long number!");
		new Random().longs(3).forEach(s -> System.out.print(s + " "));
		System.out.println();

		System.out.println("I want to use 3 of random Long number which has a range between 0 to 9!");
		new Random().longs(3, 0, 9).forEach(s -> System.out.print(s + " "));
		System.out.println();

		System.out.println("i want to get 3 of random char type word");
		new Random().ints(3, 'A', 'Z' + 1).forEach(s -> System.out.print((char) s + " "));
		System.out.println();

		System.out.println("I want to get 3 of random double type number");
		new Random().doubles(3).forEach(s -> System.out.print(s + " "));
	}

}
