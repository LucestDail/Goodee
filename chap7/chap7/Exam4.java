package chap7;

/*
 * command ?��?��?��?�� ?��?�� n?�� ?��?��받아 n?��?��보다 ?��?? 
 * ?��?��(primary number)?�� �??���? 구하�?
 * int =Integer.parseInt(args[0])
 * 
 * [결과]
 * 1,2,3,5,7,11,13,17,19
 * 20?��?��까�??�� ?��?��?�� �??��:9
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
		System.out.println(target + "?��?��까�??�� ?��?��?�� �??�� : " + count);
	}
}
