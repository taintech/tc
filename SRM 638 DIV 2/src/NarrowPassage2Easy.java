import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NarrowPassage2Easy {
	
	public int count(int[] size, int maxSizeSum) {
		int res = 0;
		int n = size.length;
		Set<String> visited = new HashSet<String>();
		Queue<String> queue = new LinkedList<String>();
		String temp = toStringWithIndex(size);
		queue.add(temp);
		visited.add(temp);
		String next;
		int[] ar;
		while((next=queue.poll())!=null){
			res++;
			ar = toArray(next, n);
			for (int i = 1; i < n; i++) {
				int a = ar[i-1];
				int b = ar[i];
				if(a/10+b/10<=maxSizeSum) {
					ar[i-1] = b;
					ar[i] = a;
					temp = Arrays.toString(ar);
					if(!visited.contains(temp)) {
						visited.add(temp);
						queue.add(temp);
					}
					ar[i-1] = a;
					ar[i] = b;
				}
			}
		}
		return res;
	}

	String toStringWithIndex(int[] ar) {
		int[] temp = Arrays.copyOf(ar, ar.length);
		for (int i = 0; i < ar.length; i++) {
			temp[i] = temp[i]*10 + i;
		}
		return Arrays.toString(temp);
	}

	int[] toArray(String str, int size){
		int[] res = new int[size];
		char[] chars = str.substring(1,str.length()-1).toCharArray();
		int index = 0;
		int temp = 0;
		for (char c: chars) {
			if(c==','){
				res[index] = temp;
				temp = 0;
				index++;
			}
			else if(c!=' ') {
				temp = 10 * temp + (c - '0');
			}
		}
		res[index] = temp;
		return res;
	}
}
