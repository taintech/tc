import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheConsecutiveIntegersDivTwo {
	
	public int find(int[] numbers, int k) {
		if(k==1) return 0;
		int n = numbers.length;
		int min  = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int diff = Math.abs(numbers[i] - numbers[j]);
				if(min > diff) min = diff;
			}
		}
		return min-1;
	}
}
