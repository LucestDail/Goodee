package chap10;

public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			String str = null;
//			System.out.println(Integer.parseInt("abc"));
			System.out.println(str.charAt(0));
			System.out.println(args[1]);
			System.out.println(Integer.parseInt(args[0]));
		}catch(ArithmeticException e){
			System.out.println("0���� ������ ������");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Command ���ο� ���� �Է��ϼ���");
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}catch(Exception e) {
			System.out.println("����η� ��ȭ ��� : 1234");
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}

}