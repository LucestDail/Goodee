package chap4;

public class LoopEx4 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("\n" + i + "dan");
			for(int j = 0; j < 10; j ++) {
				if(j == 3)
					continue;
				if(j == 5)
					break;
				System.out.println(i+ " * " + j + " = " + (i*j));
			}
		}
	}

}
