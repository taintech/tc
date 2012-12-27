package unknown;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/13/11
 * Time: 7:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class MarbleDecoration {
    public static void main(String[] args){
        System.out.println(maxLength(0,0,0));
    }
    public static int maxLength(int r, int g, int b){
        int n=1;
        if(r==0&&g==0&&b==0) n=0;
        int[] ar = new int[3];
        ar[0] = r;
        ar[1] = g;
        ar[2] = b;
        Arrays.sort(ar);
        r = ar[2];
        g = ar[1];
        while(r!=0&&g!=0){
            r--;
            n++;
            g--;
            n++;
        }
        return n;
    }
}
