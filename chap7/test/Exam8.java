package test;


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
    }
}
