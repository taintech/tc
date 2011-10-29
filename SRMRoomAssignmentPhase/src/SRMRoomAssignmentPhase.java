import java.util.*;

//SRM520
public class SRMRoomAssignmentPhase {
	public int countCompetitors(int[] ratings, int K) {
        int u = ratings[0];
		Arrays.sort(ratings);
        int l = ratings.length;
        int x = 0;
        for(int i=0;i<l;i++){
            if(u==ratings[i]){
                x = i;
                break;
            }
        }
        return ((l-x-1)/K);
	}
}
