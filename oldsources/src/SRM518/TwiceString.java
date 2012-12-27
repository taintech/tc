package SRM518;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class TwiceString {
    public static void main(String[] args){
        System.out.println(getShortest("a"));
    }
    public static String getShortest(String s){
        String result = s.charAt(0) + "";
        for(int i=1;i<s.length();i++){
            if(s.startsWith(s.substring(i,s.length()))){
                return s.substring(0,i)+s;
            }
            else{
                result+=s.charAt(i);
            }
        }
        return result+result;
    }
}
