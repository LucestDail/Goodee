package Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * implementation for echo server
 * @author ubuntu
 *
 */
public class EchoServerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(8000);
			while(true) {
				System.out.println("Waiting for Client access...");
				Socket client = server.accept();
				ServerThread th = new ServerThread(client);
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
	ServerThread(Socket client) {
		this.client = client;
		System.out.println("server ip : " + client.getLocalAddress());
		System.out.println("server port : " + client.getLocalPort());
		System.out.println("client ip : " + client.getInetAddress());
		System.out.println("client port : " + client.getPort());
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
			pw.print("HTTP/1.0 200 OK\r\nContent-Type:text/html\r\n\r\n".getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		String data;
		try {
			while((data = br.readLine()) != null) {
				pw.println(data);
				pw.flush();
				System.out.println("Client data : " + data);
			}
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

