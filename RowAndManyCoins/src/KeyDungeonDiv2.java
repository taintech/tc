/**
 * Author: Rinat Tainov
 * Email: rinat@tainov.com
 * Date: 8/12/13
 * Time: 9:15 PM
 */
public class KeyDungeonDiv2 {

    public int countDoors(int[] a, int[] b, int[] c){
        long n = a.length;
        int res = 0;
        int temp = 0;
        for(int i = 0 ; i < n ;i ++){
            if(a[i]<=c[0]){
                if(b[i]<=c[1]+c[2]) res++;
            }else{
                if ((temp=a[i]-c[0])<=c[2]){
                    if(b[i]<=c[1]+c[2]-temp) res++;
                }
            }
        }
        return res;
    }
}
