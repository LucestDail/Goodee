package chap5;

public class Test6 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Command 라인 파라매터 입력[예) java Test6.java number1, number2]");
		}else {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			int bigNumber = (number1 > number2) ? number1 : number2;
			System.out.print(number1 + "과 " + number2 + "의 공약수 : ");
			for(int i = 1; i < bigNumber ;i++) {
				if((number1 % i == 0) && (number2 % i == 0))
					System.out.print(i + " ");
				}					
			}
		}		
	}