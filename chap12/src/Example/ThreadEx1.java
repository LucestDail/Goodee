package Example;
/**
 * Thread 객체 생성하기
 * 1. Thread 클래스의 하위 클래스로 스레드 객체 생성
 * 2. Runnable 인터페이스를 구현한 객체
 * 
 * new 상태 : 객체를 만듬. 스레드 기동 준비
 * Runnable 상태 : start() 메소드를 통해서 스레드 객체가 시작
 * 이때 스택 영역을 병렬화함 -> run 메소드를 호출
 * 이후 스케쥴러에 의해서 run 실행으로 이동함
 * 
 * 스레드를 만들고 싶은데 상속받을 일이 있으면 스레드를 못만듬
 * -> 따라서 스레드 구현할 수 있는 인터페이스를 마련
 * -> 단, Runnable 인터페이스는 스레드가 아니므로, 스레드를 따로 만들어야함.
 * @author GDJ30
 *
 */

class Thread1 extends Thread{
	Thread1(String name){
		super(name);
	}
	
	@Override
	public void run() { //2. runnable -> 3. running 통해 넘어옴, 스레드가 수행할 기능 명시
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "=" + getName());
			try {
				sleep(1000); // 4. 대기 상태 -> runnable 상태로 변경, 스케쥴러 running 이행 대기
			}catch(InterruptedException e) {
				
			}
		}
	}// 3. running -> 5. dead 상태로 변경, 스레드 실행 종료(스택에서 메모리 제거)
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Thread1 t1 = new Thread1("first"); // 객체 생성상태(1. new 상태)
		Thread1 t2 = new Thread1("Second");
		t1.start();// 1. new -> 2. runnable 넘어감
		t2.start();
		System.out.println("main 스레드 종료");
		
	}

}
