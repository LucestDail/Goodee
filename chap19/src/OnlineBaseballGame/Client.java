package OnlineBaseballGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
		Socket client = new Socket("localhost", 8000);
		BufferedReader sbr = new BufferedReader(new InputStreamReader(client.getInputStream()));
		PrintWriter pw = new PrintWriter(client.getOutputStream());
		while (true) {
			System.out.println("4 number which is different one");
			String number = sysin.readLine();
			pw.println(number);
			pw.flush();
			String data = sbr.readLine();
			System.out.println(data);
			if (data.indexOf("종료") >= 0) {
				break;
			}
		}
		sysin.close();
		sbr.close();
		pw.close();
		client.close();
	}
}
