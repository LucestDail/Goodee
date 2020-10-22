package Test;

/*
 * 1. Ÿ�� ���� ���� ���α׷� �����ϱ�
 String[] data =  { "�¿�","����","����","ȿ��","����","����","Ƽ�Ĵ�","���","����ī" };
  List<String> words = new ArrayList<String>();
 3�ʿ� �ѹ��� words�� data �� ������ �̸��� �߰��ϱ�.  => ������(DataAddThread)�� �ۼ�.
 ȭ�鿡 �Էµ� �̸���, 
 words�� ����� �̸��� ���� ��� words���� �Էµ� �̸��� �����Ѵ�.
 words�� ��� �����Ͱ� ���� �Ǹ� ���α׷��� �����Ѵ�. 
 [���]
[�¿�]
>>�¿�
[����, ȿ��]
>>����
[ȿ��, Ƽ�Ĵ�, ȿ��]
>>ȿ��
[Ƽ�Ĵ�, ȿ��, ����, ����]
>>Ƽ�Ĵ�
[ȿ��, ����, ����]
>>ȿ��
[����, ����, ����ī]
>>����
[����, ����ī, ȿ��]
>>����
[����ī, ȿ��]
>>����ī
[ȿ��, ����ī]
>>ȿ��
[����ī, ���]
>>����ī
[���]
>>���
[Ƽ�Ĵ�]
>>Ƽ�Ĵ�
���α׷� ����
 */
import java.util.*;

class DataAddThread extends Thread {

	public void run() {
		while (true) {
			Database.words.add(Database.data[(int) (Math.random()*(Database.data.length))]);
			try {
				sleep(Test4.i_input*1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Database {
	static String[] data = { "�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī" };
	static List<String> words = new ArrayList<String>();
}

public class Test4 {

	static int i_input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i_scan = new Scanner(System.in);
		System.out.println("�ܾ� ���� ������ �Է��ϼ���(�ʴ�����) -> ��) 5 �Է½�, 5�ʿ� �ѹ� ����");
		i_input = i_scan.nextInt();
		System.out.println("ȭ�鿡 ��Ÿ���� �̸���" + i_input + "�ʾȿ� �Է��ϼ���!");
		Database.words.add(Database.data[0]);
		Thread trd = new DataAddThread();
		trd.setDaemon(true);
		trd.start();
		while (!Database.words.isEmpty()) {
			System.out.println(Database.words);
			Scanner scan = new Scanner(System.in);
			System.out.print(">>");
			String input = scan.nextLine();
			Database.words.remove(input);
		}
		System.out.println("�����մϴ�! �׽�Ʈ ���!");
	}
}
