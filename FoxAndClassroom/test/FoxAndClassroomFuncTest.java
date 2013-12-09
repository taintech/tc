import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoxAndClassroomFuncTest {
	
	@Test
	public void test0() {
		int n = 2;
		int m = 3;
		assertEquals(1, new FoxAndClassroom().gcd(n, m));
	}

    @Test
    public void test1() {
        int n = 12;
        int m = 18;
        assertEquals(6, new FoxAndClassroom().gcd(n, m));
    }
}
