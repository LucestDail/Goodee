import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class hashadSolutionTest {

	int arr1 = 10;
	int arr2 = 12;
	int arr3 = 11;
	int arr4 = 13;
	
	boolean result1 = true;
	boolean result2 = true;
	boolean result3 = false;
	boolean result4 = false;

	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(result1, hashadSolution.solution(arr1));
		assertEquals(result2, hashadSolution.solution(arr2));
		assertEquals(result3, hashadSolution.solution(arr3));
		assertEquals(result4, hashadSolution.solution(arr4));
		
	}
}