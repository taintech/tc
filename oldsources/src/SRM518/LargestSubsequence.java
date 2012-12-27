package SRM518;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class LargestSubsequence {
    public static void main(String[] args){
        System.out.println(getLargest("a"));
    }
    public static String getLargest(String s){
        String result = "";
        int begin = 0;
        char aa = ' ';
        ArrayList<String> a = new ArrayList<String>();

        while(begin< s.length()){
            for(int i=begin;i<s.length();i++){
                if(s.charAt(i)>aa){
                    aa = s.charAt(i);
                    begin = i;
                }
            }
            result +=aa;
            aa=' ';
            begin++;
        }
        return  result;
    }
    public static boolean utility(int[] ar){
        return true;
    }
}
