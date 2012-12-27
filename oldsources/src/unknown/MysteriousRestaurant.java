package unknown;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/13/11
 * Time: 9:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class MysteriousRestaurant {
    public static void main(String[] args){
        String[] p = {"26", "14", "72", "39", "32", "85", "06"};
        String[] p1 = {"SRM","512"};
        String[] p3 = {"Dear", "Code", "rsHa", "veFu", "nInT", "heCh", "alle", "ngeP", "hase", "andb", "ecar", "eful"};
        String[] p2 = {"26", "14", "72", "39", "32", "85", "06", "91"};
        System.out.println(maxDays(p2,20));

    }
    public static int maxDays(String[] prices, int budget){
        int n=0;
        int m=0;
        for(String p: prices){
            int[] ar = toMyAr(p);
            m+=min(ar);
            if(m>budget) break;
            else n++;
        }
        return n;
    }
    public static int min(int[] cs){
        Arrays.sort(cs);
        return cs[0];
    }

    public static int index(int[] a){
        int min=a[0];
        int index=0;
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
                index=i;
            }
        }
        return index;
    }

    public static int[] toMyAr(String s){
        int i=0;
        int[] ar = new int[s.length()];
        for(char c: s.toCharArray()){
            ar[i++]=rulez(c);
        }
        return ar;
    }

    public static int rulez(char c){
        if(c>='0'&&c<='9'){
            return c-'0';
        }
        if(c>='A'&&c<='Z'){
            return c-'A'+10;
        }
        return c-'a'+36;
    }
}
