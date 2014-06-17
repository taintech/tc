import org.junit.Test;
import static org.junit.Assert.*;

public class GameOfSegmentsTest {
	
	@Test
	public void test0() {
		int N = 3;
		assertEquals(1, new GameOfSegments().winner(N));
	}
	
	@Test
	public void test1() {
		int N = 4;
		assertEquals(1, new GameOfSegments().winner(N));
	}
	
	@Test
	public void test2() {
		int N = 15;
		assertEquals(2, new GameOfSegments().winner(N));
	}
	
	@Test
	public void test3() {
		int N = 191;
		assertEquals(2, new GameOfSegments().winner(N));
	}
    @Test
	public void testForSixSteps() {
		int N = 6;
		assertEquals(3, new GameOfSegments().step(N));
	}
    @Test
	public void testForSevenSteps() {
		int N = 7;
		assertEquals(3, new GameOfSegments().step(N));
	}
    @Test
	public void testForEightSteps() {
		int N = 8;
		assertEquals(3, new GameOfSegments().step(N));
	}
}
