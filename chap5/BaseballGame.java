package chap5;
import java.util.*;

public class BaseballGame {

	public static void main(String[] args) {
		
		// �ʿ� ��� ����
		Scanner scan = new Scanner(System.in);
		
		//��� ����
		final int MAXNUM = 4;
		
		//���� ���� ����
		int randomArray[] = new int[MAXNUM];
		int inputArray[] = new int[MAXNUM];
		
		//�⺻ ���� ����
		boolean end = false;
		int count = 0;
		
		// ���� ���� �˰���
		while(!end) { // �ߺ� ���ϴ� ���� 4�� ����
			end = true;
			for(int i = 0; i < randomArray.length;i++) {
				randomArray[i] = (int)(Math.random()*9)+1;
			}
			for(int i = 0; i<randomArray.length; i++) {
				for(int j = 0;j<randomArray.length;j++) {
					if(i == j) {
						continue;
					}else {
						if(randomArray[i] == randomArray[j]) {
							end = false;
						}
					}
				}
			}
		}
		// ���� ���� �˰��� ����

		
		// ���� �˰���
		end = false;
		while(!end) {
			int ballCount = 0;
			int strikeCount = 0;
			System.out.println("���� �ٸ� 4�ڸ� ������ �Է��ϼ���");
			String input = scan.next();
			count++;
			// �Է� ���� ���� �迭�� ����
			for(int i = 0; i<input.length();i++) {
				inputArray[i] = input.charAt(i)-'0';
			}
			for(int i = 0;i<randomArray.length;i++) {
				if(randomArray[i] == inputArray[i]) {
					strikeCount++;
				}else {
					ballCount++;
				}
			}
			if(strikeCount == 4) {
				System.out.println(input + " : �����Դϴ�.");
				System.out.println(count + "�� ���� ���߼̽��ϴ�. ������ �����մϴ�.");
				end = true;
			}else {
				System.out.println(input + " : " + strikeCount +"��Ʈ����, " + ballCount + "��");
			}
		}
		// ���� ����
		
	}
}