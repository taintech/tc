import org.junit.Test;
import static org.junit.Assert.*;

public class LittleElephantAndBallsAgainTest {
	
	@Test
	public void test0() {
		String S = "RRGGBB";
		assertEquals(4, new LittleElephantAndBallsAgain().getNumber(S));
	}
	
	@Test
	public void test1() {
		String S = "R";
		assertEquals(0, new LittleElephantAndBallsAgain().getNumber(S));
	}
	
	@Test
	public void test2() {
		String S = "RGBRGB";
		assertEquals(5, new LittleElephantAndBallsAgain().getNumber(S));
	}
	
	@Test
	public void test3() {
		String S = "RGGGBB";
		assertEquals(3, new LittleElephantAndBallsAgain().getNumber(S));
	}
	
	@Test
	public void test4() {
		String S = "RGBRBRGRGRBBBGRBRBRGBGBBBGRGBBBBRGBGRRGGRRRGRBBBBR";
		assertEquals(46, new LittleElephantAndBallsAgain().getNumber(S));
	}
}
