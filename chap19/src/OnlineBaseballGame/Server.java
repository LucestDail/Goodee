package OnlineBaseballGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//import java.util.Scanner;
//
//class ServerThread extends Thread{
//	private Socket client;
//	BufferedReader br;
//	PrintWriter pw;
//	int[] randomArray;
//	ServerThread(int[] randomArray,Socket client) {
//		this.client = client;
//		this.randomArray = randomArray;
//		try {
//			System.out.println("Player(" + client.getInetAddress()+") has entered");
//			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
//			pw = new PrintWriter(client.getOutputStream());
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
//	public void run() {
////		String data;
//		int[] array = this.randomArray;
////		Scanner scan = new Scanner(System.in);
//		ConstValue c = new ConstValue();
//		try {
//			System.out.println("�߱� ������ �����մϴ�.");
//			int count = 0;
//			boolean end = false;
//			int inputArray[] = new int[c.MAXNUM];
//			while (!end) {
//				int ballCount = 0;
//				int strikeCount = 0;
//				pw.println("���� �ٸ� 4�ڸ� ������ �Է��ϼ���");pw.flush();
//				String input = br.readLine();
//				count++;
//				// �Է� ���� ���� �迭�� ����
//				for (int i = 0; i < input.length(); i++) {
//					inputArray[i] = input.charAt(i) - '0';
//				}
//				for (int i = 0; i < array.length; i++) {
//					if (array[i] == inputArray[i]) {
//						strikeCount++;
//					} else {
//						ballCount++;
//					}
//				}
//				if (strikeCount == 4) {
//					System.out.println(input + " : �����Դϴ�.");
//					System.out.println(count + "�� ���� ���߼̽��ϴ�. ������ �����մϴ�.");
//					end = true;
//				} else {
//					System.out.println(input + " : " + strikeCount + "��Ʈ����, " + ballCount + "��");
//				}
//			}
////			while((data = br.readLine()) != null) {
////				pw.println("it is echo");
////				pw.flush();
////				System.out.println("Client data : " + data);
////			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//				if(pw != null) {
//					pw.close();
//				}
//				if(client != null) {
//					client.close();
//				}
//			}catch(IOException e) {}
//		}
//	}
//	
//}
