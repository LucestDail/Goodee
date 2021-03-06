package src;

class FinalValue {
	final int NUM;
	final int[] ARR;
	FinalValue(int num) {
		this.NUM = num;
		ARR = new int[5];
		for(int i = 0; i < ARR.length; i++) {
			ARR[i] = (i+1) * 10;
		}
	}
}

public class FinalValueEx1 {
	public static void main(String[] args) {
		FinalValue f1 = new FinalValue(100);
		System.out.println(f1.NUM);
		
		FinalValue f2 = new FinalValue(200);
		System.out.println(f2.NUM);
		
		for(int a : f1.ARR) {
			System.out.print(a + ",");
		}
		System.out.println();
		f1.ARR[0] = 100;
		f1.ARR[1] = 200;
		for(int a : f1.ARR) {
			System.out.print(a + ",");
		}
		System.out.println();
	}

}
