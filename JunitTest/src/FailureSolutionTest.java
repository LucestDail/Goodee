import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class FailureSolutionTest {

	@Test
	public void SolutionTests() {
		int testValue1 = 5;
		int testValue2 = 4;
		int[] expectedResult1 = {3,4,2,1,5};
		int[] expectedResult2 = {4,1,2,3};
		int[] testArray1 = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] testArray2 = {4,4,4,4,4};
		System.out.println("****** Solution Test ******");
		assertTrue(Arrays.equals(expectedResult1, FailureSolution.solution(testValue1, testArray1)));
		assertTrue(Arrays.equals(expectedResult2, FailureSolution.solution(testValue2, testArray2)));
	}
}
