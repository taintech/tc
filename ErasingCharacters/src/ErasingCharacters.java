import java.util.*;

public class ErasingCharacters {
    String res = "";
	public String simulate(String s) {
        res = s;
        boolean p = false;
        for(int i =0 ; i<s.length()-1; i++){
            char t = s.charAt(i);
            if(t==s.charAt(i+1)){
                p=true;
                res = s.replaceFirst(""+t+""+t,"");
            }
        }
        if(p) simulate(res);
		return res;
	}
}
