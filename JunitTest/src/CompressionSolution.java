import java.util.ArrayList;

public class CompressionSolution {

	public static int[] solution(String keyword) {
		ArrayList<Integer> returnArrayList = new ArrayList<>();
		// 1. 길이가 1인 모든 단어를 포함하도록 사전을 초기화한다.
		ArrayList<Character> charlist = new ArrayList<>();
		for(int i = 'A'; i <= 'Z'; i++) {
			charlist.add((char)i);
		}
		for(char item : charlist) {
			System.out.println(item);
		}
		
		
		
		
		
		
		// 결과 반환
		int[] returnArray = new int[returnArrayList.size()];
		for(int i = 0; i < returnArrayList.size(); i++) {
			returnArray[i] = returnArrayList.get(i);
		}
		return returnArray;
	}

}
