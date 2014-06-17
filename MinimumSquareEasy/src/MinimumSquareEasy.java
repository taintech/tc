import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MinimumSquareEasy {

    static int[] square = new int[3];
	
	public static long minArea(int[] x, int[] y) {
        int res = 0;
        int sum = 0;
        int n = x.length;
        for(int i: x){
            sum+=i;
        }
        double avgX = sum/n;
        sum = 0;
        for(int i: y){
            sum+=i;
        }
        double avgY = sum/n;



        return res;
	}

    public static void main(String[] args){
        System.out.println();
    }

    public static boolean isInSquare(int x, int y){
        boolean isX = square[0]<=x&&(square[0]+square[2])>=x;
        boolean isY = square[1]<=y&&(square[1]+square[2])>=y;
        return isX&&isY;
    }
}
