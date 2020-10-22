package Test;

/*
1. 1���� 1000������ ���� 5���� �����尡 ������ ���� ���ϱ� : Thread Ŭ������ ��ӹ޴� ������� �����ϱ�
t1 : 1 ~ 200���� ��
t2 : 201 ~400���� ��
t3 : 401 ~ 600���� ��
t4 : 601 ~ 800���� ��
t5 : 801 ~ 1000���� ��
main ������ : ��� �����尡 �����Ҷ� ���� ��ٷȴٰ� 
��� �������� ���� ���ؼ� 1 ~ 1000������ �� ����ϴ� ���α׷� �����ϱ� 
*/
class JoinThread2 implements Runnable{
	int target;
	JoinThread2(int target){
		this.target = target;
	}
	public void run() {
		for(int i = 0; i <= target; i++) {
			Test3.sum += i;
		}
	}
}

public class Test3 {

	static long sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new JoinThread2(200));
		Thread t2 = new Thread(new JoinThread2(400));
		Thread t3 = new Thread(new JoinThread2(600));
		Thread t4 = new Thread(new JoinThread2(800));
		Thread t5 = new Thread(new JoinThread2(1000));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			t1.join();// t1 �����Ҷ����� ���
			t2.join();// t2 �����Ҷ����� ���
			t3.join();// t3 �����Ҷ����� ���
			t4.join();// t4 �����Ҷ����� ���
			t5.join();// t5 �����Ҷ����� ���
		}catch(InterruptedException e) {
			
		}
		System.out.println("result : " + (sum));
	}

}