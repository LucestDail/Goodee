package Example;

import java.util.*;
/**Iterator 인터페이스
 * 반복자라고 불립
 * Collection 객체는 Iterator 객체로 변환이 가능함
 * iterator() 메소드를 이용하여 형변환 가능
 * boolean hasNext() : 조회 대상 객체가 존재?
 * Object next() : 조회 순서대로 객체 반환
 * void remove() : 조회된 객체를 제거
 * 
 * Enumeration 인터페이스 : Iterator 구버전, 반복자
 * Collection 프레임워크 이전에 사용하던 반복자
 * Vector, Hashtable 만 사용이 가능
 * boolean hasMoreElement() : 조회 대상 객체가 존재?
 * Object nextElement() : 조회 순서대로 객체 반환
 * 
 * listIterator
 * @author GDJ30
 *
 */
public class IteratorEx1 {

	public static void main(String[] args) {
		Iterator it = null;
		List list = new ArrayList();
		Set set = new HashSet();
		for(int i = 1;i<=5;i++) {
			list.add(i+10);
			set.add(i*10);
		}
		it = list.iterator();
		print(it);
		it = set.iterator();
		print(it);
		System.out.println(list);
		System.out.println(set);
	}

	private static void print(Iterator it) {
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
	}

}
