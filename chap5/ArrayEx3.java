package chap5;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		for(int i=0;i<1000;i++) {
			int f = (int)(Math.random() * 45);
			int t = (int)(Math.random() * 45);
			int temp = balls[f];
			balls[f] = balls[t];
			balls[t] = temp;
		}
		int[] lotto = new int[6];
		for(int i=0;i<6;i++) {
			lotto[i] = balls[i];
			System.out.print(balls[i] + " ");
		}System.out.println("");
		for(int i=0;i<lotto.length;i++) {
			boolean change = false;
			for(int j=0;j<lotto.length-i-1;j++) {
				if(lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
					change = true;
				}
			}
			if(!change)
				break;
		}
		for(int item : lotto)
			System.out.print(item + " ");
		System.out.println("");
	}
}
