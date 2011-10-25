import java.util.*;

public class MissingParentheses {
    String par;
	public int countCorrections(String par) {
        while(par.contains("()")) par = replacePars(par);
        return par.length();
	}
    public String replacePars(String par){
        for(int i=0; i< par.length();i++){
            if(par.charAt(i)=='('&&i!=par.length()-1&&par.charAt(i+1)==')')
                return par.substring(0,i)+par.substring(i+2,par.length());
        }
        return "";
    }
}
