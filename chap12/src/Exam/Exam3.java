package Exam;

class PrintRunnable3 implements Runnable{
	Printer ptr;
	char ch;
	PrintRunnable3(Printer ptr, char ch){
		this.ptr = ptr;
		this.ch = ch;
	}
	PrintRunnable3(char ch){
		this.ch = ch;
	}
	public void run() {
		for(int i = 0; i < 20; i++) {
			ptr.printChar(ch);
		}
	}
}

class Printer{
	public synchronized void printChar(char ch) {
		for(int i = 0; i < 80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}

public class Exam3 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
//		Thread t1 = new Thread(new PrintThread3(ptr,'A'));
		Thread t1 = new Thread(()->{
			for(int i = 0; i < 20; i++) {
				ptr.printChar('A');
			}
			System.out.println();
		});
		Thread t2 = new Thread(new PrintRunnable3(ptr,'B'));
		Thread t3 = new Thread(new PrintRunnable3(ptr,'C'));
		t1.start();
		t2.start();
		t3.start();

	}

}
