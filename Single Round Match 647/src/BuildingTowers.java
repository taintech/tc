import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BuildingTowers {
	
	public long maxHeight(int N, int K, int[] x, int[] t) {
		int n = x.length;
		if(n==0) return ((long)N-1)*K;
		long max = getMax(0,0,x[0],t[0],K);
		for (int i = 1; i < n; i++) {
			long localMax = getMax(x[i-1], t[i-1], x[i], t[i], K);
			if(max<localMax) max = localMax;
		}
		long last = getMax(t[n-1],x[n-1], ((long)N-x[n-1])*K, N-1, K);
		return max>last?max:last;
	}

	long getMax(long h1, long i1, long h2, long i2, long K) {
		long d = (i2-i1)/2*K;
		return Math.min(h1+d,h2+d);
	}
}
