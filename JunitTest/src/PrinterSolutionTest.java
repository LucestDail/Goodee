import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrinterSolutionTest {

	int[] priorities1 = {2,1,3,2};
	int[] priorities2 = {1,1,9,1,1,1};
	
	int location1 = 2;
	int location2 = 0;

	int result1 = 1;
	int result2 = 5;

	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(result1, PrinterSolution.solution(priorities1,location1));
		assertEquals(result2, PrinterSolution.solution(priorities2,location2));
	}
}
