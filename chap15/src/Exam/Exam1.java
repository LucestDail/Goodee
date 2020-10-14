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
		System.out.println("홀수개의 숫자를 입력하세요(종료 : 999)");
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
		System.out.println("입력 데이터 : " + list);
		System.out.println("입력 데이터 합 : " + sum);
		Collections.sort(list);
		System.out.println("정렬된 데이터 : " + list);
		System.out.println("입력 데이터 중간값 : " + list.get(list.size()/2));
		System.out.println("입력 데이터 평균값 : " + sum / list.size());
	}

}