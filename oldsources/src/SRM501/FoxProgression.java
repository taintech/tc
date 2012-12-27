package SRM501;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class FoxProgression {
    public static void main(String[] args){
        int[] intArray = {8,4};
        System.out.println(theCount(intArray));
    }
    public static int theCount(int[] seq){
        int res = 2;
        if(seq.length==1) return -1;
        int a = seq[0]-seq[1];
        boolean aa = true;
        double b = (double)seq[1]/seq[0];
        boolean bb= true;
        if(seq[1]%seq[0]!=0){
            res--;
            bb=false;
        }
        for(int i=1;i<seq.length;i++){
            if(aa&&a!=seq[i-1]-seq[i]){
                res--;
                aa=false;
            }
            if((b==0)||(bb&&b!=(double)seq[i]/seq[i-1])){
                res--;
                bb=false;
            }
            if(!aa&&!bb) return 0;
        }
        if(res==2){
            int next1 = seq[seq.length-1]+a;
            double next2 = seq[seq.length-1]*b;
            if (next1==next2) return 1;
            else return 2;
        } else{
            return 1;
        }
    }
    public static boolean utility(int[] ar){
        return true;
    }
}
