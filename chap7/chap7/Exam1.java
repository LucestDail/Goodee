package chap7;

/*
�??��, ?��?��, ?��?��, 물리, ?��?��, ?��?��, 컴퓨?�� ?��?���?  ?��?��받�? ?��, 총점, ?��균을 구하�? ?��?�� 모두?�� ???�� 
막�?그래?���? ?��?�� 조건?�� 맞게 그릴 ?�� ?��?�� ?��로그?��?�� ?��?��?��?��?��.
?�� ?��균�? ?��?��?��?��?��?�� 버리�? ?��?���? 처리 ?��?��?��.
[결과]
�??�� ?��?�� ?��?�� 물리 ?��?�� ?��?�� 컴퓨?�� ?��?���?(1 - 100) ?��?��?��?��?��
88 77 99 44 55 66 100
총합 :529
?���? :75
최�? :100
최소 :44
100                           *   *        
 90           *               *   *        
 80   *       *               *   *        
 70   *   *   *               *   *       *
 60   *   *   *           *   *   *       *
 50   *   *   *       *   *   *   *       *
 40   *   *   *   *   *   *   *   *   *   *
 30   *   *   *   *   *   *   *   *   *   *
 20   *   *   *   *   *   *   *   *   *   *
 10   *   *   *   *   *   *   *   *   *   *
   �??��  ?��?��  ?��?��  물리  ?��?��  ?��?�� 컴퓨?��  최�?  최소  ?���?
*/

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int SCORE_ARRAY_MAX = 10;
		final int SCORE_ARRAY_MAXVALUE = 7;
		final int SCORE_ARRAY_MINVALUE = 8;
		final int SCORE_ARRAY_AVGVALUE = 9;
		
		int[] i_a_scoreArray = new int[SCORE_ARRAY_MAX];
		int total = 0;
		int average = 0;
		System.out.println("�??�� ?��?�� ?��?�� 물리 ?��?�� ?��?�� 컴퓨?�� ?��?���?(1 - 100) ?��?��?��?��?��");
		//Scanner score
        for (int i = 0; i < i_a_scoreArray.length-3; i++) {
               i_a_scoreArray[i] =scan.nextInt();
               total += i_a_scoreArray[i];
        }
        //min-max set
		int max = i_a_scoreArray[0];
		int min = i_a_scoreArray[0];
        for(int i = 0; i < i_a_scoreArray.length-3; i++) {
        	 if(max < i_a_scoreArray[i]) {
          	   max = i_a_scoreArray[i];
             }
             if(min > i_a_scoreArray[i]) {
          	   min = i_a_scoreArray[i];
             }
        }
        //summary print
        average = total / (SCORE_ARRAY_MAX-3);
        i_a_scoreArray[SCORE_ARRAY_MAXVALUE] = max;
        i_a_scoreArray[SCORE_ARRAY_MINVALUE] = min;
        i_a_scoreArray[SCORE_ARRAY_AVGVALUE] = average;
        for(int item : i_a_scoreArray)
        System.out.print(item + " ");
        System.out.println();
        System.out.println("총합 : " + total);
        System.out.println("?���? : " + average);
        System.out.println("최�? : " + max);
        System.out.println("최소 : " + min);
        
        //setting graph array
        String[][] s_a_graphArray = new String[11][11];
        String[] indexStringArray = {"","�??��","?��?��","?��?��","물리","?��?��","?��?��","컴퓨?��","최�?","최소","?���?"};
        int judge = 0;
        for(int i = 0; i < s_a_graphArray.length; i++) {
        	for(int j = 0; j < s_a_graphArray.length; j++) { //
        		if(i == s_a_graphArray.length-1 && j > 0 && j < s_a_graphArray.length) {
        			s_a_graphArray[i][j] = indexStringArray[j];
        		}else if(j == 0) {// 좌측 출력
        			s_a_graphArray[i][j] = Integer.toString(100 - (i * 10));
        			if(i == s_a_graphArray.length-1) {
        				s_a_graphArray[i][j] = " ";
        			}
        		}else if(j > 0 && j < s_a_graphArray.length) {
        			judge = (109-i_a_scoreArray[j-1]) / 10;
        			if(i < judge) {
        				s_a_graphArray[i][j] = "";
        			}
        			else {
        				s_a_graphArray[i][j] = "*";
        			}
        		}else {
        			s_a_graphArray[i][j] = " ";
        		}
        	}
        }
        
        //print String graph Array
        for(String[] rowArray : s_a_graphArray) {
        	for(String column : rowArray) {
        		System.out.print(column + "\t");
        	}
        	System.out.println();
        }
        
        
        
	}
}