package chap5;
import java.util.*;

public class BaseballGame {

	public static void main(String[] args) {
		
		// 필요 모듈 선언
		Scanner scan = new Scanner(System.in);
		
		//상수 선언
		final int MAXNUM = 4;
		
		//참조 변수 선언
		int randomArray[] = new int[MAXNUM];
		int inputArray[] = new int[MAXNUM];
		
		//기본 변수 선언
		boolean end = false;
		int count = 0;
		
		// 난수 생성 알고리즘
		while(!end) { // 중복 안하는 난수 4개 생성
			end = true;
			for(int i = 0; i < randomArray.length;i++) {
				randomArray[i] = (int)(Math.random()*9)+1;
			}
			for(int i = 0; i<randomArray.length; i++) {
				for(int j = 0;j<randomArray.length;j++) {
					if(i == j) {
						continue;
					}else {
						if(randomArray[i] == randomArray[j]) {
							end = false;
						}
					}
				}
			}
		}
		// 난수 생성 알고리즘 종료

		
		// 게임 알고리즘
		end = false;
		while(!end) {
			int ballCount = 0;
			int strikeCount = 0;
			System.out.println("서로 다른 4자리 정수를 입력하세요");
			String input = scan.next();
			count++;
			// 입력 받은 정수 배열에 삽입
			for(int i = 0; i<input.length();i++) {
				inputArray[i] = input.charAt(i)-'0';
			}
			for(int i = 0;i<randomArray.length;i++) {
				if(randomArray[i] == inputArray[i]) {
					strikeCount++;
				}else {
					ballCount++;
				}
			}
			if(strikeCount == 4) {
				System.out.println(input + " : 정답입니다.");
				System.out.println(count + "번 만에 맞추셨습니다. 게임을 종료합니다.");
				end = true;
			}else {
				System.out.println(input + " : " + strikeCount +"스트라익, " + ballCount + "볼");
			}
		}
		// 게임 종료
		
	}
}