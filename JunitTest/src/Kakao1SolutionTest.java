import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Kakao1SolutionTest {

	int n1 = 2;
	int n2 = 16;
	int n3 = 16;
	
	int t1 = 4;
	int t2 = 16;
	int t3 = 16;
	
	int m1 = 2;
	int m2 = 2;
	int m3 = 2;
	
	int p1 = 1;
	int p2 = 1;
	int p3 = 2;
	
	String result1 = "0111";
	String result2 = "02468ACE11111111";
	String result3 = "13579BDF01234567";
	
	@Test
	public void SolutionTests() {
		System.out.println("****** Solution Test ******");
		assertEquals(result1, Kakao1Solution.solution(n1, t1, m1, p1));
		assertEquals(result2, Kakao1Solution.solution(n2, t2, m2, p2));
		assertEquals(result3, Kakao1Solution.solution(n3, t3, m3, p3));


	}
}
