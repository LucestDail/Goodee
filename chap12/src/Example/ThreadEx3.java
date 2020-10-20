package Example;
/**
 * ������ �켱���� ���� ����
 * �ü�� �����ٷ����� ���� �켱������ ���� �� ��������
 * 
 * 
 * @author GDJ30
 *
 */

class ThreadPriority extends Thread{
	ThreadPriority(String name){
		this(name, Thread.NORM_PRIORITY);
	}
	ThreadPriority(String name, int p){
		super(name);
		this.setPriority(p);
	}
	public void run() {
		try {
			sleep(20);
		}catch(InterruptedException e) {}
		for(int i = 0; i<5;i++) {
			System.out.println(this.toString());
		}
	}
}
public class ThreadEx3 {

	public static void main(String[] args) {
		System.out.println("���� �켱���� : " + Thread.MAX_PRIORITY);
		System.out.println("�⺻ �켱���� : " + Thread.NORM_PRIORITY);
		System.out.println("���� �켱���� : " + Thread.MIN_PRIORITY);
		Thread t1 = new ThreadPriority("first",1);
		Thread t2 = new ThreadPriority("second");
		Thread t3 = new ThreadPriority("third",10);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main ����");
	}

}
