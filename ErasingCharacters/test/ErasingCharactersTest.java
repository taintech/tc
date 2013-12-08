import org.junit.Test;
import static org.junit.Assert.*;

public class ErasingCharactersTest {
	
	@Test
	public void test0() {
		String s = "cieeilll";
		assertEquals("cl", new ErasingCharacters().simulate(s));
	}
	
	@Test
	public void test1() {
		String s = "topcoder";
		assertEquals("topcoder", new ErasingCharacters().simulate(s));
	}
	
	@Test
	public void test2() {
		String s = "abcdefghijklmnopqrstuvwxyyxwvutsrqponmlkjihgfedcba";
		assertEquals("", new ErasingCharacters().simulate(s));
	}
	
	@Test
	public void test3() {
		String s = "bacaabaccbaaccabbcabbacabcbba";
		assertEquals("bacbaca", new ErasingCharacters().simulate(s));
	}
	
	@Test
	public void test4() {
		String s = "eel";
		assertEquals("l", new ErasingCharacters().simulate(s));
	}
}
