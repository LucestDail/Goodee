package chap4;

public class LoopEx3 {

	public static void main(String[] args) {
		int max = 10;
		for (int i = 0; i < max; i++) {
			System.out.println(i + "dan");
			for (int j = 0; j < max; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}

	}

}
