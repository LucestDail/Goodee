package OnlineBaseballGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class BaseBallServerEx {
	static List<PrintWriter> outs = new ArrayList<>();
	static List<BaseBallThread> threads = new ArrayList<>();
	static List<Integer> arr = numberSelect();

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8000);
		while (true) {
			System.out.println("Baseball Game Waiting for Client...");
			Socket client = server.accept();
			System.out.println("Client : " + client.getInetAddress());
			outs.add(new PrintWriter(client.getOutputStream()));
			BaseBallThread bt = new BaseBallThread(client, arr);
			threads.add(bt);
			bt.start();
		}
	}

	static List<Integer> numberSelect() {
		LinkedHashSet<Integer> answer = new LinkedHashSet<Integer>();
		int data;
		while (answer.size() < 4) {
			data = (int) (Math.random() * 10);
			answer.add(data);
		}
		System.out.println(answer);
		return new ArrayList<Integer>(answer);
	}
}

class BaseBallThread extends Thread {
	Socket client;
	List<Integer> arr;
	BufferedReader br;
	PrintWriter pw;
	String number;
	boolean able = true;

	public BaseBallThread(Socket client, List<Integer> arr) {
		// TODO Auto-generated constructor stub
		this.client = client;
		this.arr = arr;
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		while (able) {
			try {
				number = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			char[] carr = number.toCharArray();
			int rcvData[] = new int[4];
			int strike = 0;
			int ball = 0;
			int i, j;
			for (i = 0; i < rcvData.length; i++) {
				for (j = 0; j < rcvData.length; j++) {
					if (rcvData[i] == arr.get(j)) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			if (strike == 4) {
				pw.println(number + " is correct. game end");
				pw.flush();
				allClientClose();
				break;
			} else {
				pw.println(number + " : " + strike + " strike, " + ball + " ball");
				pw.flush();
			}
		}
	}

	private void allClientClose() {
		Iterator<PrintWriter> list = BaseBallServerEx.outs.iterator();
		BaseBallServerEx.arr = BaseBallServerEx.numberSelect();
		while (list.hasNext()) {
			PrintWriter pw = list.next();
			pw.println("another use has finished. game end");
			pw.flush();
			list.remove();
		}
		BaseBallServerEx.outs.clear();
		for (BaseBallThread t : BaseBallServerEx.threads) {
			t.able = false;
			BaseBallServerEx.threads.clear();
		}

	}

}