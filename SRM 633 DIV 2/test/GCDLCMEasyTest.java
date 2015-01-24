import org.junit.Test;
import static org.junit.Assert.*;

public class GCDLCMEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 4;
		int[] A = new int[] {0,1,2,3};
		int[] B = new int[] {1,2,3,0};
		int[] G = new int[] {6,6,6,6};
		int[] L = new int[] {12,12,12,12};
		assertEquals("Solution exists", new GCDLCMEasy().possible(n, A, B, G, L));
	}

	@Test(timeout=2000)
	public void testGCD() {
		assertEquals(4, new GCDLCMEasy().gcd(12,8));
		assertEquals(6, new GCDLCMEasy().gcd(36,30));
		assertEquals(1, new GCDLCMEasy().gcd(7,13));
	}

	@Test(timeout=2000)
	public void testLCM() {
		assertEquals(12, new GCDLCMEasy().lcm(3,4));
		assertEquals(10, new GCDLCMEasy().lcm(2,5));
		assertEquals(91, new GCDLCMEasy().lcm(7,13));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 5;
		int[] A = new int[] {0,1,2,3,4};
		int[] B = new int[] {1,2,3,4,0};
		int[] G = new int[] {6,6,6,6,6};
		int[] L = new int[] {12,12,12,12,12};
		assertEquals("Solution does not exist", new GCDLCMEasy().possible(n, A, B, G, L));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 2;
		int[] A = new int[] {0,0};
		int[] B = new int[] {1,1};
		int[] G = new int[] {123,123};
		int[] L = new int[] {456,789};
		assertEquals("Solution does not exist", new GCDLCMEasy().possible(n, A, B, G, L));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 2;
		int[] A = new int[] {0};
		int[] B = new int[] {1};
		int[] G = new int[] {1234};
		int[] L = new int[] {5678};
		assertEquals("Solution does not exist", new GCDLCMEasy().possible(n, A, B, G, L));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 6;
		int[] A = new int[] {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4};
		int[] B = new int[] {1, 2, 3, 4, 5, 2, 3, 4, 5, 3, 4, 5, 4, 5, 5};
		int[] G = new int[] {2, 2, 3, 3, 1, 2, 5, 1, 5, 1, 7, 7, 3, 5, 7};
		int[] L = new int[] {30, 42, 30, 42, 210, 70, 30, 210, 70, 210, 42, 70, 105, 105, 105}
;
		assertEquals("Solution exists", new GCDLCMEasy().possible(n, A, B, G, L));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int n = 500;
		int[] A = new int[] {0};
		int[] B = new int[] {1};
		int[] G = new int[] {10000};
		int[] L = new int[] {10000};
		assertEquals("Solution exists", new GCDLCMEasy().possible(n, A, B, G, L));
	}
}
