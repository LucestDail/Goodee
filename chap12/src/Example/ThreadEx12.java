package Example;
/**
 * 생산자 스레드, 소비자 스레드 예제
 * 엄마와 아들은 하나의 계좌를 공유한다.
 * 계좌에 잔액이 0이면, 아들은 돈을 가져가지 못한다 => wait 상태로 전환
 * 계좌에 잔액이 있으면, 엄마는 계좌에 돈을 넣지 않는다 => wait 상태로 전환
 * 	=> 잔액이 0원인 경우, 10000/20000/30000 랜덤 금액 입금
 * 	=> 잔액이 0원인 경우는 돈을 입금하고 아들을 깨움.
 * 	=> 잔액이 0원보다 많은 경우 아들은 돈을 0원으로 만들고 엄마를 깨움.
 * 엄마는 0 ~ 3000 밀리초동안 sleep
 * 아들은 0 ~ 1000 밀리초동안 sleep
 * @author GDJ30
 *
 */

class Account{
	int money;
	synchronized void output() {
		while(money == 0) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " : " + money + " 원 출금");
		System.out.println("아~이 씻팔!");
		money = 0;
	}
	synchronized void input() {
		while(money > 0) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		money = ((int)(Math.random() * 3) + 1) * 10000;
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " : " + money + " 원 입금");
		System.out.println("엄마도 사람이야!");
	}
}

class Mother extends Thread{
	Account account;
	Mother(Account account){
		super("Mother Thread");
		this.account = account;
	}
	
	public void run() {
		for(int i = 0; i < 20; i++) {
			account.input();
			try {
				sleep((int)(Math.random() * 3000));
			}catch(InterruptedException e) {};
		}
	}
}

class Son extends Thread{
	Account account;
	Son(Account account){
		super("Son Thread");
		this.account = account;
	}
	
	public void run() {
		for(int i = 0; i < 20; i++) {
			account.output();
			try {
				sleep((int)(Math.random() * 1000));
			}catch(InterruptedException e) {};
		}
	}
}

public class ThreadEx12 {

	public static void main(String[] args) throws InterruptedException {
		Account account = new Account();
		Mother mother = new Mother(account);
		Son son = new Son(account);
		mother.start();
		son.start();
		mother.join();
		son.join();
		System.out.println("계좌 잔약 : " + account.money);
	}

}
