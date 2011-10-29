import org.junit.Test;
import static org.junit.Assert.*;

public class SRMSystemTestPhaseTest {
	
	@Test
	public void test0() {
		String[] description = new String[] {"YYY"};
		assertEquals(27, new SRMSystemTestPhase().countWays(description));
	}
	
	@Test
	public void test1() {
		String[] description = new String[] {"YNN",
 "NYN"};
		assertEquals(6, new SRMSystemTestPhase().countWays(description));
	}
	
	@Test
	public void test2() {
		String[] description = new String[] {"YNN",
 "NNN",
 "NNY"};
		assertEquals(4, new SRMSystemTestPhase().countWays(description));
	}
	
	@Test
	public void test3() {
		String[] description = new String[] {"NNN",
 "NNN"};
		assertEquals(1, new SRMSystemTestPhase().countWays(description));
	}
	
	@Test
	public void test4() {
		String[] description = new String[] {"YYY",
 "YNY",
 "NYY",
 "YYN",
 "YYY",
 "YNN"};
		assertEquals(15176, new SRMSystemTestPhase().countWays(description));
	}
}
