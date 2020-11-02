import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CollatzSolutionTest {

	int n1 = 6;
	int n2 = 16;
	int n3 = 626331;
	
	int result1 = 8;
	int result2 = 4;
	int result3 = -1;

	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(result1, CollatzSolution.solution(n1));
		assertEquals(result2, CollatzSolution.solution(n2));
		assertEquals(result3, CollatzSolution.solution(n3));		
	}
}
