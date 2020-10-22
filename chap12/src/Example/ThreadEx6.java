package Example;

class PrintThread3 extends Thread{
	Printer ptr;
	char ch;
	PrintThread3(Printer ptr, char ch){
		this.ptr = ptr;
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

public class ThreadEx6 {

	public static void main(String[] args) {
		Printer ptr = new Printer();
		PrintThread3 pt1 = new PrintThread3(ptr, 'A');
		PrintThread3 pt2 = new PrintThread3(ptr, 'B');
		PrintThread3 pt3 = new PrintThread3(ptr, 'C');

		pt1.start();
		pt2.start();
		pt3.start();

	}

}
