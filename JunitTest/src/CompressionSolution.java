import java.util.ArrayList;

public class CompressionSolution {

	public static int[] solution(String keyword) {
		ArrayList<Integer> returnArrayList = new ArrayList<>();
		// 1. ���̰� 1�� ��� �ܾ �����ϵ��� ������ �ʱ�ȭ�Ѵ�.
		ArrayList<String> charlist = new ArrayList<>();
		charlist.add("");
		for(int i = 'A'; i <= 'Z'; i++) {
			charlist.add((char)i + "");
		}
		System.out.println("===init====");
		for(String item : charlist) {
			System.out.println(item);
		}
		
		for(int i = 0; i< keyword.length(); i++) {
			boolean checker = true;
			int counter = i;
			while(counter < keyword.length()) {
				counter++;
				String compareString = keyword.substring(i, counter);
				if(charlist.contains(compareString)) {
					continue;
				}else {
					charlist.add(compareString);
					returnArrayList.add(charlist.indexOf(keyword.substring(i,counter-1)));
					break;
				}
			}
		}
		System.out.println("===particial testing====");
		for(String item : charlist) {
			System.out.println(item + " - " + charlist.indexOf(item));
		}
		// ��� ��ȯ
		int[] returnArray = new int[returnArrayList.size()];
		for(int i = 0; i < returnArrayList.size(); i++) {
			returnArray[i] = returnArrayList.get(i);
		}
		for(int item : returnArray) {
			System.out.println(item);
		}
		return returnArray;
	}

}
