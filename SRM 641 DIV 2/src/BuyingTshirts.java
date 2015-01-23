import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BuyingTshirts {
	
	public int meet(int T, int[] Q, int[] P) {
		int q = 0;
		int p = 0;
		int count = 0;
		boolean flagQ;
		boolean flagP;
		for (int i = 0; i < Q.length; i++) {
			flagQ = false;
			flagP = false;
			q+=Q[i];
			p+=P[i];
			if(q>=T){
				flagQ = true;
				q-=T;
			}
			if(p>=T){
				flagP = true;
				p-=T;
			}
			if(flagQ&&flagP)
				count++;
		}
		return count;
	}
}
