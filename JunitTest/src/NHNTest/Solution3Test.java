package NHNTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Solution3Test {
	int testCase1 = 45;
	int testResult1 = 7;
	int testCase2 = 125;
	int testResult2 = 229;
	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(testResult1, Solution3.solution(testCase1));
		assertEquals(testResult2, Solution3.solution(testCase2));
	}
}
