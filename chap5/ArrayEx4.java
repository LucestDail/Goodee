package chap5;

public class ArrayEx4 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("command ���� �Ķ���� �Է�");
			System.out.println("java chap5.ArrayEx4 blabla");
		}
		for (String a : args) {
			System.out.println(a);
		}

	}

}
