package Example;
/**
 * Thread ��ü �����ϱ�
 * 1. Thread Ŭ������ ���� Ŭ������ ������ ��ü ����
 * 2. Runnable �������̽��� ������ ��ü
 * 
 * new ���� : ��ü�� ����. ������ �⵿ �غ�
 * Runnable ���� : start() �޼ҵ带 ���ؼ� ������ ��ü�� ����
 * �̶� ���� ������ ����ȭ�� -> run �޼ҵ带 ȣ��
 * ���� �����췯�� ���ؼ� run �������� �̵���
 * 
 * �����带 ����� ������ ��ӹ��� ���� ������ �����带 ������
 * -> ���� ������ ������ �� �ִ� �������̽��� ����
 * -> ��, Runnable �������̽��� �����尡 �ƴϹǷ�, �����带 ���� ��������.
 * @author GDJ30
 *
 */

class Thread1 extends Thread{
	Thread1(String name){
		super(name);
	}
	
	@Override
	public void run() { //2. runnable -> 3. running ���� �Ѿ��, �����尡 ������ ��� ���
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "=" + getName());
			try {
				sleep(1000); // 4. ��� ���� -> runnable ���·� ����, �����췯 running ���� ���
			}catch(InterruptedException e) {
				
			}
		}
	}// 3. running -> 5. dead ���·� ����, ������ ���� ����(���ÿ��� �޸� ����)
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println("main ������ ����");
		Thread1 t1 = new Thread1("first"); // ��ü ��������(1. new ����)
		Thread1 t2 = new Thread1("Second");
		t1.start();// 1. new -> 2. runnable �Ѿ
		t2.start();
		System.out.println("main ������ ����");
		
	}

}
