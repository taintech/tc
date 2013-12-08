import java.util.*;

public class MiniatureDachshund {
	public int maxMikan(int[] mikan, int weight) {
        if(weight==5000) return 0;
        if(weight+sum(mikan)<=5000) return mikan.length;
        Arrays.sort(mikan);
        int i = 0;
        while(weight<=5000){
            weight+=mikan[i++];
        }
		return i-1;
	}
    public int sum(int[] ar){
        int sum = 0;
        for(int i : ar){
            sum+=i;
        }
        return sum;
    }
}
