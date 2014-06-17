import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GameOfSegments {
	
	public int winner(int N) {
        int steps = step(N);
		return steps%2==0?2:1;
	}

    public int step(int n){
        if(n==1) return 0;
        else if(n==2||n==3) return 1;
        else{
            int right  = (n - 2)/2;
            int left = n - 2 - right;
            return 1 + step(right)+step(left);
        }
    }
}
