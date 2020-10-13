package Test2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		String[] phoneNumberArr = {
				   "012-3456-7890", 
				   "099-2456-7980", 
				   "088-2346-9870", 
				   "013-3456-7890", 
		};
		while(true) {
			boolean check = false;
			byte notCount = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("찾고자 하는 번호를 입력하세요(종료:q)");
			String target = scan.next();
			if(target.charAt(0) == 'q') {
				break;
			}
			for(String strArr :phoneNumberArr) {
				StringBuilder sb = new StringBuilder("");
				String[] phoneStringArr = strArr.split("-");
				for(String sItem : phoneStringArr) {
					sb.append(sItem);
				}
				String phoneString = sb.toString();
				if(phoneString.contains(target)) {
					System.out.println(strArr);
				}else {
					notCount++;
				}
			}
			if(notCount == phoneNumberArr.length) {
				System.out.println("찾고자 하는 번호가 없습니다.");
			}

		}
	}
}