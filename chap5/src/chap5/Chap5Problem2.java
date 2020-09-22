package chap5;

public class Chap5Problem2 {

	public static void main(String[] args) {
		for(int i = 0;i<=10;i++) {
			for(int j = 0; j <= 10; j++) {
				int result = 0;
				int conclusion = 10;
				result = 2*i + 4*j;
				if(result == conclusion) {
					System.out.println("x=" + i + ",y=" + j);
				}
			}
		}
	}

}
