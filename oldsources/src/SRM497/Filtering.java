package SRM497;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
//todo
public class Filtering {
    public int[] designFilter(int [] sizes, String outcome){
        int a = 0;
        int r = 0;
        for(int i=0;i<outcome.length();i++){
            if (outcome.charAt(i)=='A') a++;
            if (outcome.charAt(i)=='R') r++;
        }
        int[] al = new int[a];
        int[] re = new int[r];
        a=0;
        r=0;
        for(int i=0;i<outcome.length();i++){
            if (outcome.charAt(i)=='A'){
                al[a++] = sizes[i];
            }
            if (outcome.charAt(i)=='R'){
                re[r++] = sizes[i];
            }
        }
        Arrays.sort(al);
        Arrays.sort(re);
        int[] res = new int[2];
        if (al[0]<re[r-1]) return res;
        res[0] = al[0];
        res[1] = al[a-1];
        return res;
    }
}
