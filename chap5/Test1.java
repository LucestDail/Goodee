package chap5;

import java.util.Arrays;
public class Test1 {
	public static void main(String[] args) {
		int randomArray[] = new int[3]; // 숫자 3개 선택 배
		boolean pass = false; // 숫자 중복 여부확인 불 조
		while(!pass) {
			for(int i = 0; i < randomArray.length;i++) {
				randomArray[i] = (int)(Math.random()*9)+1; // 난수 3개 선택 후 배열 할
			}
			if(randomArray[0] != randomArray[1] &&
					randomArray[1] != randomArray[2] &&
					randomArray[2] != randomArray[0]) {
				pass = true; // 전체 배열이 중복아 아닐 경우 while 탈
			}
		}
		Arrays.sort(randomArray);
		for(int item : randomArray) {
			System.out.print(item + " ");
		}
	}
}