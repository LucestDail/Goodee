package chap4;

public class LoopEx1 {

	public static void main(String[] args) {
		System.out.println("----------Nan-Loop Testing----------");
		int count = 0;
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		// for 문 사용안하고 후위 증감연산자 사용할 경우
		System.out.println("----------For Loop Testing----------");
		for (int i = 0; i < 5; i++)
			System.out.println(i);
		// for 문 사용할 경우 - 코드 생산성 상승

		System.out.println("----------While Loop Testing----------");
		count = 0;
		while (count < 5) {
			System.out.println(count++);
		}
		System.out.println("----------Do-While Loop Testing----------");
		count = 0;
		do {
			System.out.println(count++);
		}while(count < 5);
	}
}
