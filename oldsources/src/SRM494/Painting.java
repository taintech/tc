package SRM494;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 16:23
 * To change this template use File | Settings | File Templates.
 */
//TODO
public class Painting {
    public static int largestBrush(String[] pic){
        int res = 0;
        int n = pic.length;
        int m = pic[0].length();
        res = findMin(pic,n,m);
        while(res!=1){
            for(int i=0;i<n-res+1;i++){
                for(int j=0;j<m-res+1;j++){
                    if(test(pic,res,i,j)) return res;
                }
            }
            res--;
        }
        return res;
    }
    public static int findMin(String[] pic, int n, int m){
        boolean flag = false;
        int min = Math.min(n,m);
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (pic[i].charAt(j)=='B'){
                    if (flag) temp++;
                    else{
                        flag = true;
                        temp++;
                    }
                } else{
                    flag = false;
                    if(min>temp) min=temp;
                    temp=0;
                }
            }
            flag = false;
            if(min>temp) min=temp;
            temp=0;
        }
        return min;
    }
    public static boolean test(String[] pic,int n,int i0,int j0){
        boolean res = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(pic[i0+i].charAt(j0+j)!='B') return false;
            }
        }
        return res;
    }
}
