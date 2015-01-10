import org.junit.Test;
import static org.junit.Assert.*;

public class TreeCuttingTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] par = new int[] {0,1,2,2,2};
		int[] num = new int[] {2,-1,-1,4,-1,-1};
		assertEquals("POSSIBLE", new TreeCutting().can(par, num));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] par = new int[] {0,1,2,2,2};
		int[] num = new int[] {3,-1,-1,3,-1,-1};
		assertEquals("IMPOSSIBLE", new TreeCutting().can(par, num));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] par = new int[] {0,1,2,2,2};
		int[] num = new int[] {2,-1,-1,3,-1,-1};
		assertEquals("IMPOSSIBLE", new TreeCutting().can(par, num));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] par = new int[] {0,1,2,2,1,5,2,6,6};
		int[] num = new int[] {-1,-1,2,-1,1,3,-1,1,1,2};
		assertEquals("POSSIBLE", new TreeCutting().can(par, num));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] par = new int[] {0,1,2,2,1,5,2,6,6};
		int[] num = new int[] {-1,-1,2,-1,1,-1,3,1,1,2};
		assertEquals("IMPOSSIBLE", new TreeCutting().can(par, num));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] par = new int[] {0,0,0,0,1,1,2,3,3,3,4,4,4,5,9,9,14,14,14,16,20};
		int[] num = new int[] {-1,3,-1,-1,-1,-1,-1,1,1,-1,-1,-1,3,1,-1,1,8,-1,-1,4,-1,-1};
		assertEquals("POSSIBLE", new TreeCutting().can(par, num));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int[] par = new int[] {0,0,0,0,1,1,2,3,3,3,4,4,4,5,9,9,14,14,14,16,20};
		int[] num = new int[] {-1,2,-1,-1,-1,-1,-1,1,1,-1,-1,-1,3,1,-1,1,9,-1,-1,4,-1,-1};
		assertEquals("IMPOSSIBLE", new TreeCutting().can(par, num));
	}
	
	@Test(timeout=2000)
	public void test7() {
		int[] par = new int[] {0,0,1,1};
		int[] num = new int[] {-1,-1,5,-1,-1};
		assertEquals("POSSIBLE", new TreeCutting().can(par, num));
	}
}
