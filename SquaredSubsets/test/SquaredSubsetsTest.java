import org.junit.Test;
import static org.junit.Assert.*;

public class SquaredSubsetsTest {
	
	@Test
	public void test0() {
		int n = 5;
		int[] x = new int[] {-5,0,5};
		int[] y = new int[] {0,0,0};
		assertEquals(5L, new SquaredSubsets().countSubsets(n, x, y));
	}
	
	@Test
	public void test1() {
		int n = 10;
		int[] x = new int[] {-5,0,5};
		int[] y = new int[] {0,0,0};
		assertEquals(5L, new SquaredSubsets().countSubsets(n, x, y));
	}
	
	@Test
	public void test2() {
		int n = 100000000;
		int[] x = new int[] {-1,-1,-1,0,1,1,1};
		int[] y = new int[] {-1,0,1,1,-1,0,1};
		assertEquals(21L, new SquaredSubsets().countSubsets(n, x, y));
	}
	
	@Test
	public void test3() {
		int n = 5;
		int[] x = new int[] {5,3,6,2,1,6,4,4,7,-1,-4,-7,2,-2,0};
		int[] y = new int[] {0,-1,8,-5,2,5,-8,8,-6,4,3,2,7,3,5};
		assertEquals(66L, new SquaredSubsets().countSubsets(n, x, y));
	}
	
	@Test
	public void test4() {
		int n = 1;
		int[] x = new int[] {-1,0};
		int[] y = new int[] {0,0};
		assertEquals(3L, new SquaredSubsets().countSubsets(n, x, y));
	}
}
