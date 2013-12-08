import java.util.*;

public class LittleElephantAndBallsAgain {
    private char[] s = null;
	public int getNumber(String S) {
        int min = Integer.MAX_VALUE;
        s = S.toCharArray();
        int l = s.length;
        for(int i=0; i<l; i++){
            char c = s[i];
            int start = i;
            while(i<l-1 && c == s[i+1]){
                i++;
            }
            int end = i;
            int n = l-Math.abs(start-end)-1;
            if(n!=0&&min>n) min = n;
        }
		return min==Integer.MAX_VALUE?0:min;
	}
}
