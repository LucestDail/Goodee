package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("�ڿ��� ���ڸ� �Է��ϼ���(�� - 1 3 5 7 9)");
		String input = scan.nextLine();
		String[] inputString = input.split("\s");
		System.out.print(inputString.length + "���� �ڿ��� : ");
		for(String item : inputString) {
			System.out.print(item + " ");
			if(Integer.parseInt(item)%2 == 1) {
				list.add(Integer.parseInt(item));
			}else {
				continue;
			}
		}
		System.out.println("�� ���");
		int[] listToIntegerArray = new int[list.size()];
		int count = 0;
		for(int item : list) {
			System.out.print(item + " ");
			listToIntegerArray[count] = item;
			count++;
		}
		System.out.println("�� Ȧ�� �̹Ƿ�");
		double sum = 0;
		for(int i = 0; i < listToIntegerArray.length;i++) {
			System.out.print(listToIntegerArray[i]);
			if(i != listToIntegerArray.length-1) {
				System.out.print("+");
			}
			sum += listToIntegerArray[i];
		}
		System.out.println(" = " + sum);
		System.out.println("Ȧ ���� �ִ밪 : " + Collections.max(list));
		System.out.println("�ִ밪�� ��ġ : " + list.indexOf(Collections.max(list)));
		System.out.println("Ȧ ���� �ּҰ� : " + Collections.min(list));
		System.out.println("�ּҰ��� ��ġ : " + list.indexOf(Collections.min(list)));
		System.out.println("�Էµ� Ȧ�� : " + list);
	}

}
