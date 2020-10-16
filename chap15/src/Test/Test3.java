package Test;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class BasicSet<T>{
	Set<T> set;
	BasicSet(Set<T> set){
		this.set = set;
	}
}

class GenerateSet extends BasicSet<Object>{
	GenerateSet(Set<Object> set) {
		super(set);
		// TODO Auto-generated constructor stub
	}
	
	public Set<Object> generateNumber(){
		while(true) {
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			if(input == 0) {
				break;
			}
			if(input > 0 && input < 100) {
				set.add(input);
			}
		}
		return set;
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1부터 99까지의 숫자를 입력하세요 (종료 : 0)");
		Set<Object> set = new TreeSet<>();
		set = new GenerateSet(set).generateNumber();
		
		Set<Object> set1 = new TreeSet<>(set);
		System.out.println("set1 : " + set1);
		
		Set<Object> set2 = new TreeSet<>(Collections.reverseOrder());
		set2.addAll(set);
		System.out.println("set2 : " + set2);
		
		
	}

}
