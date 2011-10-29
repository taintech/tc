import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryCardsTest {
	
	@Test
	public void test0() {
		long A = 6L;
		long B = 6L;
		assertEquals(6L, new BinaryCards().largestNumber(A, B));
	}
	
	@Test
	public void test1() {
		long A = 6L;
		long B = 7L;
		assertEquals(7L, new BinaryCards().largestNumber(A, B));
	}
	
	@Test
	public void test2() {
		long A = 6L;
		long B = 8L;
		assertEquals(15L, new BinaryCards().largestNumber(A, B));
	}
	
	@Test
	public void test3() {
		long A = 1L;
		long B = 11L;
		assertEquals(15L, new BinaryCards().largestNumber(A, B));
	}
	
	@Test
	public void test4() {
		long A = 35L;
		long B = 38L;
		assertEquals(39L, new BinaryCards().largestNumber(A, B));
	}
	
	@Test
	public void test5() {
		long A = 1125899906842630L;
		long B = 1125899906842632L;
		assertEquals(1125899906842639L, new BinaryCards().largestNumber(A, B));
	}
}
