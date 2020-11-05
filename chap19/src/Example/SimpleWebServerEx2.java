package Example;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServerEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(8000);
		while(true) {
			System.out.println("Waiting for Client access");
			Socket client = server.accept();
			HttpThread t = new HttpThread(client);
			t.start();
		}
	}
	static class HttpThread extends Thread{
		private Socket client;
		BufferedReader br;
		OutputStream ps;
		HttpThread(Socket client){
			this.client = client;
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				ps = client.getOutputStream();
			}catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("server ip : " + client.getLocalAddress());
			System.out.println("server port : " + client.getLocalPort());
			System.out.println("client ip : " + client.getInetAddress());
			System.out.println("client port : " + client.getPort());
		}
		public void run() {
			FileInputStream is = null;
			try {
				String line = br.readLine();
				System.out.println("Heep Header : " + line);
				int start = line.indexOf("/") + 1;
				int end = line.lastIndexOf("HTTP") - 1;
				String filename = line.substring(start,end);
				if(filename.equals("")) {
					filename = "index.html";
				}
				is = new FileInputStream(filename);
				byte[] data = new byte[is.available()];
				int len = 0;
				while((len = is.read(data)) != -1) {
					ps.write(data,0,len);
					ps.flush();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(is != null) {
						is.close();
					}
					if(br != null) {
						br.close();
					}
					if(ps != null) {
						ps.close();
					}
					if(client != null) {
						client.close();
					}
				}catch(IOException e) {}
			}
		}
	}
}
