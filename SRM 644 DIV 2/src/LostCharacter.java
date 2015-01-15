import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LostCharacter {
	
	public int[] getmins(String[] str) {
		int n = str.length;
		Object[] arRefs = new Object[n];
		int total = 1;
		String[] permutations;
		for (int i = 0; i < n; i++) {
			 permutations = getPermutations(str[i]);
			arRefs[i] = permutations;
			total *= permutations.length;
		}
		return null;
	}

	public String[] getPermutations(String s){
		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			if(chars[i]=='?'){
				String[] res = new String[0];
				String[] strings;
				String[] temp;
				for (int j = 0; j < 26; j++) {
					chars[i] = (char)('a'+j);
					strings = getPermutations(String.valueOf(chars));
					temp = Arrays.copyOf(res, res.length + strings.length);
					System.arraycopy(strings, 0, temp, res.length, strings.length);
					res = temp;
				}
				return res;
			}
		}
		return new String[]{s};
	}

	public int[] getPositions(String[] strings){
		int n = strings.length;
		int[] res = new int[n];
		SortedSet<String> set = new TreeSet<String>(Arrays.asList(strings));
		int count;
		String s1;
		for (int i = 0; i < n; i++) {
			count = 0;
			s1 = strings[i];
			for(String s2: set){
				if (s1.equals(s2))
					break;
				count++;
			}
			res[i] = count;
		}
		return res;
	}
}
