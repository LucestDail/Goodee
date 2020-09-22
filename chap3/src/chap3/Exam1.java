package chap3;
import java.util.*;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("input your second");
		int second = scan.nextInt();
		int last = 0;
		int MinToSec = 60;
		int HourToSec = MinToSec * 60; 
		int hour = second / HourToSec;
		last = second % HourToSec;
		int min = last / MinToSec;
		int sec = last % MinToSec;
		System.out.println("input second : " + second +
				", convert : " + hour + ":" + min + ":" + sec);
	}
}
