package chap10;

import java.util.*;

class LoginFailException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	LoginFailException(String msg){
		super(msg);
	}
}

public class ExceptionEx9 {

	public static void main(String[] args) {
		try {
			String id = "hello";
			String pwd = "1234";
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your ID");
			String inputId = scan.nextLine();
			System.out.println("Enter your PWD");
			String inputPwd = scan.nextLine();
			
			if(id.equals(inputId)&&pwd.equals(inputPwd)) {
				System.out.println("you have login");
			}else if(!id.equals(inputId)) {
				throw new LoginFailException("Id is wrong!");
			}else {
				throw new LoginFailException("Password is wrong!");
			}
		}catch(LoginFailException e){
			System.out.println(e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
