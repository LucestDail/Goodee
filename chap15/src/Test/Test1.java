package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("자연수 숫자를 입력하세요(예 - 1 3 5 7 9)");
		String input = scan.nextLine();
		String[] inputString = input.split("\s");
		System.out.print(inputString.length + "개의 자연수 : ");
		for(String item : inputString) {
			System.out.print(item + " ");
			if(Integer.parseInt(item)%2 == 1) {
				list.add(Integer.parseInt(item));
			}else {
				continue;
			}
		}
		System.out.println("인 경우");
		int[] listToIntegerArray = new int[list.size()];
		int count = 0;
		for(int item : list) {
			System.out.print(item + " ");
			listToIntegerArray[count] = item;
			count++;
		}
		System.out.println("만 홀수 이므로");
		double sum = 0;
		for(int i = 0; i < listToIntegerArray.length;i++) {
			System.out.print(listToIntegerArray[i]);
			if(i != listToIntegerArray.length-1) {
				System.out.print("+");
			}
			sum += listToIntegerArray[i];
		}
		System.out.println(" = " + sum);
		System.out.println("홀 수의 최대값 : " + Collections.max(list));
		System.out.println("최대값의 위치 : " + list.indexOf(Collections.max(list)));
		System.out.println("홀 수의 최소값 : " + Collections.min(list));
		System.out.println("최소값의 위치 : " + list.indexOf(Collections.min(list)));
		System.out.println("입력된 홀수 : " + list);
	}

}
