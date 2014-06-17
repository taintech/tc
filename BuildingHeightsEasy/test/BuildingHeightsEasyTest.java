import org.junit.Test;
import static org.junit.Assert.*;

public class BuildingHeightsEasyTest {
	
	@Test
	public void test0() {
		int M = 2;
		int[] heights = new int[] {1, 2, 1, 4, 3};
		assertEquals(0, new BuildingHeightsEasy().minimum(M, heights));
	}
	
	@Test
	public void test1() {
		int M = 3;
		int[] heights = new int[] {1, 3, 5, 2, 1};
		assertEquals(2, new BuildingHeightsEasy().minimum(M, heights));
	}
	
	@Test
	public void test2() {
		int M = 1;
		int[] heights = new int[] {43, 19, 15};
		assertEquals(0, new BuildingHeightsEasy().minimum(M, heights));
	}
	
	@Test
	public void test3() {
		int M = 3;
		int[] heights = new int[] {19, 23, 9, 12};
		assertEquals(15, new BuildingHeightsEasy().minimum(M, heights));
	}
	
	@Test
	public void test4() {
		int M = 12;
		int[] heights = new int[] {25, 18, 38, 1, 42, 41, 14, 16, 19, 46, 42, 39, 38, 31, 43, 37, 26, 41, 33, 37, 45, 27, 19, 24, 33, 11, 22, 20, 36, 4, 4};
		assertEquals(47, new BuildingHeightsEasy().minimum(M, heights));
	}
}
