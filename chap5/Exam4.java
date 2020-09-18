package chap5;

public class Exam4 {

	public static void main(String[] args) {
		int[] randomIntArray = new int[10];
		for (int i = 0; i < randomIntArray.length;i++) {
			randomIntArray[i] = (int)(Math.random()*10)+1;
			System.out.print(randomIntArray[i] + ":");
			for(int j = 0; j<randomIntArray[i];j++) {
				System.out.print("*");
			}
			System.out.println("");			
		}
	}
}
