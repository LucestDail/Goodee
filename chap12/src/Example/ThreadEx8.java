package Example;
/**
 * 데몬 스레드
 * 1. 일반 스레드를 도와주기 위한 보조역활을 담당, 보통 무한반복을 실시
 * 대표적인 데몬스레드가 가비지콜렉터
 * 참조하고 있지않은 객체가 있으면 찾아가서 제거
 * 
 * 2. 일반 스레드가 종료되면 데몬 스레드도 종료
 * 3. setDaemon(true) => New 상태에서만 설정 가능.
 * 
 * @author GDJ30
 *
 */

class DaemonThread extends Thread{
	int sum = 0;
	public void run() {
		while(true) {
			System.out.println(sum++);
			try {
				sleep(100);
			}catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx8 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		Thread.sleep(2000);
		System.out.println("main end");

	}

}
