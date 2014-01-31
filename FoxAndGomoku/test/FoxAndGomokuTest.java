import org.junit.Test;
import static org.junit.Assert.*;

public class FoxAndGomokuTest {
	
	@Test
	public void test0() {
		String[] board = new String[] {"....o.",
                                       "...o..",
                                       "..o...",
                                       ".o....",
                                       "o.....",
                                       "......"};
		assertEquals("found", new FoxAndGomoku().win(board));
	}
	
	@Test
	public void test1() {
		String[] board = new String[] {"oooo.",
 ".oooo",
 "oooo.",
 ".oooo",
 "....."}
 ;
		assertEquals("not found", new FoxAndGomoku().win(board));
	}
	
	@Test
	public void test2() {
		String[] board = new String[] {"oooo.",
 ".oooo",
 "oooo.",
 ".oooo",
 "....o"}
 ;
		assertEquals("found", new FoxAndGomoku().win(board));
	}
	
	@Test
	public void test3() {
		String[] board = new String[] {"o.....",
 ".o....",
 "..o...",
 "...o..",
 "....o.",
 "......"};
		assertEquals("found", new FoxAndGomoku().win(board));
	}
	
	@Test
	public void test4() {
		String[] board = new String[] {"o....",
 "o.o..",
 "o.o.o",
 "o.o..",
 "o...."};
		assertEquals("found", new FoxAndGomoku().win(board));
	}
	
	@Test
	public void test5() {
		String[] board = new String[] {"..........",
 "..........",
 "..oooooo..",
 "..o.......",
 "..o.......",
 "..oooooo..",
 ".......o..",
 ".......o..",
 "..oooooo..",
 ".........."}
 
;
		assertEquals("found", new FoxAndGomoku().win(board));
	}
	
	@Test
	public void test6() {
		String[] board = new String[] {"..........",
 "..........",
 "..oooo.o..",
 "..o.......",
 "..o.......",
 "..o.oooo..",
 ".......o..",
 ".......o..",
 "..oooo.o..",
 ".........."}
;
		assertEquals("not found", new FoxAndGomoku().win(board));
	}
	
	@Test
	public void test7() {
		String[] board = new String[] {"ooooo",
 "ooooo",
 "ooooo",
 "ooooo",
 "ooooo"};
		assertEquals("found", new FoxAndGomoku().win(board));
	}
	
	@Test
	public void test8() {
		String[] board = new String[] {".....",
 ".....",
 ".....",
 ".....",
 "....."};
		assertEquals("not found", new FoxAndGomoku().win(board));
	}

    @Test
    public void test9() {
        String[] board = new String[] {".....",
                "o....",
                "o....",
                "o....",
                "o....",
                "o...."};
        assertEquals("found", new FoxAndGomoku().win(board));
    }
}
