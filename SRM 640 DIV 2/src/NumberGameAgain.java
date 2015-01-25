import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NumberGameAgain {
	
	public long solve(int k, long[] table) {
		Arrays.sort(table);
		ArrayList<Long> forbiddenVertices = new ArrayList<Long>();
		for(long i: table){
			boolean valid = true;
			for (long j: forbiddenVertices) {
				int lvl = levelDiff(i,j);
				if(right(j, lvl) <= i && i <= left(j, lvl))
					valid = false;
			}
			if(valid) forbiddenVertices.add(i);
		}
		long winLast = powTwo(k)-1;
		long count = winLast - 1;
		for (long vertex: forbiddenVertices){
			count -= treeSum(levelDiff(winLast, vertex));
		}
		return count;
	}

	public long treeSum(int level) {
		return powTwo(level+1)-1;
	}

	public int levelDiff(long a, long b) {
		int levelA = (int)(Math.log(a)/Math.log(2));
		int levelB = (int)(Math.log(b)/Math.log(2));
		return Math.abs(levelA-levelB);
	}

	public long right(long n, int i) {
		return powTwo(i)*n;
	}

	public long left(long n, int i) {
		long temp = powTwo(i);
		return temp*n+temp-1;
	}

	public long powTwo(int n) {
		if(n==0) return 1;
		if(n==1) return 2;
		long res = 2;
		for (int i = 1; i < n; i++) {
			res*=2;
		}
		return res;
	}
}
