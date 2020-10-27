package NHNTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class Solution1Test {
	@Test
	public void SolutionTests() {
		char[][] expectedResult= {
				{'B','0'},
				{'C','0'},
				{'D','0'},
				{'L','1'},
				{'Q','1'},
				{'A','3'},
				{'F','2'},
				{'I','0'},
				{'J','0'},
				{'G','1'},
				{'K','1'},
				{'M','0'},
				{'N','0'},
				{'H','1'},
				{'P','0'},
				{'E','1'},
				{'O','1'},
		};
		System.out.println("****** Solution Test ******");
		assertTrue(Arrays.equals(expectedResult, Solution1.solution()));
	}
}
