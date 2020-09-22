package chap4;

public class Exam7 {

	public static void main(String[] args) {
		int sum = 0;
		int total = 0;
		for (int i = 0; i < 101; i++) {
			total += i;

			if (i % 2 == 0) {
				continue;
			} else {
				if (i % 3 == 0) {
					continue;
				} else {
					sum += i;
				}
			}
		}
		System.out.println("total sum : " + total);
		System.out.println("condition sum : " + sum);
	}

}
