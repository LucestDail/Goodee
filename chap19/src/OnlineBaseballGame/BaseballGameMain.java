package OnlineBaseballGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BaseballGameMain {

	public static void main(String[] args) {
		//���� ����
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
			pw.println("�߱� ������ �����մϴ�.");
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
				pw.println("���� �ٸ� 4�ڸ� ������ �Է��ϼ���");pw.flush();
				String input = br.readLine();
				count++;
				// �Է� ���� ���� �迭�� ����
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
					pw.println(input + " : �����Դϴ�.");pw.flush();
					pw.println(count + "�� ���� ���߼̽��ϴ�. ������ �����մϴ�.");pw.flush();
					end = true;
				} else {
					pw.println(input + " : " + strikeCount + "��Ʈ����, " + ballCount + "��");pw.flush();
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
