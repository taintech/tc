package SRM500;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class MafiaGame {
    public static void main(String[] args){
        String[] stringArray = {};
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 18, 19, 0};
//        int[] intArray = {17, 10, 3, 14, 22, 5, 11, 10, 22, 3, 14, 5, 11, 17};
        int n = 0;
        System.out.println(probabilityToLose(n,intArray));
    }
    public static double probabilityToLose(int n, int[] decisions){
        ArrayList<Integer> dist = new ArrayList<Integer>();
        for (int i=0;i<decisions.length;i++){
            if(!dist.contains(decisions[i])) dist.add(decisions[i]);
        }
        int[] counter = new int[dist.size()];
        for (int i=0;i<decisions.length;i++){
            counter[dist.indexOf(decisions[i])]++;
        }
        Arrays.sort(counter);
        int max = counter[counter.length-1];
        int count = 0;

        for(int i=counter.length-1;i>=0;i--){
            if (max==counter[i]) count++;
            else break;
        }
        return (double)1/count;
    }
    public static boolean utility(int[] ar){
        return true;
    }
}
