import org.junit.Test;
import static org.junit.Assert.*;

public class CorrectMultiplicationTwoTest {
	
	@Test
	public void test0() {
		int a = 19;
		int b = 28;
		int c = 522;
		assertEquals(2, new CorrectMultiplicationTwo().getMinimum(a, b, c));
	}
	
	@Test
	public void test1() {
		int a = 10;
		int b = 30;
		int c = 500;
		assertEquals(11, new CorrectMultiplicationTwo().getMinimum(a, b, c));
	}
	
	@Test
	public void test2() {
		int a = 111;
		int b = 111;
		int c = 12321;
		assertEquals(0, new CorrectMultiplicationTwo().getMinimum(a, b, c));
	}
	
	@Test
	public void test3() {
		int a = 1000;
		int b = 100;
		int c = 10;
		assertEquals(1089, new CorrectMultiplicationTwo().getMinimum(a, b, c));
	}
	
	@Test
	public void test4() {
		int a = 399;
		int b = 522;
		int c = 199999;
		assertEquals(24, new CorrectMultiplicationTwo().getMinimum(a, b, c));
	}
}
