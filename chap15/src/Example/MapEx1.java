package Example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map �������̽� : (key, ��ü) ������ ��ü�� ��Ƽ� �����ϴ� ��ü
 * @author GDJ30
 *
 */
public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"ȫ�浿","���","�̸���","�Ӳ���","���"};
		int[] nums = {1234,4567,2350,9870,3456};
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println("����� ��ȭ��ȣ : " + map.get("���"));
		System.out.println("ȫ�浿�� ��ȭ��ȣ : " + map.get("ȫ�浿"));
		System.out.println("�������� ��ȭ��ȣ : " + map.get("������"));
		
		Set<String> keys = map.keySet();
		for(String s : keys) {
			System.out.println(s + " : " + map.get(s));
		}
		Collection<Integer> values = map.values();
		for(int i : values) {
			System.out.println(i);
		}
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m);
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
		Integer value = map.remove("ȫ�浿");
		System.out.println(value);
		System.out.println(map);
		System.out.println("map�� ����� ���� : " + map.size());
	}

}
