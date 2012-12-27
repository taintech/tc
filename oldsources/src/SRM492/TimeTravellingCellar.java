package SRM492;

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/26/11
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
//solved SRM 492 - 150 points
public class TimeTravellingCellar {
    public static void main(String[] args){
        int[] a = {7116, 8936};   //{7116, 8936}, {9309, 536}
        int[] b = {9309, 536};    //expected  6580
        System.out.println(determineProfit(a,b));
    }
    public static int determineProfit(int[] profit, int[] decay){
        int res = Integer.MIN_VALUE;
        for(int i=0;i<profit.length;i++){
            for(int j=0;j<decay.length;j++){
                if(i!=j&&profit[i]-decay[j]>res){
                    res = profit[i]-decay[j];
                }
            }
        }
        return res;
    }
}
