package main;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class CompositeSmash {
    public static void main(String[] args){

        System.out.println(thePossible(5858,2));
    }
    public static String thePossible(int n, int target){
        if(n==target) return "Yes";
        return smashRec(n,target,n);
    }
    public static String smashRec(int n, int target, int k){
        String res = "";
        Set<Integer> set = smash(k);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int first = it.next();
            int second = n/first;
            if(first==target||second==target) return "Yes";
        }
        it = set.iterator();
        while(it.hasNext()){
            int first = it.next();
            int second = n/first;
            if(res.equals("No")) return "No";
        }
        return res;
    }
    public static Set<Integer> smash(int k){
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i=2;i<=k/2;i++) if (k%i==0&&!set.contains(k/i)) set.add(i);
        return set;
    }
}
