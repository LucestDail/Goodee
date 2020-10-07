package chap10;

public class ExceptionEx5 {
	public static void main(String[] args) throws Exception  {
		try {
			first();
		}catch(Exception e) {
			System.out.println("숫자만 가능합니다.");
			e.printStackTrace();
		}
		first();
	}

	private static void first() throws Exception {
		System.out.println("first 메소드");
		second();
	}

	private static void second()throws Exception {
		System.out.println("second 메소드");
		System.out.println(Integer.parseInt("abc"));
		
	}

}
