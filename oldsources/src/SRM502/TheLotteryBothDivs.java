package SRM502;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class TheLotteryBothDivs {
    public static void main(String[] args){
        String[] stringArray = {"8542861", "1954", "6", "523", "000000000", "5426", "8"};
        int[] intArray = {};
//        for(int i: method("")) System.out.print(i+" ");
//        for(String s: getMaximumPoints("")) System.out.print(s+" ");
        System.out.println(find(stringArray));
    }
    public static double find(String[] suffixes){
        ArrayList<String> distinct = new ArrayList<String>();
        for (String s : suffixes) if(!distinct.contains(s)){
            distinct.add(s);
        }
        int l = distinct.size();
        String[] ar = new String[l];
        for(int i=0;i<l;i++){
            ar[i]=distinct.get(i);
        }
        Arrays.sort(ar,new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()) return 1;
                else if (o1.length()<o2.length()) return -1;
                else return 0;
            }
        });
        for (int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(ar[i]!=null&&ar[j]!=null&&ar[j].endsWith(ar[i])) ar[j] = null;
            }
        }
        double res = 0D;
        int max = 0;
        for(String s: ar){
            if (s==null) continue;
            if(s.length()>max) max=s.length();
            res+=1/(Math.pow(10,s.length()));
        }
        return round(res,max);
    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
