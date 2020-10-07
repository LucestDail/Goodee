package chap10;



public class ExceptionEx1 {

	public static void main(String[] args) {
		
		try {
			System.out.println(args[0]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("Command 라인에 값을 입력하세요");
			
		}
		System.out.println("프로그램 종료");
	}
	
}
