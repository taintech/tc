import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FibonacciDiv2 {
	
	public int find(int N) {
		int min = Integer.MAX_VALUE;
        int temp = 0;
        int i = 0;
        do{
            temp = fib(i++);
            int diff = Math.abs(N-temp);
            if(diff<min) min = diff;
        } while(temp <= N);
        return min;
	}


    /**
     * 0 : 0
     * 1 : 1
     * 2 : 1
     * 3 : 1 + 1 = 2
     * 4 : 1 + 1 + 1 = 3
     * 5 : 1 + 1 + 1 + 1 + 1 = 5
     * 6 : 3 + 5 = 8
     * @param n
     * @return fibanocci number
     */
    private int fib(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else return fib(n-1)+fib(n-2);
    }
}
