package chap7;



/*
 * ??? ?«? μΆλ ₯?κΈ?
 * [κ²°κ³Ό]
     ?λ¦¬μλ₯? ?? ₯??Έ?(1~10)
   5
   0 λΆ??° 9κΉμ? 5?λ¦? ?«?λ₯? ?? ₯??Έ?
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
		
		System.out.println("?λ¦¬μλ₯? ?? ₯??Έ?(1~10)");
		int numberScope = scan.nextInt();
		String[][][] resultStringArray = new String[numberScope][][];
		System.out.println("0 λΆ??° 9κΉμ? "+numberScope+" ?λ¦¬μ ?«?λ₯? ?? ₯??Έ?");
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
