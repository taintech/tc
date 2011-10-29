import org.junit.Test;
import static org.junit.Assert.*;

public class SRMCodingPhaseTest {
	
	@Test
	public void test0() {
		int[] points = new int[] {250, 500, 1000};
		int[] skills = new int[] {10, 25, 40};
		int luck = 0;
		assertEquals(1310, new SRMCodingPhase().countScore(points, skills, luck));
	}
	
	@Test
	public void test1() {
		int[] points = new int[] {300, 600, 900};
		int[] skills = new int[] {30, 65, 90};
		int luck = 25;
		assertEquals(680, new SRMCodingPhase().countScore(points, skills, luck));
	}
	
	@Test
	public void test2() {
		int[] points = new int[] {250, 550, 950};
		int[] skills = new int[] {10, 25, 40};
		int luck = 75;
		assertEquals(1736, new SRMCodingPhase().countScore(points, skills, luck));
	}
	
	@Test
	public void test3() {
		int[] points = new int[] {256, 512, 1024};
		int[] skills = new int[] {35, 30, 25};
		int luck = 0;
		assertEquals(1216, new SRMCodingPhase().countScore(points, skills, luck));
	}
	
	@Test
	public void test4() {
		int[] points = new int[] {300, 600, 1100};
		int[] skills = new int[] {80, 90, 100};
		int luck = 4;
		assertEquals(0, new SRMCodingPhase().countScore(points, skills, luck));
	}
}
