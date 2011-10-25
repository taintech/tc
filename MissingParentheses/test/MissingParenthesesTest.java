import org.junit.Test;
import static org.junit.Assert.*;

public class MissingParenthesesTest {
	
	@Test
	public void test0() {
		String par = "(()(()";
		assertEquals(2, new MissingParentheses().countCorrections(par));
	}
	
	@Test
	public void test1() {
		String par = "()()(()";
		assertEquals(1, new MissingParentheses().countCorrections(par));
	}
	
	@Test
	public void test2() {
		String par = "(())(()())";
		assertEquals(0, new MissingParentheses().countCorrections(par));
	}
	
	@Test
	public void test3() {
		String par = "())(())((()))))()((())))()())())())()()()";
		assertEquals(7, new MissingParentheses().countCorrections(par));
	}
}
