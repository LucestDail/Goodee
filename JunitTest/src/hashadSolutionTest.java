import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class hashadSolutionTest {

	String[] participant1 = {"leo", "kiki", "eden"};
	String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
	String[] participant3 = {"mislav", "stanko", "mislav", "ana"};

	String[] completion1 = {"eden", "kiki"};
	String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
	String[] completion3 = {"stanko", "ana", "mislav"};

	String answer1 = "leo";
	String answer2 = "vinko";
	String answer3 = "mislav";

	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(answer1, UnreachableSolution.solution(participant1,completion1));
		assertEquals(answer2, UnreachableSolution.solution(participant2,completion2));
		assertEquals(answer3, UnreachableSolution.solution(participant3,completion3));
	}
}