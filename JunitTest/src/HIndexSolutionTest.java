import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class HIndexSolutionTest {
	
	int[] citations1 = {3,0,6,1,5};
	int[] citations2 = {12,11,10,9,8,1};
	int[] citations3 = {6,6,6,6,6,1};
	int[] citations4 = {4,4,4};
	int[] citations5 = {4,4,4,5,0,1,2,3};
	int[] citations6 = {10,11,12,13};
	int[] citations7 = {31,66};
	int[] citations8 = {0,0,1,1};
	int[] citations9 = {0,1};
	int[] citations0 = {10,9,4,1,1};

	int returnValue1 = 3;
	int returnValue2 = 5;
	int returnValue3 = 5;
	int returnValue4 = 3;
	int returnValue5 = 4;
	int returnValue6 = 4;
	int returnValue7 = 2;
	int returnValue8 = 1;
	int returnValue9 = 1;
	int returnValue0 = 3;
	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(returnValue1, HIndexSolution.solution(citations1));
		assertEquals(returnValue2, HIndexSolution.solution(citations2));
		assertEquals(returnValue3, HIndexSolution.solution(citations3));
		assertEquals(returnValue4, HIndexSolution.solution(citations4));
		assertEquals(returnValue5, HIndexSolution.solution(citations5));
		assertEquals(returnValue6, HIndexSolution.solution(citations6));
		assertEquals(returnValue7, HIndexSolution.solution(citations7));
		assertEquals(returnValue8, HIndexSolution.solution(citations8));
		assertEquals(returnValue9, HIndexSolution.solution(citations9));
		assertEquals(returnValue0, HIndexSolution.solution(citations0));
	}

}
