package Exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Ȧ������ ���ڸ� �Է��ϼ���(���� : 999)");
		double sum = 0;
		while(true) {
			int target = scan.nextInt();
			if(target == 999) {
				break;
			}
			list.add(target);
			sum += target;
		}
		if(list.size() %2 == 0) {
			list.remove(list.size() - 1);
		}
		System.out.println("�Է� ������ : " + list);
		System.out.println("�Է� ������ �� : " + sum);
		Collections.sort(list);
		System.out.println("���ĵ� ������ : " + list);
		System.out.println("�Է� ������ �߰��� : " + list.get(list.size()/2));
		System.out.println("�Է� ������ ��հ� : " + sum / list.size());
	}

}