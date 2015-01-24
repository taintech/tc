import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Jumping {
	
	public String ableToGet(int x, int y, int[] jumpLengths) {
		int sum = 0;
		int maxElement = Integer.MIN_VALUE;
		for (int jumpLength : jumpLengths) {
			sum += jumpLength;
			if (jumpLength > maxElement) maxElement = jumpLength;
		}
		double distance = Math.pow(x*x+y*y, 0.5);
		if(sum<distance) return "Not able";
		if(2*maxElement-sum>distance) return "Not able";
		return "Able";
	}
}
