import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyDungeonDiv2Test {
	
	@Test
	public void test0() {
		int res = 3;
        int[] a = {2,0,5,3};
        int[] b = {1,4,0,2};
        int[] c = {2,3,1};

		assertEquals(res, new KeyDungeonDiv2().countDoors(a,b,c));
	}
	@Test
	public void test1() {
		int res = 17;
        int[] a = {41,44,41,57,58,74,84,100,58,2,43,32,82,97,44,13,35,98,96,81,43,77,18,51,27,
                27,39,39,45,82,59,20,28,93,6,39,64,78,28,85,17,56,3,68,4,0,36,80,41,77};
        int[] b = {67,15,53,36,88,29,26,57,68,99,97,27,51,70,3,49,65,75,35,92,66,0,23,96,38,86,
                98,31,26,75,30,2,92,78,100,99,38,26,85,74,77,15,16,48,100,88,55,93,99,54};
        int[] c = {39,31,34};

		assertEquals(res, new KeyDungeonDiv2().countDoors(a,b,c));
	}
//
//	@Test
//	public void test1() {
//		String cells = "BBBB";
//		assertEquals("Bob", new RowAndManyCoins().getWinner(cells));
//	}
//
////	@Test
////	public void test2() {
////		String cells = "BA";
////		assertEquals("Alice", new RowAndManyCoins().getWinner(cells));
////	}
////
////	@Test
////	public void test3() {
////		String cells = "BABBABBB";
////		assertEquals("Bob", new RowAndManyCoins().getWinner(cells));
////	}
////
////	@Test
////	public void test4() {
////		String cells = "ABABBBABAABBAA";
////		assertEquals("Alice", new RowAndManyCoins().getWinner(cells));
////	}
////
////	@Test
////	public void test5() {
////		String cells = "BBBAAABBAAABBB";
////		assertEquals("Bob", new RowAndManyCoins().getWinner(cells));
////	}
}
