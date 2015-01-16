import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DifferentStrings {
	
	public int minimize(String A, String B) {
		int a = A.length();
		int b = B.length();
		int min = Integer.MAX_VALUE;
		int count;
		for (int i = 0; i < b-a+1; i++) {
			count = 0;
			for (int j = 0; j < a; j++) {
				char ca = A.charAt(j);
				char cb = B.charAt(i + j);
				if(ca!=cb) count++;
			}
			if(min>count) min = count;
		}
		return min;
	}
}
