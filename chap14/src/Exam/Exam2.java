package Exam;

@FunctionalInterface
interface LambdaInterface4{
	int method(int x, int y);
}

public class Exam2 {
	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		
		
		System.out.println("�� ��" + a + ", " + b + " �� �� : " + calc(a,b, (x,y) -> x+y));
		System.out.println("�� ��" + a + ", " + b + " �� �� : " + calc(a,b,(x,y) -> x*y));
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("arr �迭 �ּҰ� : " + calc(arr, (x,y)->(x>y)?x:y));
		System.out.println("arr �迭 �ִ밪 : " + calc(arr, (x,y)->(x<y)?x:y));
	}


	static int calc(int x, int y, LambdaInterface4 f) {
		return f.method(x, y);
	}
	
	
	static int calc(int[] arr,LambdaInterface4 f) {
		int result = arr[0];
		for(int i : arr) {
			result = f.method(result, i);
		}
		return result;
	}

}
