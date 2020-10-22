package Test;

/*
 * 1. 타자 연습 게임 프로그램 구현하기
 String[] data =  { "태연","유리","윤아","효연","수영","서현","티파니","써니","제시카" };
  List<String> words = new ArrayList<String>();
 3초에 한번씩 words에 data 중 임의의 이름을 추가하기.  => 스레드(DataAddThread)로 작성.
 화면에 입력된 이름과, 
 words에 저장된 이름이 같은 경우 words에서 입력된 이름을 삭제한다.
 words에 모든 데이터가 삭제 되면 프로그램을 종료한다. 
 [결과]
[태연]
>>태연
[윤아, 효연]
>>윤아
[효연, 티파니, 효연]
>>효연
[티파니, 효연, 유리, 서현]
>>티파니
[효연, 유리, 서현]
>>효연
[유리, 서현, 제시카]
>>유리
[서현, 제시카, 효연]
>>서현
[제시카, 효연]
>>제시카
[효연, 제시카]
>>효연
[제시카, 써니]
>>제시카
[써니]
>>써니
[티파니]
>>티파니
프로그램 종료
 */
import java.util.*;

class DataAddThread extends Thread {

	public void run() {
		while (true) {
			Database.words.add(Database.data[(int) (Math.random()*(Database.data.length))]);
			try {
				sleep(Test4.i_input*1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Database {
	static String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };
	static List<String> words = new ArrayList<String>();
}

public class Test4 {

	static int i_input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i_scan = new Scanner(System.in);
		System.out.println("단어 생성 간격을 입력하세요(초단위임) -> 예) 5 입력시, 5초에 한번 생성");
		i_input = i_scan.nextInt();
		System.out.println("화면에 나타나는 이름을" + i_input + "초안에 입력하세요!");
		Database.words.add(Database.data[0]);
		Thread trd = new DataAddThread();
		trd.setDaemon(true);
		trd.start();
		while (!Database.words.isEmpty()) {
			System.out.println(Database.words);
			Scanner scan = new Scanner(System.in);
			System.out.print(">>");
			String input = scan.nextLine();
			Database.words.remove(input);
		}
		System.out.println("축하합니다! 테스트 통과!");
	}
}
