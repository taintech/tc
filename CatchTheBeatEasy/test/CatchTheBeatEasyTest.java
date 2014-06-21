import org.junit.Test;
import static org.junit.Assert.*;

public class CatchTheBeatEasyTest {
	
	@Test
	public void test0() {
		int[] x = new int[] {-1, 1, 0};
		int[] y = new int[] {1, 3, 4};
		assertEquals("Able to catch", new CatchTheBeatEasy().ableToCatchAll(x, y));
	}
	
	@Test
	public void test1() {
		int[] x = new int[] {-3};
		int[] y = new int[] {2};
		assertEquals("Not able to catch", new CatchTheBeatEasy().ableToCatchAll(x, y));
	}
	
	@Test
	public void test2() {
		int[] x = new int[] {-1, 1, 0};
		int[] y = new int[] {1, 2, 4};
		assertEquals("Not able to catch", new CatchTheBeatEasy().ableToCatchAll(x, y));
	}
	
	@Test
	public void test3() {
		int[] x = new int[] {0, -1, 1};
		int[] y = new int[] {9, 1, 3};
		assertEquals("Able to catch", new CatchTheBeatEasy().ableToCatchAll(x, y));
	}
	
	@Test
	public void test4() {
		int[] x = new int[] {70,-108,52,-70,84,-29,66,-33};
		int[] y = new int[] {141,299,402,280,28,363,427,232};
		assertEquals("Not able to catch", new CatchTheBeatEasy().ableToCatchAll(x, y));
	}
	
	@Test
	public void test5() {
		int[] x = new int[] {-175,-28,-207,-29,-43,-183,-175,-112,-183,-31,-25,-66,-114,-116,-66};
		int[] y = new int[] {320,107,379,72,126,445,318,255,445,62,52,184,247,245,185};
		assertEquals("Able to catch", new CatchTheBeatEasy().ableToCatchAll(x, y));
	}
	
	@Test
	public void test6() {
		int[] x = new int[] {0,0,0,0};
		int[] y = new int[] {0,0,0,0};
		assertEquals("Able to catch", new CatchTheBeatEasy().ableToCatchAll(x, y));
	}

	@Test
	public void test7() {
		int[] x = new int[] {-1, -1};
		int[] y = new int[] {1, 0};
		assertEquals("Not able to catch", new CatchTheBeatEasy().ableToCatchAll(x, y));
	}
}
