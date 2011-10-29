import org.junit.Test;
import static org.junit.Assert.*;

public class PointErasingTwoTest {
	
	@Test
	public void test0() {
		int[] y = new int[] { 1, 2, 1, 1, 0, 4, 3 };
		assertEquals(2, new PointErasingTwo().getMaximum(y));
	}
	
	@Test
	public void test1() {
		int[] y = new int[] { 0, 1 };
		assertEquals(0, new PointErasingTwo().getMaximum(y));
	}
	
	@Test
	public void test2() {
		int[] y = new int[] { 0, 1, 2, 3, 4 };
		assertEquals(3, new PointErasingTwo().getMaximum(y));
	}
	
	@Test
	public void test3() {
		int[] y = new int[] { 10, 19, 10, 19 };
		assertEquals(0, new PointErasingTwo().getMaximum(y));
	}
	
	@Test
	public void test4() {
		int[] y = new int[] { 0, 23, 49, 50, 32, 0, 18, 50, 0, 28, 50, 27, 49, 0 };
		assertEquals(5, new PointErasingTwo().getMaximum(y));
	}
}
