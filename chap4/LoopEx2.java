package chap4;

/*
 * �ݺ����� �̿��Ͽ� 1 ���� 10���� �� ���ϱ�
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
		// for �� �����ϰ� ���� ���������� ����� ���
		System.out.println("----------For Loop Testing----------");
		sum = 0;
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("For Loop result : " + sum);
			
		// for �� ����� ��� - �ڵ� ���꼺 ���

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
