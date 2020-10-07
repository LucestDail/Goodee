package chap10;

public class ExceptionEx4 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			
		}catch(Exception e) {
			System.out.println(4);
		}finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
}
