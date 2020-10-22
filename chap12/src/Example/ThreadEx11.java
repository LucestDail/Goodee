package Example;
/**
 * wait(), notiry(), notryAll() method example
 * 1. 동기화영역(동기화블럭, 동기화메소드) 에서만 호출이 가능함.
 * 2. Object 클래스의 맴버 메서드 => 모든 객체가 호출이 가능함.
 * 3. wait() : 현재 실행중인 스레드를 대기상태로 전환. lock 해제하고 들어감
 * 	  notify() : wait() 스레드 한개를 Runnable 상태로 변환함 -> 개발자가 스레드 지정 불가능
 * 	  notifyAll() : wait() 스레드 전체를 Runnable 상태로 변환함.
 * @author GDJ30
 *
 */

class ATM2 implements Runnable{
	private int money = 100000;
	public void run() {
		try {
			Thread.sleep((int)(Math.random() * 1000));
		}catch(InterruptedException e) {}
		synchronized(this) {
			while(true) {
				if(money <= 0) {
					notifyAll();
					break;
				}
				withdraw();
				if(money % 20000 == 0) {
					try {
						wait();
					}catch(InterruptedException e) {}
				}else {
					notifyAll();
				}
			}
		}
	}
	private void withdraw() {
		if(money <= 0) {
			return;
		}
		money -= 10000;
		System.out.println(Thread.currentThread().getName() + " 출금, 잔액 : " + money);
	}
}

public class ThreadEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM2 atm2 = new ATM2();
		Thread mother = new Thread(atm2,"Mother");
		Thread son = new Thread(atm2,"Son");
		mother.start();
		son.start();
	}

}
