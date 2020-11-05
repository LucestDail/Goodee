package OnlineBaseballGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("entering your access ip address(000.000.000.000 or localhost)");
//		Scanner scan = new Scanner(System.in);
//		String ip = scan.nextLine();
//		System.out.println("entering your access port(8000 or anything else)");
//		int port = scan.nextInt();
//		scan.close();
		String ip = "localhost";
		int port = 8000;
		Socket client = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			String input;
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			client = new Socket(ip, port);
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			pw = new PrintWriter(client.getOutputStream());
			while ((input = stdin.readLine()) != null) {
				if (input.equals("bye")) {
					System.out.println("중도 포기!");
					break;
				}
				pw.println(input);
				pw.flush();
				System.out.println(br.readLine());
				System.out.println(br.readLine());
			}
			pw.close();
			br.close();
			stdin.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
