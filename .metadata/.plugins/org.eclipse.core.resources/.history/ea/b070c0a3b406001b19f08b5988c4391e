package chap7.test;



/*
 * 대형 숫자 출력하기
 * [결과]
     자리수를 입력하세요(1~10)
   5
   0 부터 9까지 5자리 숫자를 입력하세요
   12345
   
  * *** *** * * *** 
  *   *   * * * *   
  * *** *** *** *** 
  * *     *   *   * 
  * *** ***   * *** 
 */

import java.util.Scanner;

public class Exam8 {
	public static String[][][] number = { 
		{ // 0
			{ "*", "*", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", "*", "*", " " },
		},
		{ // 1
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " }, 
		},
		{ // 2
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ "*", "*", "*", " " },
			{ "*", " ", " ", " " },
			{ "*", "*", "*", " " }, 
		},
		{ // 3
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ "*", "*", "*", " " }, 
		},
		{ // 4
			{ "*", " ", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " }, 
		},
		{ // 5
			{ "*", "*", "*", " " },
			{ "*", " ", " ", " " },
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ "*", "*", "*", " " }, 
		},
		{ // 6
			{ "*", "*", "*", " " },
			{ "*", " ", " ", " " },
			{ "*", "*", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", "*", "*", " " }, 
		},
		{ // 7
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " }, 
		},
		{ // 8
			{ "*", "*", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", "*", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", "*", "*", " " }, 
		},
		{ // 9
			{ "*", "*", "*", " " },
			{ "*", " ", "*", " " },
			{ "*", "*", "*", " " },
			{ " ", " ", "*", " " },
			{ " ", " ", "*", " " }, 
		}
	};
	
	public static void main(String[] args) {
		
		final int NUMBER_WIDTH = 4;
		final int NUMBER_HEIGHT = 5;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("자리수를 입력하세요(1~10)");
		int numberScope = scan.nextInt();
		String[][][] resultStringArray = new String[numberScope][][];
		System.out.println("0 부터 9까지 "+numberScope+" 자리수 숫자를 입력하세요");
		String inputString = scan.next();
		for(int i = 0; i < inputString.length();i++) {
			resultStringArray[i] = number[inputString.charAt(i)-'0'];
		}
		for(int i = 0; i < NUMBER_HEIGHT;i++) {
			for(int j = 0; j < resultStringArray.length;j++) {
				for(int k = 0; k < NUMBER_WIDTH;k++) {
					System.out.print(resultStringArray[j][i][k]);
				}
			}
			System.out.println();
		}
		
    }
}
