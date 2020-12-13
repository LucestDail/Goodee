import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SkilltreeSolutionTest {

	String skill = "CBD";
	String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
	int result = 2;
	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(result, SkilltreeSolution.solution(skill, skill_trees));


	}
}
