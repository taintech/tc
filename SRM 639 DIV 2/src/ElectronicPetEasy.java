import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ElectronicPetEasy {
	
	public String isDifficult(int st1, int p1, int t1, int st2, int p2, int t2) {
		int[] ar1 = new int[t1];
		ar1[0] = st1;
		for (int i = 1; i < t1; i++) {
			ar1[i] = ar1[i-1]+p1;
		}
		int[] ar2 = new int[t2];
		ar2[0] = st2;
		for (int i = 1; i < t2; i++) {
			ar2[i] = ar2[i-1]+p2;
		}
		for (int i: ar1){
			for (int j: ar2){
				if(i==j) return "Difficult";
			}
		}
		return "Easy";
	}
}
