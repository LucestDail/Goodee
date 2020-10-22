package Example;
/**
 * ������ ������, �Һ��� ������ ����
 * ������ �Ƶ��� �ϳ��� ���¸� �����Ѵ�.
 * ���¿� �ܾ��� 0�̸�, �Ƶ��� ���� �������� ���Ѵ� => wait ���·� ��ȯ
 * ���¿� �ܾ��� ������, ������ ���¿� ���� ���� �ʴ´� => wait ���·� ��ȯ
 * 	=> �ܾ��� 0���� ���, 10000/20000/30000 ���� �ݾ� �Ա�
 * 	=> �ܾ��� 0���� ���� ���� �Ա��ϰ� �Ƶ��� ����.
 * 	=> �ܾ��� 0������ ���� ��� �Ƶ��� ���� 0������ ����� ������ ����.
 * ������ 0 ~ 3000 �и��ʵ��� sleep
 * �Ƶ��� 0 ~ 1000 �и��ʵ��� sleep
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
		System.out.println(Thread.currentThread().getName() + " : " + money + " �� ���");
		System.out.println("��~�� ����!");
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
		System.out.println(Thread.currentThread().getName() + " : " + money + " �� �Ա�");
		System.out.println("������ ����̾�!");
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
		System.out.println("���� �ܾ� : " + account.money);
	}

}
