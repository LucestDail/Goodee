package chap5;

public class Exam5 {

	public static void main(String[] args) {
		for(String item : args) {
			System.out.print(item + " ");
		}
		System.out.print(" -> ");
		int count = args.length;
		int sum = 0;
		for (int j = 0; j < args.length; j++) {
			boolean judge = false;
			for (int i = 0; i < args[j].length(); i++) {
				if (args[j].charAt(i) >= '0' && args[j].charAt(i) <= '9') {
					judge = true;
				} else {
					judge = false;
					count--;
					break;
				}
			}
			if (judge) {
				for (int i = 0; i < args[j].length(); i++) {
					sum += args[j].charAt(i) - '0';
					System.out.print(args[j].charAt(i));
					if (i < args[j].length() - 1) {
						System.out.print("+");
					}
				}
				if(j < count-2) {
					System.out.print("+");
				}else {
					System.out.print("=");
				}
				
			}
		}
		System.out.print(sum);
		System.out.println("");
	}
}
