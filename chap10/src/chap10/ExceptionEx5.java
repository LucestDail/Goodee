package chap10;

public class ExceptionEx5 {
	public static void main(String[] args) throws Exception  {
		try {
			first();
		}catch(Exception e) {
			System.out.println("���ڸ� �����մϴ�.");
			e.printStackTrace();
		}
		first();
	}

	private static void first() throws Exception {
		System.out.println("first �޼ҵ�");
		second();
	}

	private static void second()throws Exception {
		System.out.println("second �޼ҵ�");
		System.out.println(Integer.parseInt("abc"));
		
	}

}
