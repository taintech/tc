import java.util.*;

//SRM518
//TODO third question
public class LargestSubsequence {
	public String getLargest(String s) {
        int l = s.length();
        if(l==1||l==0) return s;
        char max = 'a';
        for(char c: s.toCharArray()){
            if(max<c) max = c;
        }
		return max+getLargest(s.substring(s.indexOf(max)+1));
	}
}
