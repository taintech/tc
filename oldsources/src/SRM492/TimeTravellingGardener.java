package SRM492;

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/26/11
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
//TODO Solve
//Can't solve SRM 492 - 550 points
public class TimeTravellingGardener {
    public static void main(String[] args){
        int[] a = {2, 2};
        int[] b = {1, 3, 10};
        System.out.println(determineUsage(a,b));
    }
    public static int determineUsage(int[] d, int[] h){
        int res = Integer.MAX_VALUE;
        int n = h.length;
        int x = d[0];
        for(int i=1;i<n-1;i++){
            x = x + d[i];
            d[i] = x;
        }
        double slope = 0D;
        double angle = 0D;
        double slope1 = 0D;
        double angle1 = 0D;
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    slope = (double)(h[j]-h[i])/(double)(((j==0)?0:d[j-1])-((i==0)?0:d[i-1]));
//                    angle = Math.atan(slope);
                    temp = 0;
                    for(int k=0;k<n;k++){
                        if(i!=k&&j!=k){
                            slope1 = (double)(h[k]-h[i])/(double)(((k==0)?0:d[k-1])-((i==0)?0:d[i-1]));
//                            angle1 = Math.atan(slope1);
                            if(slope1>slope) temp++;
                        }
                    }
                    if(!(temp==0&&res!=Integer.MAX_VALUE)&&temp<res) res = temp;
                }
            }
        }
        return res;
    }
}
