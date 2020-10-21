package Test;

/**
 * 1. ThreadEx3.java 소스를 Runnable 인터페이스 구현 방식으로 변경하여 같은 결과가 출력되도록 구현하기
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
		System.out.println("높은 우선순위 : " + t1.getPriority());
		System.out.println("기본 우선순위 : " + t2.getPriority());
		System.out.println("낮은 우선순위 : " + t3.getPriority());
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main 종료");
	}

}
