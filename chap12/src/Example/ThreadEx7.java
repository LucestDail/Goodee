package Example;
/**
 * join() �޼ҵ� : �����尡 �����Ҷ����� ���
 * @author GDJ30
 *
 */

class JoinThread extends Thread{
	long sum = 0;
	public void run() {
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
	}
}


public class ThreadEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�����带 �̿��Ͽ� 100������ �� ���ϱ�");
		JoinThread t1 = new JoinThread();
		t1.start();
		try {
			t1.join();// t1 �����Ҷ����� ���
		}catch(InterruptedException e) {
			
		}
		System.out.println("result : " + t1.sum);
	}

}
