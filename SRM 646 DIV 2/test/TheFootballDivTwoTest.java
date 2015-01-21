import org.junit.Test;
import static org.junit.Assert.*;

public class TheFootballDivTwoTest {
	
	@Test(timeout=2000)
	public void test0() {
		int yourScore = 4;
		int[] scores = new int[] {7};
		int[] numberOfTeams = new int[] {1};
		assertEquals(1, new TheFootballDivTwo().find(yourScore, scores, numberOfTeams));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int yourScore = 1;
		int[] scores = new int[] {7};
		int[] numberOfTeams = new int[] {2};
		assertEquals(2, new TheFootballDivTwo().find(yourScore, scores, numberOfTeams));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int yourScore = 1;
		int[] scores = new int[] {7, 1};
		int[] numberOfTeams = new int[] {2, 1};
		assertEquals(1, new TheFootballDivTwo().find(yourScore, scores, numberOfTeams));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int yourScore = 11;
		int[] scores = new int[] {5, 12, 17, 19, 99, 13, 15, 14};
		int[] numberOfTeams = new int[] {2, 4, 8, 2, 1, 3, 25, 3};
		assertEquals(18, new TheFootballDivTwo().find(yourScore, scores, numberOfTeams));
	}
}
