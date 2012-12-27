package SRM498;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class AdditionGame {
    public static void main(String[] args){
        String[] stringArray = {};
        int[] intArray = {};
//        for(int i: getMaximumPoints("")) System.out.print(i+" ");
//        for(String s: getMaximumPoints("")) System.out.print(s+" ");
        System.out.println(getMaximumPoints(8,2,6,13));
    }
    public static int getMaximumPoints(int a,int b, int c, int n){
        int[] ar = {a,b,c};
        int points = 0;
        for (int i=0;i<n;i++){
            Arrays.sort(ar);
            if(ar[2]>=1){
                points+=ar[2];
                ar[2]--;
            }
        }
        return points;
    }
    public static boolean utility(int[] ar){
        return true;
    }
}
