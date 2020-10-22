package Example;
/**
 * InterruptedException ���� �߻�
 * 
 * 
 * �����忡�� ���Ǵ� �ֿ��� �޼���
 * 1. start() : �̱� ������� �̹� ������ ������ ������, ����ȭ�� ���Ͽ� run() �޼��带 ȣ��
 * 				�̸� ���Ͽ� �������� ���°� new ���¿��� runnable ���·� ����
 * 2. run() : �����尡 �����ϴ� �޼ҵ�, �������̵� �ؾ���
 * 3. setPriority : 1 ~ 10 ���� �켱������ ����(10�� �ְ����)
 * 4. sleep() : �и��� ������ ��� ���� ����
 * 5. join() : �����尡 �����Ҷ����� ���
 * 6. setDaemon() : �������� ��������, new ���¿����� ���� ����
 * 7. interrupt() : ���� �߻�ó��
 * 8. yield() : ��������(run ����) �����带 ���డ�ɻ���(runnable) �� ����
 * 9. stop() : ������ ���� ����
 * 
 * Thread �����ϴ� ���
 * 1. Thread ��ӹޱ�
 * 2. Runnable �����Ͽ� ������� �����ϱ�
 * 
 * ����ȭ ���� : synchronized(lock)
 * ����ȭ �� : lock ����, ������ü�� lock ����
 * ����ȭ �޼ҵ� : ���� ��ü�� �޼ҵ忩����.
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
