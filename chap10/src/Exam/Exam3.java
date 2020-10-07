package Exam;


class UnsupportFunctionException extends RuntimeException{
	private final int ERR_CODE;
	
	UnsupportFunctionException(String msg, int ERR_CODE){
		super(msg);
		this.ERR_CODE = ERR_CODE;
		
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + ", " + getErrCode();
	}
}

public class Exam3 {
	public static void main(String[] args) {
		try {
			throw new UnsupportFunctionException("�������� �ʴ� ����Դϴ�.", 200);
		}catch(UnsupportFunctionException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrCode());
		}
	}
}
