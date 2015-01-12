import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BacteriesColony {
	
	public int[] performTheExperiment(int[] colonies) {
		int n = colonies.length;
		int[] result = Arrays.copyOf(colonies, n);
		do{
			colonies = Arrays.copyOf(result, n);
			for (int i = 1; i < n-1; i++) {
				int current = colonies[i];
				int left = colonies[i-1];
				int right = colonies[i+1];
				if(current>left&&current>right)
					result[i] = current - 1;
				else if(current<left&&current<right)
					result[i] = current + 1;
			}
		}while (!Arrays.equals(result, colonies));
		return result;
	}
}
