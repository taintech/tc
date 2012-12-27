package unknown;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/13/11
 * Time: 7:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConsecutiveNumbers {
    public static void main(String[] args){
        int[] t = {10,7,12,8,11};
        for(int n:missingNumber(t)) System.out.println(n+" ");
    }
    public static int[] missingNumber(int[] numbers){
        int[] ns = numbers.clone();
        int[] err= {};
        int[] one=new int[1];
        int[] two=new int[2];
        Arrays.sort(numbers);
        int[] a=hi(numbers);
        int delta=numbers[0];
        for(int n:a){
            delta+=n;
            if(n==2){
                one[0]=delta-1;
                return one;
            }
            if(n>2){
                return err;
            }
        }
        if(ns[0]-1<1){
            one[0]=ns[ns.length-1]+1 ;
            return one;
        }
        two[0] = ns[0]-1;
        two[1] = ns[ns.length-1]+1;
        return two;
    }
    public static int[] hi(int[] ns){
        int[] nn = new int[ns.length];
        nn[0]=0;
        for(int i=1;i<ns.length;i++){
            nn[i] = ns[i]-ns[i-1];
        }
        return nn;
    }
}
