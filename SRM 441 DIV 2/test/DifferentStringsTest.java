import org.junit.Test;
import static org.junit.Assert.*;

public class DifferentStringsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String A = "koder";
		String B = "topcoder";
		assertEquals(1, new DifferentStrings().minimize(A, B));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String A = "hello";
		String B = "xello";
		assertEquals(1, new DifferentStrings().minimize(A, B));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String A = "abc";
		String B = "topabcoder";
		assertEquals(0, new DifferentStrings().minimize(A, B));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String A = "adaabc";
		String B = "aababbc";
		assertEquals(2, new DifferentStrings().minimize(A, B));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String A = "giorgi";
		String B = "igroig";
		assertEquals(6, new DifferentStrings().minimize(A, B));
	}
}
