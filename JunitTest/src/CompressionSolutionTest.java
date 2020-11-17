import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class CompressionSolutionTest {
	int[] answer1 = {11, 1, 27, 15};
	int[] answer2 = {20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34};
	int[] answer3 = {1, 2, 27, 29, 28, 31, 30};

	String Result1 = "KAKAO";
	String Result2 = "TOBEORNOTTOBEORTOBEORNOT";
	String Result3 = "ABABABABABABABAB";

	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test1 ******");
//		assertTrue(Arrays.equals(answer1, CompressionSolution.solution(Result1)));
		assertTrue(Arrays.equals(answer2, CompressionSolution.solution(Result2)));
		assertTrue(Arrays.equals(answer3, CompressionSolution.solution(Result3)));
	}
}
