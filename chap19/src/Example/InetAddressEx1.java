package Example;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress class
 *  - saving ip address information
 *   - static method for creating object
 *   	getByName("domain name")
 *   	getAllByName("domain name")
 *   	getByAddress(byte[])
 *   	getLocalHost()
 * 
 */
public class InetAddressEx1 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ip = InetAddress.getByName("www.goodee.co.kr");
		System.out.println("getByName method");
		System.out.println("host name : " + ip.getHostName());
		System.out.println("host address : " + ip.getHostAddress());
		System.out.println("getAllByName method");
		byte[] ipAddr = ip.getAddress();
		for(byte b : ipAddr) {
			System.out.print(((b<0)?256+b : b) + ".");
		}
		System.out.println();
		InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
		for(InetAddress a : ips) {
			System.out.println("IP Address : " + a);
		}
		System.out.println("getByAddress method");
		InetAddress ip2 = InetAddress.getByAddress(ipAddr);
		System.out.println(ip2);
		
		System.out.println("getLocalHost method");
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("my computer : " + local);

	}

}
