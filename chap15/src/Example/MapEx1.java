package Example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map ÀÎÅÍÆäÀÌ½º : (key, °´Ã¼) ½ÖÀ¸·Î °´Ã¼¸¦ ¸ğ¾Æ¼­ ÀúÀåÇÏ´Â °´Ã¼
 * @author GDJ30
 *
 */
public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","ÀÓ²©Á¤","±è»ñ°«"};
		int[] nums = {1234,4567,2350,9870,3456};
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println("±è»ñ°«ÀÇ ÀüÈ­¹øÈ£ : " + map.get("±è»ñ°«"));
		System.out.println("È«±æµ¿ÀÇ ÀüÈ­¹øÈ£ : " + map.get("È«±æµ¿"));
		System.out.println("¼ºÃáÇâÀÇ ÀüÈ­¹øÈ£ : " + map.get("¼ºÃáÇâ"));
		
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
		
		Integer value = map.remove("È«±æµ¿");
		System.out.println(value);
		System.out.println(map);
		System.out.println("mapÀÇ ¿ä¼ÒÀÇ °¹¼ö : " + map.size());
	}

}
