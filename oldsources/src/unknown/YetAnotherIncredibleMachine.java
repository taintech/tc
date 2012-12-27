package unknown;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/26/11
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class YetAnotherIncredibleMachine {
    public static void main(String[] args){
        int[] p = {3,4};
        int[] l= {3,3};
        int[] b = {2,7};
        System.out.println("Result: "+countWays(p,l,b));
    }
    public static int countWays(int[] platformMount, int[] platFormLength,int[] balls){
        int res = 1;
        double[] all=new double[balls.length+platformMount.length];
        for(int i=0;i<balls.length;i++){
            all[i]=balls[i];
        }
        String info = "";
        for(int i=balls.length;i<balls.length+platFormLength.length;i++){
            all[i]=Double.parseDouble(platformMount[i-balls.length]+"."+(i-balls.length)+"0"+platFormLength[i-balls.length]);
        }
        Arrays.sort(all);
        for(double d:all) System.out.println(d);
        int mult=1;
        for(int i=0;i<all.length;i++){
            if(all[i]%1>0){
               for(int in:parse(all[i])) System.out.println(in);
            }
        }
        return res;
    }
    public static int[] parse(double d){
        int[] res = new int[3];
        res[0]=(int)d;
        String s = ((d%1)+"").substring(2);
        System.out.println(s);
        return res;
    }
}
