import java.util.*;

public class SqInRect {

	public static List<Integer> sqInRect(int lng, int wdth) {

		if(lng == wdth) {
			return null;
		}
		int curLng = lng;
		int curWdth = wdth;
		List<Integer> list = new LinkedList<>();
		while(true) {
			System.out.println("current value : " + curLng + ", " + curWdth);
			if (curLng > curWdth) {
				curLng = curLng - curWdth;
				list.add(curWdth);
			} else {
				curWdth = curWdth - curLng;
				list.add(curLng);
			}
			if(curLng == curWdth) {
				list.add(curLng);
				break;
			}
		}
		return list;
	}
}
