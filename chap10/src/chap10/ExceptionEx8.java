package chap10;

public class ExceptionEx8 {

	public static void main(String[] args) {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main : " + e.getMessage());
		}

	}
	private static void badmethod() throws Exception{
//		throw new RuntimeException("예외 강제 발생");
		try {
			throw new Exception("예외 강제 발생");
		}catch(Exception e) {
			System.out.println("badmethod : " + e.getMessage());
			throw e;
		}
	}

}
