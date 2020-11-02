import java.util.*;
import java.util.Map.Entry;

public class UnreachableSolution {

	public static String solution(String[] participant, String[] completion) {		
		Map<String,Integer> map = new HashMap<>(); // 이름, 인원수
		StringBuilder sb = new StringBuilder();
		for(String item : participant) {
			if(map.get(item) == null) {
				map.put(item, 1);
			}else{
				int buf = map.get(item) +1; // 동일한 참가자일 경우 인원수 증가
				map.put(item, buf); // 증가된 인원수 삽입
			}
		}
		for(String item : completion) {
			int buf = map.get(item) - 1;
			map.put(item, buf);
		}
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				sb.append(entry.getKey());
			}
		}
		return sb.toString();
	}

}
