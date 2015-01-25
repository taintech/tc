import org.junit.Test;
import static org.junit.Assert.*;

public class NumberGameAgainTest {

	@Test
	public void testPowTwo(){
		assertEquals(16, new NumberGameAgain().powTwo(4));
		assertEquals(1024, new NumberGameAgain().powTwo(10));
	}

	@Test
	public void testLeftRight(){
		assertEquals(15, new NumberGameAgain().left(1,3));
		assertEquals(8, new NumberGameAgain().right(1,3));
		assertEquals(15, new NumberGameAgain().left(3,2));
		assertEquals(12, new NumberGameAgain().right(3,2));
	}
	
	@Test(timeout=2000)
	public void test0() {
		int k = 3;
		long[] table = new long[] {2,4,6};
		assertEquals(2L, new NumberGameAgain().solve(k, table));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int k = 5;
		long[] table = new long[] {2,3};
		assertEquals(0L, new NumberGameAgain().solve(k, table));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int k = 5;
		long[] table = new long[] {};
		assertEquals(30L, new NumberGameAgain().solve(k, table));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int k = 40;
		long[] table = new long[] {2,4,8,16,32141531,2324577,1099511627775L,2222222222L,33333333333L,4444444444L,2135};
		assertEquals(549755748288L, new NumberGameAgain().solve(k, table));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int k = 40;
		long[] table = new long[] {};
		assertEquals(1099511627774L, new NumberGameAgain().solve(k, table));
	}
}
