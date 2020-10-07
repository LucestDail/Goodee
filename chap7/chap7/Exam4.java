package chap7;

/*
 * command ?¼?¸?—?„œ ?ˆ«? n?„ ?…? ¥ë°›ì•„ n?ˆ«?ë³´ë‹¤ ?‘?? 
 * ?†Œ?ˆ˜(primary number)?˜ ê°??ˆ˜ë¥? êµ¬í•˜ê¸?
 * int =Integer.parseInt(args[0])
 * 
 * [ê²°ê³¼]
 * 1,2,3,5,7,11,13,17,19
 * 20?ˆ«?ê¹Œì??˜ ?†Œ?ˆ˜?˜ ê°??ˆ˜:9
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
		System.out.println(target + "?ˆ«?ê¹Œì??˜ ?†Œ?ˆ˜?˜ ê°??ˆ˜ : " + count);
	}
}
