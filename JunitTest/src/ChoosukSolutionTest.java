import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChoosukSolutionTest {
	
	String[] lines1 = {"2016-09-15 00:00:00.000 3s"};
	String[] lines2 = {"2016-09-15 23:59:59.999 0.001s"};
	String[] lines3 = {"2016-09-15 01:00:04.001 2.0s", "2016-09-15 01:00:07.000 2s"};
	String[] lines4 = {"2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s"};
	String[] lines5 = {"2016-09-15 20:59:57.421 0.351s", "2016-09-15 20:59:58.233 1.181s", "2016-09-15 20:59:58.299 0.8s", "2016-09-15 20:59:58.688 1.041s", "2016-09-15 20:59:59.591 1.412s", "2016-09-15 21:00:00.464 1.466s", "2016-09-15 21:00:00.741 1.581s", "2016-09-15 21:00:00.748 2.31s", "2016-09-15 21:00:00.966 0.381s", "2016-09-15 21:00:02.066 2.62s"};
	String[] lines6 = {"2016-09-15 00:00:00.000 2.3s", "2016-09-15 23:59:59.999 0.1s"};
	
	int return1 = 1;
	int return2 = 1;
	int return3 = 1;
	int return4 = 2;
	int return5 = 7;
	int return6 = 1;
	
	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(return1, ChoosukSolution.solution(lines1));
		assertEquals(return2, ChoosukSolution.solution(lines2));
		assertEquals(return3, ChoosukSolution.solution(lines3));
		assertEquals(return4, ChoosukSolution.solution(lines4));
		assertEquals(return5, ChoosukSolution.solution(lines5));
		assertEquals(return6, ChoosukSolution.solution(lines6));

	}
}
