package SRM499;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class SimpleGuess {
    public static void main(String[] args){
        String[] stringArray = {};
        int[] intArray = {1,4,5};
        System.out.println(getMaximum(intArray));
    }
    public static int getMaximum(int[] hints){
        int max = 0;
        for(int i: hints){
            for(int j: hints){
               if (i==j) continue;
               int q = (j*j-i*i);
               if(q%4==0){
                   if (q/4>max) max=q/4;
               }
            }
        }
        return max;
    }
    public static boolean utility(int[] ar){
        return true;
    }
}
