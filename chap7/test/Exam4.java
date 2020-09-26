package chap7.test;

/*
 * command 라인에서 숫자 n을 입력받아 n숫자보다 작은 
 * 소수(primary number)의 갯수를 구하기
 * int =Integer.parseInt(args[0])
 * 
 * [결과]
 * 1,2,3,5,7,11,13,17,19
 * 20숫자까지의 소수의 갯수:9
 */


public class Exam4 {
	public static void main(String[] args) {
		int target = Integer.parseInt(args[0]);
        int count = 0;
        boolean judge = false;
        for (int i = 2; i <= target; i++) { 
            judge = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    judge = false;
            }
                if (judge)  {
                	  count++;
                	  System.out.print(i + " ");
                }
            }
		System.out.println();
		System.out.println(target + "숫자까지의 소수의 갯수 : " + count);
	}
}
