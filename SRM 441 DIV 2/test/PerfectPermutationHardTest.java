import org.junit.Test;
import static org.junit.Assert.*;

public class PerfectPermutationHardTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] P = new int[] {2, 0, 1};
		assertArrayEquals(new int[] {2, 0, 1 }, new PerfectPermutationHard().reorder(P));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] P = new int[] {4, 0, 5, 2, 1, 3};
		assertArrayEquals(new int[] {2, 0, 5, 4, 1, 3 }, new PerfectPermutationHard().reorder(P));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] P = new int[] {2, 7, 3, 0, 6, 4, 5, 1};
		assertArrayEquals(new int[] {1, 7, 3, 0, 6, 2, 5, 4 }, new PerfectPermutationHard().reorder(P));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] P = new int[] {11, 8, 10, 1, 5, 4, 0, 7, 3, 9, 12, 6, 2};
		assertArrayEquals(new int[] {1, 8, 10, 2, 5, 7, 0, 9, 3, 11, 12, 6, 4 }, new PerfectPermutationHard().reorder(P));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] P = new int[] {0, 1, 4, 2, 3, 5};
		assertArrayEquals(new int[] {1, 2, 4, 5, 3, 0 }, new PerfectPermutationHard().reorder(P));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] P = new int[] {0, 2, 6, 5, 7, 3, 1, 4};
		assertArrayEquals(new int[] {1, 2, 6, 5, 7, 4, 3, 0 }, new PerfectPermutationHard().reorder(P));
	}
}
