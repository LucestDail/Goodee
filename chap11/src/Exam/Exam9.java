package Exam;

import java.util.*;

public class Exam9 {
	public static void main(String[] args) {
		Random randUser = new Random(System.currentTimeMillis());
		Random randSys =new Random(System.currentTimeMillis()+100);
		while(true) {
			int userCount = 0;
			int sysCount = 0;
			
			for(int i = 0; i < 3; i++) {
				boolean randomUserTF = randUser.nextBoolean();
				System.out.print("uesr : ");
				System.out.print(randomUserTF);
				if(randomUserTF)
					userCount++;
				boolean randomSysTF = randSys.nextBoolean();
				System.out.print("\t sys : ");
				System.out.println(randomSysTF);
				if(randomSysTF)
					sysCount++;
			}
			if(userCount == 3) {
				System.out.println("User �¸�!");
				break;
			}
			if(sysCount == 3) {
				System.out.println("System �¸�!");
				break;
			}
		}
	}

}
