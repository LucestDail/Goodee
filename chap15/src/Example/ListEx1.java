package Example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class ListEx1 {
	public static void main(String[] ags) {
		List<Integer> list = new ArrayList<Integer>();
		//List<Integer> list = new Vector<Integer>();
		//List<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(0);
		list.add(0);
		
		System.out.println(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		List<Integer> list2 = new ArrayList<>(list.subList(1, 4));
		//jdk 8.0 ���� ���� �ڷ����� ��� ���Կ����� ���� ���ʸ� ǥ�� ���� ����!
		System.out.println(list2);
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
	}

}
