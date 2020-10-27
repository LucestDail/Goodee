

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class MatrixSolutionTest {

	@Test
	public void SolutionTests() {
		int testValue1 = 6;
		int testValue2 = 5;
		String expectedResult11 = "3";
		String expectedResult12 = "4 5 7";
		String expectedResult2 = "0";
		int[] testArray1 = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] testArray2 = {4,4,4,4,4};
		System.out.println("****** Solution Test ******");
		assertTrue(Arrays.equals(expectedResult1, FailureSolution.solution(testValue1, testArray1)));
		assertTrue(Arrays.equals(expectedResult2, FailureSolution.solution(testValue2, testArray2)));
	}
}
