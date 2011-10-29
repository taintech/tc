import java.util.*;

public class TwiceString {
	public String getShortest(String s) {
        String shortest;
        int l = s.length();
        int offSet=0;
        for(int i=1;i<l+1;i++){
            if(isGood(s,i)){
                offSet=i;
            }
        }
        return s+s.substring(0,l-offSet);
	}
    public boolean isGood(String s, int offSet){
        boolean res = false;
        int l = s.length();
        for(int i=0;i<l-offSet;i++){
            if (s.charAt(i+offSet)!=s.charAt(i)) res=false;
        }
        return res;
    }
}
