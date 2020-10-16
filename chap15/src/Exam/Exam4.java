package Exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 1. �븸�α� = ����, ĳ���� = ��Ÿ��, ���� = ������ hashMap�� ����
 * 		ȭ�鿡�� ���� �̸��� �Է¹޾� �ش� ������ ������ ����ϴ� ���α׷� �����ϱ�
 * 		���� ��ϵ� ���� �ƴ� ��� ��ϵ� ���� �ƴմϴ� ���
 * 2. '����' ���ڰ� �ԷµǸ� ���α׷� ����
 * @author GDJ30
 *
 */

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		String[] nation = {"���ѹα�","ĳ����","����"};
		String[] country = {"����","��Ÿ��","����"};
		final String endMessage = "����";
		for(int i = 0; i < nation.length; i++) {
			map.put(nation[i], country[i]);
		}
		System.out.println(map);
		while(true) {
			System.out.println("���� �̸��� �Է��ϼ���");
			Scanner scan = new Scanner(System.in);
			String target = scan.nextLine();
			if(target.equals(endMessage)) {
				break;
			}
			if(map.containsKey(target)) {
				System.out.println(map.get(target));
			}else {
				System.out.println("��ϵ� ���� �ƴմϴ�.");
			}
		}

	}

}
