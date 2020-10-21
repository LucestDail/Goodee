import static org.junit.Assert.*;
import org.junit.Test;


public class ThirdSolutionTest {

	int testCase1 = 45;
	int testResult1 = 7;
	int testCase2 = 125;
	int testResult2 = 229;
	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(testResult1, ThirdSolution.solution(testCase1));
		assertEquals(testResult2, ThirdSolution.solution(testCase2));
	}
}
