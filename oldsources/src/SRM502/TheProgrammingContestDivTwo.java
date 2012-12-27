package SRM502;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class TheProgrammingContestDivTwo {
    public static void main(String[] args){
        String[] stringArray = {};
        int[] intArray = {8,5};
        int t = 47;
        for(int i: find(t,intArray)) System.out.print(i+" ");
    }
    public static int[] find(int T, int[] time){
        Arrays.sort(time);
        int res[] = {0,0};
        int counter = 0;
        int idlast = 0;
        for (int i=0;i<time.length;i++){
            if(counter+time[i]<=T){
                counter+=time[i];
                res[0]++;
                res[1]+=counter;
                idlast=i;
            }
        }
//        if (res[0]!=0) res[1]-=time[idlast];
        return res;
    }
    public static boolean utility(int[] ar){
        return true;
    }
}
