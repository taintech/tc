package SRM499;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class ColorfulRabbits {
    public static void main(String[] args){
        String[] stringArray = {};
        int[] intArray = { 0 };
        System.out.println(getMinimum(intArray));
    }
    public static int getMinimum(int[] replies){
        int sum = 0;
        ArrayList<Integer> distinct = new ArrayList<Integer>();
        for (int i=0;i<replies.length;i++){
            if(!distinct.contains(replies[i])){
                distinct.add(replies[i]);
            }
        }
//        for(int a: distinct) System.out.println(a);
        int[] ar = new int[distinct.size()];
        for (int i=0;i<distinct.size();i++){
            for (int r: replies){
                if(distinct.get(i)==r) ar[i]++;
            }
        }
        for (int i=0;i<distinct.size();i++){
            int d = distinct.get(i)+1;
            if(d>=ar[i]) sum+=d;
            else{
                int groups = ar[i]/d+1;
                sum+=groups*d;
            }
        }
        return sum;
    }
    public static boolean utility(int[] ar){
        return true;
    }
}
