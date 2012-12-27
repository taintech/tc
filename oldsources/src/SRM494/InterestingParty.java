package SRM494;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
public class InterestingParty {
    public static int bestInvitation(String[] first, String[] second){
        int res = 0;
        ArrayList<String> t = new ArrayList<String>();
        for (int i=0;i<first.length;i++){
            if(!t.contains(first[i])) t.add(first[i]);
            if(!t.contains(second[i])) t.add(second[i]);
        }
        int[] ar = new int[t.size()];
        for (int i=0;i<first.length;i++){
            ar[t.indexOf(first[i])]++;
            ar[t.indexOf(second[i])]++;
        }
        Arrays.sort(ar);
        return ar[ar.length-1];
    }
}
