package Exam;

/**
 * ThreadEx4.java Runnable 방식으로 변경
 * @author GDJ30
 *
 */

class PrintRunnable implements Runnable{
	char ch;
	PrintRunnable(char ch){
		this.ch = ch;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 80;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
}


public class ExamEx1 {
	public static void main(String[] args) {
//		Thread t1 = new Thread(new PrintRunnable('A'));
		Thread t1 = new Thread(
				() -> {
					for(int i = 0; i < 20; i++) {
						for(int j = 0; j < 80;j++) {
							System.out.print('A');
						}
						System.out.println();
					}
				});
		Thread t2 = new Thread(new PrintRunnable('B'));
		Thread t3 = new Thread(new PrintRunnable('C'));
		t1.start();
		t2.start();
		t3.start();
	}

}
