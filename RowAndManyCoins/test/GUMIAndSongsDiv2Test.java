import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GUMIAndSongsDiv2Test {
	
	@Test
	public void test0() {
		int res = 3;
        int[] duration = {2,0,5,3};
        int[] tone = {1,4,0,2};
        int T = 0;

		assertEquals(res, new GUMIAndSongsDiv2().maxSongs(duration,tone,T));
	}
}
