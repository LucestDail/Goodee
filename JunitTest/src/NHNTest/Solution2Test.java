package NHNTest;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;
public class Solution2Test {
	@Test
	public void SolutionTests() {
		int testValue1 = 6;
		int[] expectedResult1 = {1, 2};
		int[] testArray1 = {2, 1, 2, 6, 2, 4, 3, 3};
		System.out.println("****** Solution Test ******");
		assertTrue(Arrays.equals(expectedResult1, Solution2.solution(testValue1, testArray1)));
	}
}
