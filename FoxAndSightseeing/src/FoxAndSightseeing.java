import java.util.*;

public class FoxAndSightseeing {
	public int getMin(int[] position) {
        int min = Integer.MAX_VALUE;
        int l = position.length;
        for(int i=1; i<l-1; i++){
            int distance = 0;
            for(int j=0; j<l; j++){
                if(j!=0&&i!=j){
                    distance += Math.abs(position[(j-1==i)?i-1:j-1]-position[j]);
                }
            }
            if(min>distance) min = distance;

        }
		return min;
	}
}
