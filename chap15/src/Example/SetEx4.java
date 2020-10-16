package Example;
/**
 * 사용자가 정의한 클래스의 객체를 TreeSet에 저장하기
 * 정렬관련 인터페이스
 * 1. Comparable<T> 인터페이스
 * int compareTo(T) : 객체의 기본 정렬 방식
 * 2. Comparator<T> 인터페이스
 * int compare(T,T) : 동적으로 정렬방식을 변경하는 방식
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class PhoneNo implements Comparable<PhoneNo> {
	String name;
	int number;
	public PhoneNo(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return this.name + " :" + this.number;
	}
	@Override
	public int compareTo(PhoneNo o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}

public class SetEx4 {
	public static void main(String[] args){
		System.out.println("List 이름순으로 정렬하여 출력하기");
		List<PhoneNo> list = new ArrayList<>();
		list.add(new PhoneNo("홍길동", 1234));
		list.add(new PhoneNo("김삿갓", 2345));
		list.add(new PhoneNo("이몽룡", 7890));
		
		System.out.println("TreeSet 이름순으로 정렬하여 출력하기");
		TreeSet<PhoneNo> set = new TreeSet<>(list);
		System.out.println(set);
		
		System.out.println("TreeSet 이름순으로 정렬하여 출력하기");
		TreeSet<PhoneNo> set2 = new TreeSet<>(Comparator.reverseOrder());
		set2.addAll(list);
		System.out.println(set2);
		
		System.out.println("TreeSet 전화번호순으로 정렬하여 출력하기");
		TreeSet<PhoneNo> set3 = new TreeSet<>(new Comparator<PhoneNo>() {

			@Override
			public int compare(PhoneNo o1, PhoneNo o2) {
				// TODO Auto-generated method stub
				return o1.number - o2.number;
			}
			
		});
		set3.addAll(list);
		System.out.println(set3);
		
		System.out.println("TreeSet 전화번호 역순으로 정렬하여 출력하기,람다");
		set3 = new TreeSet<>((o1,o2)->(o2.number-o1.number));
		set3.addAll(list);
		System.out.println(set3);
	}

}
