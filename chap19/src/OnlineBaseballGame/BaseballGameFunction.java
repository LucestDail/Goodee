package OnlineBaseballGame;

import java.util.Scanner;

public class BaseballGameFunction {
	int[] array;
	Scanner scan = new Scanner(System.in);
	ConstValue c = new ConstValue();
	BaseballGameFunction(int[] array){
		this.array = array;
	}

	public void BaseballGame() {
		int count = 0;
		boolean end = false;
		int inputArray[] = new int[c.MAXNUM];
		while (!end) {
			int ballCount = 0;
			int strikeCount = 0;
			System.out.println("���� �ٸ� 4�ڸ� ������ �Է��ϼ���");
			String input = scan.next();
			count++;
			// �Է� ���� ���� �迭�� ����
			for (int i = 0; i < input.length(); i++) {
				inputArray[i] = input.charAt(i) - '0';
			}
			for (int i = 0; i < this.array.length; i++) {
				if (this.array[i] == inputArray[i]) {
					strikeCount++;
				} else {
					ballCount++;
				}
			}
			if (strikeCount == 4) {
				System.out.println(input + " : �����Դϴ�.");
				System.out.println(count + "�� ���� ���߼̽��ϴ�. ������ �����մϴ�.");
				end = true;
			} else {
				System.out.println(input + " : " + strikeCount + "��Ʈ����, " + ballCount + "��");
			}
		}
	}

}
