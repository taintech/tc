import java.util.*;

public class RaiseThisBarn {
	public int calc(String str) {
        int cows = countCows(str);
        if(cows%2==1) return 0;
        if(cows==str.length()) return 1;
        if(cows==0) return str.length()-1;
        int countCows = 0;
        int countDots = 0;
        boolean mid = false;
        for(char c: str.toCharArray()){
            if(c=='c') countCows++;

            if(countCows==cows/2) mid = true;
            if(mid&&c=='.') countDots++;
            if(countCows>cows/2){
                return countDots+1;
            }
        }
		return 1;
	}

    public int countCows(String str){
        int count = 0;
        for(char c: str.toCharArray()) if(c=='c') count++;
        return count;
    }
}
