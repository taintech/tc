/**
 * Author: Rinat Tainov
 * Email: rinat@tainov.com
 * Date: 8/12/13
 * Time: 9:44 PM
 */
public class GUMIAndSongsDiv2 {

    int ii = 0;

    public int maxSongs(int[] duration, int[] tone, int T){
        int n = duration.length;
        int count = 0;
        int max = 0;
        int ar[][] = new int[n][n];
        for(int i=0;i<n;i++){
            int e = tone[i];
            for(int j=0;j<n;j++){
                ar[i][j] = Math.abs(tone[j]-e)+duration[j];
            }
        }
        for(int i=0;i<n;i++){
            count = 0;
            sing(count,T,ar,i);
            if(max<count) max = count;
        }
        return max;
    }

    public int sing(int count, int T, int[][] ar, int index){
        if((T=T-getTime(index,ar[index]))>0){
            count++;
            return sing(count, T, ar, ii);
        }else{
            return count;
        }
    }

    public int getTime(int index, int[] ar){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            if(index!=i&&min>ar[i]){
                min = ar[i];
                ii = i;
            }
        }
        return ar[index]+min;
    }
}
