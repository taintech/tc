package SRM500;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class SRMCards {
    public static void main(String[] args){
        String[] stringArray = {};
        int[] intArray = {491, 492, 495, 497, 498, 499};
//        for(String s: getMaximumPoints("")) System.out.print(s+" ");
        System.out.println(maxTurns(intArray));
    }
    public static int maxTurns(int[] cards){
        Arrays.sort(cards);
        int count = 0;
        if(cards.length==1){
            count++;
            cards[0]=0;
        }else if(cards.length==2&&cards[0]+1==cards[1]){
            count++;
            cards[0]=0;
            cards[1]=0;
        }
        boolean b = true;
        while(count<cards.length){
            b=true;
            for (int i=0;i<cards.length;i++){
                if(cards[i]==0) continue;
                b = false;
                System.out.println(cards[i]);
                if((i+1!=cards.length)&&cards[i]+1==cards[i+1]){
                    cards[i]=0;
                    cards[i+1]=0;
                    count++;
                }else{
                    cards[i]=0;
                    count++;
                }
            }
            if(b) break;
        }
        return count;
    }
    public static boolean utility(int[] ar){
        return true;
    }
}
