import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BigNumberSolutionTest {

	int[] numbers1 = {6, 10, 2};
	int[] numbers2 = {3, 30, 34, 5, 9};
	int[] numbers3 = {5, 546};
	String return1 = "6210";
	String return2 = "9534330";
	String return3 = "5546";
	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(return1, BigNumberSolution.solution(numbers1));
		assertEquals(return2, BigNumberSolution.solution(numbers2));
	}
}
