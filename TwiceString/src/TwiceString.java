import java.util.*;

//SRM518
public class TwiceString {
	public String getShortest(String s) {
        int dif = 1;
        String tale = "";
        int l = s.length();
        String candidate = "";
        for(;dif<=l;dif++){
            candidate = s+(tale = s.charAt(l-dif) + tale);
            if(candidate.contains(s)){
                if (candidate.substring(dif).contains(s)) break;
            }
        }
        return candidate;
	}
}
