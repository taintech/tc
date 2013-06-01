import org.junit.Test;
import static org.junit.Assert.*;

public class ChopsticksTest {
	
	@Test
	public void test0() {
		int[] length = new int[] {5,5};
		assertEquals(1, new Chopsticks().getmax(length));
	}
	
	@Test
	public void test1() {
		int[] length = new int[] {1,2,3,2,1,2,3,2,1};
		assertEquals(4, new Chopsticks().getmax(length));
	}
	
	@Test
	public void test2() {
		int[] length = new int[] {1};
		assertEquals(0, new Chopsticks().getmax(length));
	}
	
	@Test
	public void test3() {
		int[] length = new int[] {1,2,3,4,5,6,7,8,9};
		assertEquals(0, new Chopsticks().getmax(length));
	}
	
	@Test
	public void test4() {
		int[] length = new int[] {35,35,35,50,16,30,10,10,35,50,16,16,16,30,50,30,16,35,50,30,10,50,50,16,16,
10,35,50,50,50,16,35,35,30,35,10,50,10,50,50,16,30,35,10,10,30,10,10,16,35};
		assertEquals(24, new Chopsticks().getmax(length));
	}
}
