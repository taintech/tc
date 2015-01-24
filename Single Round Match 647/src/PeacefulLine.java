import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PeacefulLine {
	
	public String makeLine(int[] x) {
		Arrays.sort(x);
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			int c = x[i];
			int count = 1;
			for (int j = i+1; j < x.length; j++) {
				int n = x[j];
				if(c==n) count++;
			}
			if(max<count) max = count;
		}
		int n = x.length%2==0?x.length/2:x.length/2+1;

		return max > n ?"impossible":"possible";
	}
}
