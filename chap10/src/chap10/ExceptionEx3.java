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
			System.out.println("0으로 나누지 마세요");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Command 라인에 값을 입력하세요");
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		}catch(Exception e) {
			System.out.println("전산부로 전화 요망 : 1234");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
