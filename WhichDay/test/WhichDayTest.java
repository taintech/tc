import org.junit.Test;
import static org.junit.Assert.*;

public class WhichDayTest {
	
	@Test
	public void test0() {
		String[] notOnThisDay = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		assertEquals("Saturday", new WhichDay().getDay(notOnThisDay));
	}
	
	@Test
	public void test1() {
		String[] notOnThisDay = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Friday", "Thursday"};
		assertEquals("Saturday", new WhichDay().getDay(notOnThisDay));
	}
	
	@Test
	public void test2() {
		String[] notOnThisDay = new String[] {"Sunday", "Monday", "Tuesday", "Thursday", "Friday", "Saturday"};
		assertEquals("Wednesday", new WhichDay().getDay(notOnThisDay));
	}
	
	@Test
	public void test3() {
		String[] notOnThisDay = new String[] {"Sunday", "Friday", "Tuesday", "Wednesday", "Monday", "Saturday"};
		assertEquals("Thursday", new WhichDay().getDay(notOnThisDay));
	}
}
