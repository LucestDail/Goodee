package Example;
/**
 * ���� ������
 * 1. �Ϲ� �����带 �����ֱ� ���� ������Ȱ�� ���, ���� ���ѹݺ��� �ǽ�
 * ��ǥ���� ���󽺷��尡 �������ݷ���
 * �����ϰ� �������� ��ü�� ������ ã�ư��� ����
 * 
 * 2. �Ϲ� �����尡 ����Ǹ� ���� �����嵵 ����
 * 3. setDaemon(true) => New ���¿����� ���� ����.
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
