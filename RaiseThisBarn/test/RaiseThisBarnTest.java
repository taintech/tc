import org.junit.Test;
import static org.junit.Assert.*;

public class RaiseThisBarnTest {
	
	@Test
	public void test0() {
		String str = "cc..c.c";
		assertEquals(3, new RaiseThisBarn().calc(str));
	}
	
	@Test
	public void test1() {
		String str = "c....c....c";
		assertEquals(0, new RaiseThisBarn().calc(str));
	}
	
	@Test
	public void test2() {
		String str = "............";
		assertEquals(11, new RaiseThisBarn().calc(str));
	}
	
	@Test
	public void test3() {
		String str = ".c.c...c..ccc.c..c.c.cc..ccc";
		assertEquals(3, new RaiseThisBarn().calc(str));
	}

	@Test
	public void test4() {
		String str = ".cc.ccccc.cccc.cc..cccc....c...cc..c....ccc";
		assertEquals(1, new RaiseThisBarn().calc(str));
	}
}
