import static org.junit.Assert.*;
import org.junit.Test;

public class BracketSolutionTest {

	String inputString1 = "(()())()";
	String inputString2 = ")(";
	String inputString3 = "()))((()";
	String inputString4 = "(()))(";
	String inputString5 = ")()()()(";

	String outputString1 = "(()())()";
	String outputString2 = "()";
	String outputString3 = "()(())()";
	String outputString4 = "(())()";
	String outputString5 = "(((())))";

	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
//		assertEquals(outputString1, BracketSolution.solution(inputString1));
//		assertEquals(outputString2, BracketSolution.solution(inputString2));
//		assertEquals(outputString3, BracketSolution.solution(inputString3));
//		assertEquals(outputString4, BracketSolution.solution(inputString4));
		assertEquals(outputString5, BracketSolution.solution(inputString5));
	}

}
