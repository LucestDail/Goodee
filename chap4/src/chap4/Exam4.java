package chap4;

/*
 * 1���� 100���� ¦���� ��
 * 
 * 
 * 
 */
public class Exam4 {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int max = 101;
		int start = 0;
		// for �� �����ϰ� ���� ���������� ����� ���
		System.out.println("----------For Loop Testing----------");
		for (int i = start; i < max; i++) {
			if(i%2 == 0)
				sum += i;
			else
				continue;
		}
		System.out.println("For Loop result : " + sum);
			
		// for �� ����� ��� - �ڵ� ���꼺 ���

		System.out.println("----------While Loop Testing----------");
		sum = 0;
		count = 0;
		while (count < max) {
			if(count%2 == 0)
				sum += count;
			count++;
		}
		System.out.println("While Loop result : " + sum);
		
		System.out.println("----------Do-While Loop Testing----------");
		sum = 0;
		count = 0;
		do {
			if(count%2 == 0)
				sum += count;
			count++;
		}while(count < max);
		System.out.println("Do-While Loop result : " + sum);
	}

}
