package chap7.test;

/*
국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를  입력받은 후, 총점, 평균을 구하고 이들 모두에 대한 
막대그래프를 아래 조건에 맞게 그릴 수 있는 프로그램을 작성하시오.
단 평균은 소숫점이하는 버리고 정수로 처리 합니다.
[결과]
국어 영어 수학 물리 화학 사회 컴퓨터 점수를(1 - 100) 입력하세요
88 77 99 44 55 66 100
총합 :529
평균 :75
최대 :100
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
   국어  영어  수학  물리  화학  사회 컴퓨터  최대  최소  평균
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
		System.out.println("국어 영어 수학 물리 화학 사회 컴퓨터 점수를(1 - 100) 입력하세요");
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
        System.out.println("평균 : " + average);
        System.out.println("최대 : " + max);
        System.out.println("최소 : " + min);
        
        //setting graph array
        String[][] s_a_graphArray = new String[11][11];
        int judge = 0;
        for(int i = 0; i < s_a_graphArray.length; i++) {
        	for(int j = 0; j < s_a_graphArray.length; j++) { //
        		if(i == s_a_graphArray.length-1 && j > 0 && j < s_a_graphArray.length) {
        			switch(j) {//하단 출력
        			case 1:
        				s_a_graphArray[i][j] = "국어";break;
        			case 2:
        				s_a_graphArray[i][j] = "영어";break;
        			case 3:
        				s_a_graphArray[i][j] = "수학";break;
        			case 4:
        				s_a_graphArray[i][j] = "물리";break;
        			case 5:
        				s_a_graphArray[i][j] = "화학";break;
        			case 6:
        				s_a_graphArray[i][j] = "사회";break;
        			case 7:
        				s_a_graphArray[i][j] = "컴퓨터";break;
        			case 8:
        				s_a_graphArray[i][j] = "최대";break;
        			case 9:
        				s_a_graphArray[i][j] = "최소";break;
        			case 10:
        				s_a_graphArray[i][j] = "평균";break;
        				default:
        					continue;
        			}
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
