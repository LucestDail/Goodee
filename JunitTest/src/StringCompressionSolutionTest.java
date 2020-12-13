import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCompressionSolutionTest {

	String s1 = "";
	String s2 = "";
	String s3 = "";
	String s4 = "";
	String s5 = "";
	
	int result1 = 7;
	int result2 = 9;
	int result3 = 8;
	int result4 = 14;
	int result5 = 17;
	
	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(result1, StringCompressionSolution.solution(s1));
		assertEquals(result2, StringCompressionSolution.solution(s2));
		assertEquals(result3, StringCompressionSolution.solution(s3));
		assertEquals(result4, StringCompressionSolution.solution(s4));
		assertEquals(result5, StringCompressionSolution.solution(s5));

	}
}
