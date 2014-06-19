import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AddMultiply {
	
	public int[] makeExpression(int y) {
        int[] x = new int[3];
        for (int i = -1000; i <= 1000; i++) {
            if(i!=0&&Math.abs(i)!=1){
                for (int j = -1000; j <= 1000; j++) {
                    if(j!=0&&Math.abs(j)!=1){
                        int diff = y - i*j;
                        if(Math.abs(diff)<=1000){
                            x[0] = i;
                            x[1] = j;
                            x[2] = diff;
                        }
                    }
                }
            }
        }
        return x;
    }
}
