package Example;
/**
 * 스레드 우선순위 설정 가능
 * 운영체제 스케줄러에게 선택 우선순위를 지정 및 설정가능
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
		System.out.println("높은 우선순위 : " + Thread.MAX_PRIORITY);
		System.out.println("기본 우선순위 : " + Thread.NORM_PRIORITY);
		System.out.println("낮은 우선순위 : " + Thread.MIN_PRIORITY);
		Thread t1 = new ThreadPriority("first",1);
		Thread t2 = new ThreadPriority("second");
		Thread t3 = new ThreadPriority("third",10);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main 종료");
	}

}
