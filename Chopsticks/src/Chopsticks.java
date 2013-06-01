import java.util.*;

public class Chopsticks {
	public int getmax(int[] length) {
        int counter =0;
        for(int i=0; i<length.length; i++){
            if(length[i]==0) continue;
            for(int j=i+1; j<length.length; j++){
                if(length[i]==length[j]){
                    length[i] = 0;
                    length[j] = 0;
                    counter++;
                    break;
                }
            }
        }
		return counter;
	}
}
