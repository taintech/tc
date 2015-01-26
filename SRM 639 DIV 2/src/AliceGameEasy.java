import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AliceGameEasy {
	
	public long findMinimumValue(long x, long y) {
		long a = 1;
		long b = 1;
		long c = -2*(x+y);
		long d = b*b - 4*a*c;
		double nd = (-b + Math.pow(d, 0.5))/2*a;
		if (Math.round(nd)!=nd) return -1;
		if (x==0) return 0;
		long n = (long)nd;
		if (n==0) return 0;
		if (n>=x) return 1;
		long count = 0;
		long i1 = x;
		long i2 = n;
		while(i1 > i2){
			i1 -= i2;
			i2--;
			count++;
		}
		return count+1;
	}
}
