package Test1;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
          for(int i=0;i<20;i++) {
          System.out.print(getRand(1,-3)+",");
          }
         System.out.println();
         for(int i=0;i<20;i++) {
             System.out.print(getRand(-1,3)+",");
         }
         System.out.println();
   }

	private static int getRand(int i, int j) {
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis()*(int)(Math.random()*10));
		int randNumber = 0;
		if(i > j) {
			int scope = Math.abs(i-j);
			randNumber = rand.nextInt(scope+1)-Math.abs(j);
		}else {
			int scope = Math.abs(j-i);
			randNumber = rand.nextInt(scope+1)-Math.abs(i);
		}
		return randNumber;
	}
}