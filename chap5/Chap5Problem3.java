package chap5;

public class Chap5Problem3 {

	public static void main(String[] args) {

		int sum = 0;
		int MAX = 11;
		for(int i=1;i<MAX;i++) {
			System.out.print("(");
			for( int j = 1; j < i; j++) {
				System.out.print(j + "+");
				sum += j;
			}
			sum += i;
			System.out.print(i + ")");
			if(i != MAX-1) {
				System.out.print("+");
			}else {
				System.out.print("=" + sum);
			}
		}
	}
}
