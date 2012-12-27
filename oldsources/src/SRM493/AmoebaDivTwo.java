package SRM493;

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/26/11
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
//TODO Solve this and another two questions
//SRM 493 - 250 points
//Seems normal algorithm, but gives wrong answer at fifth test
public class AmoebaDivTwo {
    public static void main(String[] args){
        String[] a = {"AAA","AAM","AAA"};
            System.out.print(count(a,2));
    }
    public static int count(String[] table, int k){
        int res = 0;
        int r = table.length;
        int c = table[0].length();
        boolean mono = false;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(table[i].charAt(j)=='A'){
                    if (isMonoliteRow(table,i,j,k)) res++;
                    if (isMonoliteColumn(table, i, j, k)) res++;
                }
            }
        }
        if(k==1) res = res/2;
        return res;
    }
    public static boolean isMonoliteRow(String[] table,int i, int j,int k){
        boolean res = true;
        if (j+k>table[0].length()) return false;
        for(int z=j;z<j+k;z++){
            if (table[i].charAt(z)=='M') return false;
        }
        return res;
    }
    public static boolean isMonoliteColumn(String[] table,int i, int j, int k){
        boolean res = true;
        if (i+k>table.length) return false;
        for(int z=i;z<i+k;z++){
            if (table[i].charAt(j)=='M') return false;
        }
        return res;
    }
}
