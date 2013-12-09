import org.junit.Test;
import static org.junit.Assert.*;

public class FoxAndClassroomTest {
	
	@Test
	public void test0() {
		int n = 2;
		int m = 3;
		assertEquals("Possible", new FoxAndClassroom().ableTo(n, m));
	}
	
	@Test
	public void test1() {
		int n = 2;
		int m = 2;
		assertEquals("Impossible", new FoxAndClassroom().ableTo(n, m));
	}
	
	@Test
	public void test2() {
		int n = 4;
		int m = 6;
		assertEquals("Impossible", new FoxAndClassroom().ableTo(n, m));
	}
	
	@Test
	public void test3() {
		int n = 3;
		int m = 6;
		assertEquals("Impossible", new FoxAndClassroom().ableTo(n, m));
	}
	
	@Test
	public void test4() {
		int n = 5;
		int m = 7;
		assertEquals("Possible", new FoxAndClassroom().ableTo(n, m));
	}
	
	@Test
	public void test5() {
		int n = 10;
		int m = 10;
		assertEquals("Impossible", new FoxAndClassroom().ableTo(n, m));
	}
}
