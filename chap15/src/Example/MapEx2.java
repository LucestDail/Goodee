package Example;

import java.util.*;
/**
 * TreeMap ���� : key ������ ����
 * 
 * @author GDJ30
 *
 */
public class MapEx2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(97, "ȫ�浿");
		scores.put(98, "�̸���");
		scores.put(75, "�Ӳ���");
		scores.put(94, "���");
		scores.put(80, "������");
		scores.put(88, "�����");
		System.out.println(scores);
		System.out.println("scores.firstKey() : " + scores.firstKey());
		System.out.println("scores.firstEntry() : " + scores.firstEntry());
		System.out.println("scores.firstEntry().getValue() : scores.firstEntry().getValue() = " + scores.firstEntry().getKey() + " : " + scores.firstEntry().getValue());
		System.out.println("scores.lastKey() : " + scores.lastKey());
		System.out.println("scores.lastEntry() : " + scores.lastEntry());
		System.out.println("scores.lastEntry().getValue() : scores.lastEntry().getValue() =" + scores.lastEntry().getKey() + " : " + scores.lastEntry().getValue());
		System.out.println("scores.lowerEntry(94) : " + scores.lowerEntry(94));
		System.out.println("scores.higherEntry(95) : " + scores.higherEntry(95));
		System.out.println("scores.floorEntry(94) : " + scores.floorEntry(94));
		System.out.println("scores.ceilingEntry(95) : " + scores.ceilingEntry(95));
	}

}
