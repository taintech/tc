package unknown;

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/26/11
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class TrueSpace {
    public static void main(String[] args){

    }
    public static long calculateSpace(int[] sizes, int clusterSize){
        int res = 0;
        for(int i: sizes){
            res += (clusterSize==1)?clusterSize:clusterSize*(i/clusterSize)+((i%clusterSize!=0)?clusterSize:0);
        }
        return res;
    }
}
