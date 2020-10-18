import static org.junit.Assert.*;
import org.junit.Test;

public class DartGameSolutionTest {

	int answer1 = 37;
	int answer2 = 9;
	int answer3 = 3;
	int answer4 = 23;
	int answer5 = 5;
	int answer6 = -4;
	int answer7 = 59;

	String dartResult1 = "1S2D*3T";
	String dartResult2 = "1D2S#10S";
	String dartResult3 = "1D2S0T";
	String dartResult4 = "1S*2T*3S";
	String dartResult5 = "1D#2S*3S";
	String dartResult6 = "1T2D3D#";
	String dartResult7 = "1D2S3T*";

	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(answer1, DartGameSolution.solution(dartResult1));
		assertEquals(answer2, DartGameSolution.solution(dartResult2));
		assertEquals(answer3, DartGameSolution.solution(dartResult3));
		assertEquals(answer4, DartGameSolution.solution(dartResult4));
		assertEquals(answer5, DartGameSolution.solution(dartResult5));
		assertEquals(answer6, DartGameSolution.solution(dartResult6));
		assertEquals(answer7, DartGameSolution.solution(dartResult7));

	}

}
