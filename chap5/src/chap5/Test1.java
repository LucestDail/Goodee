package chap5;

import java.util.Arrays;
public class Test1 {
	public static void main(String[] args) {
		int randomArray[] = new int[3]; // ���� 3�� ���� ��
		boolean pass = false; // ���� �ߺ� ����Ȯ�� �� ��
		while(!pass) {
			for(int i = 0; i < randomArray.length;i++) {
				randomArray[i] = (int)(Math.random()*9)+1; // ���� 3�� ���� �� �迭 ��
			}
			if(randomArray[0] != randomArray[1] &&
					randomArray[1] != randomArray[2] &&
					randomArray[2] != randomArray[0]) {
				pass = true; // ��ü �迭�� �ߺ��� �ƴ� ��� while Ż
			}
		}
		Arrays.sort(randomArray);
		for(int item : randomArray) {
			System.out.print(item + " ");
		}
	}
}