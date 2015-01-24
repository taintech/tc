import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GCDLCMEasy {
	
	public String possible(int n, int[] A, int[] B, int[] G, int[] L) {
		int[] xs = new int[n];

		for (int i = 0; i < n; i++) {
			boolean gcdFlag = gcd(xs[A[i]], xs[B[i]]) == G[i];
			boolean lcmFlag = lcm(xs[A[i]], xs[B[i]]) == G[i];
			if(!gcdFlag||!lcmFlag) return "Solution does not exist";
		}
		return "Solution exists";
	}

	public int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}

	public int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
}
