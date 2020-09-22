package chap4;

/*
 * 반복문을 이용하여 1 부터 10까지 합 구하기
 * 
 * 
 */
public class LoopEx2 {

	public static void main(String[] args) {
		System.out.println("----------Nan-Loop Testing----------");
		int count = 0;
		int sum = 0;
		System.out.println(count++);sum += count;
		System.out.println(count++);sum += count;
		System.out.println(count++);sum += count;
		System.out.println(count++);sum += count;
		System.out.println(count++);sum += count;
		System.out.println(count++);sum += count;
		System.out.println(count++);sum += count;
		System.out.println(count++);sum += count;
		System.out.println(count++);sum += count;
		System.out.println(count++);sum += count;
		System.out.println("Nan Loop result : " + sum);
		// for 문 사용안하고 후위 증감연산자 사용할 경우
		System.out.println("----------For Loop Testing----------");
		sum = 0;
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("For Loop result : " + sum);
			
		// for 문 사용할 경우 - 코드 생산성 상승

		System.out.println("----------While Loop Testing----------");
		sum = 0;
		count = 0;
		while (count < 10) {
			System.out.println(count++);
			sum += count;
		}
		System.out.println("While Loop result : " + sum);
		
		System.out.println("----------Do-While Loop Testing----------");
		sum = 0;
		count = 0;
		do {
			System.out.println(count++);
			sum += count;
		}while(count < 10);
		System.out.println("Do-While Loop result : " + sum);
	}
}
