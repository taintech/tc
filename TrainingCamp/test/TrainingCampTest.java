import org.junit.Test;
import static org.junit.Assert.*;

public class TrainingCampTest {
	
	@Test
	public void test0() {
		String[] attendance = new String[] {"XXX",
 "XXX",
 "XX-"};
		String[] problemTopics = new String[] {"---",
 "XXX",
 "-XX",
 "XX-"};
		assertArrayEquals(new String[] {"XXXX", "XXXX", "X--X" }, new TrainingCamp().determineSolvers(attendance, problemTopics));
	}
	
	@Test
	public void test1() {
		String[] attendance = new String[] {"-XXXX",
 "----X",
 "XXX--",
 "X-X-X"};
		String[] problemTopics = new String[] {"X---X",
 "-X---",
 "XXX--",
 "--X--"};
		assertArrayEquals(new String[] {"-X-X", "----", "-XXX", "X--X" }, new TrainingCamp().determineSolvers(attendance, problemTopics));
	}
	
	@Test
	public void test2() {
		String[] attendance = new String[] {"-----",
 "XXXXX"};
		String[] problemTopics = new String[] {"XXXXX",
 "-----",
 "--X-X"};
		assertArrayEquals(new String[] {"-X-", "XXX" }, new TrainingCamp().determineSolvers(attendance, problemTopics));
	}
	
	@Test
	public void test3() {
		String[] attendance = new String[] {"-",
 "X",
 "X",
 "-",
 "X"};
		String[] problemTopics = new String[] {"-",
 "X"};
		assertArrayEquals(new String[] {"X-", "XX", "XX", "X-", "XX" }, new TrainingCamp().determineSolvers(attendance, problemTopics));
	}
	
	@Test
	public void test4() {
		String[] attendance = new String[] {"X----X--X",
 "X--X-X---",
 "--X-X----",
 "XXXX-X-X-",
 "XXXX--XXX"};
		String[] problemTopics = new String[] {"X----X-X-",
 "-----X---",
 "-X----X-X",
 "-X-X-X---",
 "-----X---",
 "X-------X"};
		assertArrayEquals(new String[] {"-X--XX", "-X--X-", "------", "XX-XX-", "--X--X" }, new TrainingCamp().determineSolvers(attendance, problemTopics));
	}
}
