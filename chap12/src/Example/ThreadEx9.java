package Example;
/**
 * InterruptedException 예외 발생
 * 
 * 
 * 스레드에서 사용되는 주요한 메서드
 * 1. start() : 싱글 스레드는 이미 메인이 가지고 있으며, 병렬화를 통하여 run() 메서드를 호출
 * 				이를 통하여 스레드의 상태가 new 상태에서 runnable 상태로 변경
 * 2. run() : 스레드가 실행하는 메소드, 오버라이딩 해야함
 * 3. setPriority : 1 ~ 10 으로 우선순위를 설정(10이 최고순위)
 * 4. sleep() : 밀리초 단위로 대기 상태 변경
 * 5. join() : 스레드가 종료할때까지 대기
 * 6. setDaemon() : 데몬으로 설정가능, new 상태에서만 실행 가능
 * 7. interrupt() : 예외 발생처리
 * 8. yield() : 실행중인(run 상태) 스레드를 실행가능상태(runnable) 로 변경
 * 9. stop() : 스레드 강제 종료
 * 
 * Thread 생성하는 방법
 * 1. Thread 상속받기
 * 2. Runnable 구현하여 스레드로 동작하기
 * 
 * 동기화 영역 : synchronized(lock)
 * 동기화 블럭 : lock 설정, 공유객체로 lock 설정
 * 동기화 메소드 : 공유 객체의 메소드여야함.
 * @author GDJ30
 *
 */

class InterruptThread extends Thread{
	public void run() {
		System.out.println("DO NOT WAKE ME UP!");
		try {
			sleep(1000000);
		}catch(InterruptedException e) {
			System.out.println("FUXK YOU ASSHOLE!!!");
			e.printStackTrace();
		}
	}
	}
	

public class ThreadEx9 {
	public static void main(String[] args) throws InterruptedException {
		InterruptThread t1 = new InterruptThread();
		t1.start();
		Thread.sleep(2000);
		t1.interrupt();

	}
}
