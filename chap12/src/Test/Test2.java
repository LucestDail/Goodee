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
class JoinThread extends Thread{
	long sum = 0;
	int target;
	JoinThread(int target){
		this.target = target;
	}
	public void run() {
		for(int i = 0; i <= this.target; i++) {
			sum += i;
		}
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinThread t1 = new JoinThread(200);
		JoinThread t2 = new JoinThread(400);
		JoinThread t3 = new JoinThread(600);
		JoinThread t4 = new JoinThread(800);
		JoinThread t5 = new JoinThread(1000);
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
		System.out.println("result : " + (t1.sum + t2.sum + t3.sum + t4.sum + t5.sum));
	}

}
