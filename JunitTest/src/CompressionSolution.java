import java.util.ArrayList;

public class CompressionSolution {

	public static int[] solution(String keyword) {
		ArrayList<Integer> returnArrayList = new ArrayList<>();
		// 1. ���̰� 1�� ��� �ܾ �����ϵ��� ������ �ʱ�ȭ�Ѵ�.
		ArrayList<Character> charlist = new ArrayList<>();
		for(int i = 'A'; i <= 'Z'; i++) {
			charlist.add((char)i);
		}
		for(char item : charlist) {
			System.out.println(item);
		}
		
		
		
		
		
		
		// ��� ��ȯ
		int[] returnArray = new int[returnArrayList.size()];
		for(int i = 0; i < returnArrayList.size(); i++) {
			returnArray[i] = returnArrayList.get(i);
		}
		return returnArray;
	}

}
