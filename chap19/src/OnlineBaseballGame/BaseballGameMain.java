package OnlineBaseballGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BaseballGameMain {

	public static void main(String[] args) {
		//랜덤 생성
		int randomArray[] = new GenerateRandom().GenerateRandomArray();
		System.out.print("hello! target number is ");
		for(int item : randomArray) {
			System.out.print(item + " ");
		}
		System.out.println();
		try {
			ServerSocket server = new ServerSocket(8000);
			while(true) {
				System.out.println("Waiting for Client access...");
				Socket client = server.accept();
				ServerThread th = new ServerThread(randomArray,client);
				th.start();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

class ServerThread extends Thread{
	private Socket client;
	BufferedReader br;
	PrintWriter pw;
	int[] randomArray;
	ServerThread(int[] randomArray,Socket client) {
		this.client = client;
		this.randomArray = randomArray;
		try {
			System.out.println("Player(" + client.getInetAddress()+") has entered");
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
			pw.println("야구 게임을 시작합니다.");
			pw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
//		String data;
		int[] array = this.randomArray;
//		Scanner scan = new Scanner(System.in);
		ConstValue c = new ConstValue();
		try {
			int count = 0;
			boolean end = false;
			int inputArray[] = new int[c.MAXNUM];
			while (!end) {
				int ballCount = 0;
				int strikeCount = 0;
				pw.println("서로 다른 4자리 정수를 입력하세요");pw.flush();
				String input = br.readLine();
				count++;
				// 입력 받은 정수 배열에 삽입
				for (int i = 0; i < input.length(); i++) {
					inputArray[i] = input.charAt(i) - '0';
				}
				for (int i = 0; i < array.length; i++) {
					if (array[i] == inputArray[i]) {
						strikeCount++;
					} else {
						ballCount++;
					}
				}
				if (strikeCount == 4) {
					pw.println(input + " : 정답입니다.");pw.flush();
					pw.println(count + "번 만에 맞추셨습니다. 게임을 종료합니다.");pw.flush();
					end = true;
				} else {
					pw.println(input + " : " + strikeCount + "스트라익, " + ballCount + "볼");pw.flush();
				}
			}
//			while((data = br.readLine()) != null) {
//				pw.println("it is echo");
//				pw.flush();
//				System.out.println("Client data : " + data);
//			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(pw != null) {
					pw.close();
				}
				if(client != null) {
					client.close();
				}
			}catch(IOException e) {}
		}
	}
	
}
