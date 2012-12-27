package SRM514;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class FortunateNumbers {
    public static void main(String[] args){
        String[] stringArray = {};
        int[] a = { 1, 10, 100 };
        int[] b = {3,53};
        int[] c = {4,54};
        System.out.println(getFortunate(a,b,c));
    }
    public static int getFortunate(int[] a,int[] b, int[] c){
        int[] empty = {};
        int l = a.length;
        int m = b.length;
        int n = c.length;
        String temp = "";
        ArrayList<Integer> d = new ArrayList<Integer>();
        for (int i=0;i<l;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<n;k++){
                    int sum = a[i]+b[j]+c[k];
                    boolean flag = true;
                    temp = sum+"";
                    for(char ch: temp.toCharArray()){
                        if(!((ch-'0')==5||(ch-'0')==8)) flag = false;
                    }
                    if(flag&&!d.contains(sum)) d.add(sum);
                }
            }
        }
        return d.size();
    }
    public static boolean utility(int[] ar){
        return true;
    }
}
