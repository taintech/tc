import org.junit.Test;
import static org.junit.Assert.*;

public class CentaurCompanyDiv2Test {
	
	@Test
	public void test0() {
		int[] a = new int[] {1};
		int[] b = new int[] {2};
		assertEquals(4L, new CentaurCompanyDiv2().count(a, b));
	}
	
	@Test
	public void test1() {
		int[] a = new int[] {2,2};
		int[] b = new int[] {1,3};
		assertEquals(7L, new CentaurCompanyDiv2().count(a, b));
	}
	
	@Test
	public void test2() {
		int[] a = new int[] {1,2,3,4,5,6,7,8,9};
		int[] b = new int[] {2,3,4,5,6,7,8,9,10};
		assertEquals(56L, new CentaurCompanyDiv2().count(a, b));
	}
	
	@Test
	public void test3() {
		int[] a = new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int[] b = new int[] {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51};
		assertEquals(1125899906842675L, new CentaurCompanyDiv2().count(a, b));
	}
	
	@Test
	public void test4() {
		int[] a = new int[] {10, 7, 2, 5, 6, 2, 4, 9, 7};
		int[] b = new int[] {8, 10, 10, 4, 1, 6, 2, 2, 3};
		assertEquals(144L, new CentaurCompanyDiv2().count(a, b));
	}
}
