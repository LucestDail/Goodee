package chap7;

/*
 * command ?Ό?Έ?? ?«? n? ?? ₯λ°μ n?«?λ³΄λ€ ??? 
 * ??(primary number)? κ°??λ₯? κ΅¬νκΈ?
 * int =Integer.parseInt(args[0])
 * 
 * [κ²°κ³Ό]
 * 1,2,3,5,7,11,13,17,19
 * 20?«?κΉμ?? ??? κ°??:9
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
		System.out.println(target + "?«?κΉμ?? ??? κ°?? : " + count);
	}
}
