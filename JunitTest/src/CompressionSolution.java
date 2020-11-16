import java.util.ArrayList;

public class CompressionSolution {

	public static int[] solution(String keyword) {
		int[] returnArray = {};
		
		ArrayList<Character> charlist = new ArrayList<>();
		for(int i = 'A'; i < 'Z'; i++) {
			charlist.add((char)i);
		}
		
		for(int i = 0; i < keyword.length(); i++) {
			if(charlist.contains(keyword.charAt(i))){
				
			}
		}
		
		// TODO Auto-generated method stub
		return returnArray;
	}
	private int findIndex() {
		
		return 1;
	}

}
