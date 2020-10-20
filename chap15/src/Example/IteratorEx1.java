package Example;

import java.util.*;
/**Iterator �������̽�
 * �ݺ��ڶ�� �Ҹ�
 * Collection ��ü�� Iterator ��ü�� ��ȯ�� ������
 * iterator() �޼ҵ带 �̿��Ͽ� ����ȯ ����
 * boolean hasNext() : ��ȸ ��� ��ü�� ����?
 * Object next() : ��ȸ ������� ��ü ��ȯ
 * void remove() : ��ȸ�� ��ü�� ����
 * 
 * Enumeration �������̽� : Iterator ������, �ݺ���
 * Collection �����ӿ�ũ ������ ����ϴ� �ݺ���
 * Vector, Hashtable �� ����� ����
 * boolean hasMoreElement() : ��ȸ ��� ��ü�� ����?
 * Object nextElement() : ��ȸ ������� ��ü ��ȯ
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
