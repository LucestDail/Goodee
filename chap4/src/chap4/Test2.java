package chap4;

/*
 * 시스템과 가위(1), 바위(2), 보(3)를 하기
 * 시스템은 1,2,3 중의 한개의 숫자를 저장하고,
 * 한개의 숫자를 입력받아 가위바위보 게임하기
 */

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("시스템과 가위바위 보를 합니다.");
		System.out.println("가위(1), 바위(2), 보(3)");
		System.out.println("숫자를 입력해주세요");

		int Input = scan.nextInt();
		int RSP = (int) (Math.random() * 3) + 1;
		String RSPString = "";
		if (RSP == 3) {
			RSPString = "보";
		} else if (RSP == 2) {
			RSPString = "바위";
		} else {
			RSPString = "가위";
		}
		String InputString = "";
		if (Input == 3) {
			InputString = "보";
		} else if (Input == 2) {
			InputString = "바위";
		} else {
			InputString = "가위";
		}
		if (((RSP == 3) && (Input == 1)) || ((RSP == 2) && (Input == 3)) || ((RSP == 1) && (Input == 2))) {
			System.out.println("사용자 : " + InputString + " / 시스템  : " + RSPString + " => 사용자 승리");
		} else if (((RSP == 3) && (Input == 2)) || ((RSP == 2) && (Input == 1)) || ((RSP == 1) && (Input == 3))) {
			System.out.println("사용자 : " + InputString + " / 시스템  : " + RSPString + " => 시스템 승리");
		} else if (Input == RSP) {
			System.out.println("사용자 : " + InputString + " / 시스템  : " + RSPString + " => 무승부");
		} else {
			System.out.println("시스템 오류");
			System.out.println("input : " + Input + ", RSP : " + RSP);
		}
	}
}
