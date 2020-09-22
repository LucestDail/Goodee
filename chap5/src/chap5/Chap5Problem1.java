package chap5;

public class Chap5Problem1 {
	public static void main(String[] args) {
		for(int i = 2; i < 6; i ++) {
			System.out.print(i + "´Ü\t");
		}
		System.out.println("");
		for(int i = 2; i < 10; i ++) {
			for(int j = 2; j < 6; j++) {
				System.out.print(j + "*" + i + "=" + (i+j) + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
		for(int i = 6; i < 10; i ++) {
			System.out.print(i + "´Ü\t");

		}
		System.out.println("");
		for(int i = 2; i < 10; i ++) {
			for(int j = 6; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (i+j) + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
