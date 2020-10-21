package Test;

/**
 * 1. ThreadEx3.java �ҽ��� Runnable �������̽� ���� ������� �����Ͽ� ���� ����� ��µǵ��� �����ϱ�
 * @author GDJ30
 *
 */

class ThreadPriority implements Runnable{

	public void run() {
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {}
		for(int i = 0; i<5;i++) {
			System.out.println(Thread.currentThread());
		}
	}
}

public class Test1 {

	public static void main(String[] args) {
		ThreadPriority tp  = new ThreadPriority();
		Thread t1 = new Thread(tp,"First");
		Thread t2 = new Thread(tp,"Second");
		Thread t3 = new Thread(tp,"Third");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		System.out.println("���� �켱���� : " + t1.getPriority());
		System.out.println("�⺻ �켱���� : " + t2.getPriority());
		System.out.println("���� �켱���� : " + t3.getPriority());
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main ����");
	}

}
