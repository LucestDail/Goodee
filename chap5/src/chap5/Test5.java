package chap5;

public class Test5 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Command ���� �Ķ���� �Է�[��) java Test5.java (number)]");
		}else {
			for(String item : args) {
				int target = Integer.parseInt(item);
				System.out.print(target + "�� ��� : ");
				for(int i = 1; i < target;i++) {
					if((target % i) == 0) {
						System.out.print(i);
						System.out.print(" ");
					}					
				}
				System.out.println();	
			}		
		}
	}
}
