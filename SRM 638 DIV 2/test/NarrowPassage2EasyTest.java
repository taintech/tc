import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NarrowPassage2EasyTest {


	@Test(timeout=2000)
	public void testToArray() {
		int[] size = new int[] {1, 2, 3};
		assertEquals(size[0], new NarrowPassage2Easy().toArray(Arrays.toString(size),3)[0]);
		assertEquals(size[1], new NarrowPassage2Easy().toArray(Arrays.toString(size),3)[1]);
		assertEquals(size[2], new NarrowPassage2Easy().toArray(Arrays.toString(size),3)[2]);
		size = new int[] {12, 234, 3456};
		assertEquals(size[0], new NarrowPassage2Easy().toArray(Arrays.toString(size),3)[0]);
		assertEquals(size[1], new NarrowPassage2Easy().toArray(Arrays.toString(size),3)[1]);
		assertEquals(size[2], new NarrowPassage2Easy().toArray(Arrays.toString(size),3)[2]);
	}
	
	@Test(timeout=2000)
	public void test0() {
		int[] size = new int[] {1, 2, 3};
		int maxSizeSum = 3;
		assertEquals(2, new NarrowPassage2Easy().count(size, maxSizeSum));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] size = new int[] {1, 2, 3};
		int maxSizeSum = 1000;
		assertEquals(6, new NarrowPassage2Easy().count(size, maxSizeSum));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] size = new int[] {1, 2, 3};
		int maxSizeSum = 4;
		assertEquals(3, new NarrowPassage2Easy().count(size, maxSizeSum));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] size = new int[] {1,1,1,1,1,1};
		int maxSizeSum = 2;
		assertEquals(720, new NarrowPassage2Easy().count(size, maxSizeSum));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] size = new int[] {2,4,6,1,3,5};
		int maxSizeSum = 8;
		assertEquals(60, new NarrowPassage2Easy().count(size, maxSizeSum));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] size = new int[] {1000};
		int maxSizeSum = 1000;
		assertEquals(1, new NarrowPassage2Easy().count(size, maxSizeSum));
	}
}
