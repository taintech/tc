import org.junit.Test;
import static org.junit.Assert.*;

public class SRMRoomAssignmentPhaseTest {
	
	@Test
	public void test0() {
		int[] ratings = new int[] {491, 981, 1199, 763, 994, 879, 888};
		int K = 3;
		assertEquals(2, new SRMRoomAssignmentPhase().countCompetitors(ratings, K));
	}
	
	@Test
	public void test1() {
		int[] ratings = new int[] {1024, 1000, 600};
		int K = 1;
		assertEquals(0, new SRMRoomAssignmentPhase().countCompetitors(ratings, K));
	}
	
	@Test
	public void test2() {
		int[] ratings = new int[] {505, 679, 900, 1022};
		int K = 2;
		assertEquals(1, new SRMRoomAssignmentPhase().countCompetitors(ratings, K));
	}
	
	@Test
	public void test3() {
		int[] ratings = new int[] {716, 58, 1000, 1004, 912, 822, 453, 1100, 558};
		int K = 3;
		assertEquals(1, new SRMRoomAssignmentPhase().countCompetitors(ratings, K));
	}
	
	@Test
	public void test4() {
		int[] ratings = new int[] {422, 623, 1023, 941, 882, 776, 852, 495, 803, 622, 618, 532, 751, 500};
		int K = 4;
		assertEquals(3, new SRMRoomAssignmentPhase().countCompetitors(ratings, K));
	}
	
	@Test
	public void test5() {
		int[] ratings = new int[] {1197, 1198, 1196, 1195, 1199};
		int K = 1;
		assertEquals(2, new SRMRoomAssignmentPhase().countCompetitors(ratings, K));
	}
}
