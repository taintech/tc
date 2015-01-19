import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LightSwitchingPuzzle {
	
	public int minFlips(String state) {
		int res = 0;
		char[] chars = state.toCharArray();
		int n = chars.length;
		for (int i = 0; i < n; i++) {
			if(chars[i]=='Y') {
				for (int j = i; j < n; j+=i+1) {
					chars[j] = chars[j] == 'Y' ? 'N' :'Y';
				}
				res++;
			}
		}

		return res;
	}
}
