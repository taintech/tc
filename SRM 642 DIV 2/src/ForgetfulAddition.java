import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ForgetfulAddition {
	
	public int minNumber(String expression) {
		int min = Integer.MAX_VALUE;
		int n = expression.length();
		for (int i = 1; i < n; i++) {
			int a = Integer.parseInt(expression.substring(0, i));
			int b = Integer.parseInt(expression.substring(i,n));
			int c = a + b;
			if(c < min) min = c;
		}
		return min;
	}
}
