package chap10;



public class ExceptionEx1 {

	public static void main(String[] args) {
		
		try {
			System.out.println(args[0]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("Command ���ο� ���� �Է��ϼ���");
			
		}
		System.out.println("���α׷� ����");
	}
	
}
