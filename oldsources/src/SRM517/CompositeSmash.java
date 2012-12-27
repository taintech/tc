package SRM517;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class CompositeSmash {
    public static void main(String[] args){
        int n = 5858;
        int k = 2;
        System.out.println(thePossible(n,k));
    }
    public static String thePossible(int n, int target){
        if(n==target) return "Yes";
        String res = null;
        res = startSmashes(smash(n), n, target);
        return res;
    }
    public static String startSmashes(Set<Integer> set, int n, int target){
        Iterator<Integer> it = set.iterator();
        String res = "No";
        if(!it.hasNext()) return "Yes";
        while(it.hasNext()){
            System.out.println();
            int temp = (Integer)it.next();
            if(target==temp||target==(n/temp)){
                res = startSmashes(smash(temp),n,target);
            } else return "No";
        }
        return res;
    }
    public static Set<Integer> smash(int n){
        Set<Integer> set = new HashSet<Integer>();
        for(int i=2;i<n;i++)
            if(n%i==0) set.add(i);
        return set;
    }
}
