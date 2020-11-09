import java.util.ArrayList;
import java.util.Collections;

public class RandomSelectorSolution {

	public static int[] solution(int[] answer) {
		// TODO Auto-generated method stub

		ArrayList<Integer> resultArray = new ArrayList<>();
		// generate player 1 number array
		int[] p1Array = new int[answer.length];
		int p1Counter = 0;
		for (int i = 0; i < answer.length; i++) {
			p1Array[i] = ++p1Counter;
			if(p1Counter > 4) {
				p1Counter = 0;
			}
		}
		
		// generate player 2 number array
		int[] p2Array = new int[answer.length];
		int[] p2ArrayElement = {1,3,4,5};
		int p2Counter = 0;
		for (int i = 0; i < answer.length; i++) {
			if(i%2 == 0) {
				p2Array[i] = 2;
			}else {
				p2Array[i] = p2ArrayElement[p2Counter++%p2ArrayElement.length];
			}
		}
		
		// generate player 3 number array
		int[] p3Array = new int[answer.length];
		int[] p3ArrayElement = {3,3,1,1,2,2,4,4,5,5};
		for (int i = 0; i < answer.length; i++) {
			p3Array[i] = p3ArrayElement[i%p3ArrayElement.length];
		}
		
		//compare correction
		int[] scoreArray = new int[3];
		for(int i = 0; i<answer.length;i++) {
			if(answer[i] == p1Array[i]) {
				scoreArray[0]++;
			}
			if(answer[i] == p2Array[i]){
				scoreArray[1]++;
			}
			if(answer[i] == p3Array[i]) {
				scoreArray[2]++;
			}
		}
		ArrayList<Integer> miniArray = new ArrayList<>();
		for(int item : scoreArray) {
			miniArray.add(item);
		}
		
		int counter = 0;
		int[] maxIndexer = new int[3];
		for(int item : miniArray) {
			if(Collections.max(miniArray) == item) {
				maxIndexer[counter] = 1;
			}else{
				maxIndexer[counter] = 0;
			}
			counter++;
		}
		int[] returnArray;
		miniArray = new ArrayList<Integer>();
		for(int i = 0; i < maxIndexer.length;i++) {
			if(maxIndexer[i] == 1) {
				miniArray.add(i+1);
			}
		}
		Collections.sort(miniArray);
		System.out.println(miniArray);
		returnArray = new int[miniArray.size()];
		counter = 0;
		for(int item : miniArray) {
			returnArray[counter++] = item;
		}
		return returnArray;
	}

}
