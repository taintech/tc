import java.util.*;

//TODO SRM545 2 q,3 q
public class StrIIRec {
	public String recovstr(int n, int minInv, String minStr) {
        StringBuilder sb = new StringBuilder(minStr);
        while(sb.length()!=n){
            sb.append('a');
        }
        int range = minInv - countInterventions(sb.toString());
        if(range>0){

        }
		return res;
	}
    private int countInterventions(String s){
        int res = 0;
        for(int i = 0; i< s.length(); i++){
            char cur = s.charAt(i);
            for(int j = i; j< s.length();j++){
                if(cur>s.charAt(j)) res++;
            }
        }
        return res;
    }
}
