package SRM496;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 02.08.11
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
//todo can't solve 250
public class AnagramFree {
    public int getMaximumSubset(String[] s){
        int max = 0;
        int temp = 1;
        char[] ar1;
        char[] ar2;
        for (int i=0;i<s.length;i++){
           ar1 = s[i].toCharArray();
            Arrays.sort(ar1);
           for (int j=0;j<s.length;j++){
               temp = 1;
               if(j==i) continue;
               ar2 = s[j].toCharArray();
               if(ar1.length!=ar2.length){
                   temp++;
                   continue;
               }
               Arrays.sort(ar2);
               if (test(ar1,ar2)){
                   temp++;
               }
           }
            if(max<temp) max = temp;
        }
        return max;
    }
    public boolean test(char[] ar1,char[] ar2){
        for(int i=0;i<ar1.length;i++){
            if(ar1[i]!=ar2[i]) return false;
        }
        return true;
    }
}
