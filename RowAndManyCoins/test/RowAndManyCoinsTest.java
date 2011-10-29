import org.junit.Test;
import static org.junit.Assert.*;

public class RowAndManyCoinsTest {
	
	@Test
	public void test0() {
		String cells = "ABBB";
		assertEquals("Alice", new RowAndManyCoins().getWinner(cells));
	}
	
	@Test
	public void test1() {
		String cells = "BBBB";
		assertEquals("Bob", new RowAndManyCoins().getWinner(cells));
	}
	
	@Test
	public void test2() {
		String cells = "BA";
		assertEquals("Alice", new RowAndManyCoins().getWinner(cells));
	}
	
	@Test
	public void test3() {
		String cells = "BABBABBB";
		assertEquals("Bob", new RowAndManyCoins().getWinner(cells));
	}
	
	@Test
	public void test4() {
		String cells = "ABABBBABAABBAA";
		assertEquals("Alice", new RowAndManyCoins().getWinner(cells));
	}
	
	@Test
	public void test5() {
		String cells = "BBBAAABBAAABBB";
		assertEquals("Bob", new RowAndManyCoins().getWinner(cells));
	}
}
