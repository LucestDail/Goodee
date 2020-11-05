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
			System.out.println("서로 다른 4자리 정수를 입력하세요");
			String input = scan.next();
			count++;
			// 입력 받은 정수 배열에 삽입
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
				System.out.println(input + " : 정답입니다.");
				System.out.println(count + "번 만에 맞추셨습니다. 게임을 종료합니다.");
				end = true;
			} else {
				System.out.println(input + " : " + strikeCount + "스트라익, " + ballCount + "볼");
			}
		}
	}

}
