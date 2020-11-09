import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class RandomSelectorSolutionTest {

	
	
	@Test
	public void SolutionTests() {
		int[] answer1 = {1,2,3,4,5};
		int[] answer2 = {1,3,2,4,2};
		
		int[] result1 = {1};
		int[] result2 = {1,2,3};
		System.out.println("****** Solution Test ******");
		assertTrue(Arrays.equals(result1, RandomSelectorSolution.solution(answer1)));
		assertTrue(Arrays.equals(result2, RandomSelectorSolution.solution(answer2)));
	}
}
