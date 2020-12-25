import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WhatDateSolutionTest {

	int a = 5;
	int b = 24;

	String answer = "TUE";

	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(answer, WhatDateSolution.solution(a,b));
	}
}
