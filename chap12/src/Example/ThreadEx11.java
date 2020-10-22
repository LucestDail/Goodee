package Example;
/**
 * wait(), notiry(), notryAll() method example
 * 1. ����ȭ����(����ȭ��, ����ȭ�޼ҵ�) ������ ȣ���� ������.
 * 2. Object Ŭ������ �ɹ� �޼��� => ��� ��ü�� ȣ���� ������.
 * 3. wait() : ���� �������� �����带 �����·� ��ȯ. lock �����ϰ� ��
 * 	  notify() : wait() ������ �Ѱ��� Runnable ���·� ��ȯ�� -> �����ڰ� ������ ���� �Ұ���
 * 	  notifyAll() : wait() ������ ��ü�� Runnable ���·� ��ȯ��.
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
		System.out.println(Thread.currentThread().getName() + " ���, �ܾ� : " + money);
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
