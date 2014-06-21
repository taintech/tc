import org.junit.Test;
import static org.junit.Assert.*;

public class StringWeightDiv2Test {
	
	@Test
	public void test0() {
		int L = 1;
		assertEquals(26, new StringWeightDiv2().countMinimums(L));
	}
	
	@Test
	public void test1() {
		int L = 2;
		assertEquals(650, new StringWeightDiv2().countMinimums(L));
	}
	
	@Test
	public void test2() {
		int L = 50;
		assertEquals(488801539, new StringWeightDiv2().countMinimums(L));
	}
}
