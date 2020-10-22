package Test;

/*
1. 1부터 1000까지의 합을 5개의 스레드가 나누어 합을 구하기 : Thread 클래스를 상속받는 방식으로 구현하기
t1 : 1 ~ 200까지 합
t2 : 201 ~400까지 합
t3 : 401 ~ 600까지 합
t4 : 601 ~ 800까지 합
t5 : 801 ~ 1000까지 합
main 스레드 : 모든 스레드가 종료할때 까지 기다렸다가 
모든 스레드의 합을 더해서 1 ~ 1000까지의 합 출력하는 프로그램 구현하기 
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
			t1.join();// t1 종료할때까지 대기
			t2.join();// t2 종료할때까지 대기
			t3.join();// t3 종료할때까지 대기
			t4.join();// t4 종료할때까지 대기
			t5.join();// t5 종료할때까지 대기
		}catch(InterruptedException e) {
			
		}
		System.out.println("result : " + (t1.sum + t2.sum + t3.sum + t4.sum + t5.sum));
	}

}
