package Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
/**
 * Input from keyboard,
 * transfer data from keyboard to server
 * then print from server input
 * @author ubuntu
 *
 */
public class EchoClientEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("entering your access ip address(000.000.000.000 or localhost)");
		Scanner scan = new Scanner(System.in);
		String ip = scan.nextLine();
		System.out.println("entering your access port(8000 or anything else)");
		int port = scan.nextInt();
		
		Socket client = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			String input;
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			client = new Socket(ip,port);
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
			System.out.println("Local Port : " + client.getLocalPort());
			System.out.println("Local IP : " + client.getLocalAddress());
			System.out.println("Server Port : " + client.getPort());
			System.out.println("Server IP : " + client.getInetAddress());
			while((input = stdin.readLine()) != null) {
				if(input.equals("bye")) {
					break;
				}
				pw.println(input);
				pw.flush();
				System.out.println("Server Echo : " + br.readLine());
				System.out.println("Message input");
			}
			pw.close();
			br.close();
			stdin.close();
			client.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
