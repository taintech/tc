import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CatchTheBeatEasy {

    String CAN = "Able to catch";
    String CAN_NOT = "Not able to catch";
    int[] order;
    int n;
	
	public String ableToCatchAll(int[] x, int[] y) {
        n = x.length;
		//sort by y
        order = new int[n];
        for (int i = 0; i < n; i++) {
            order[i] = 51;
        }
        setOrder(y);
        boolean flag = true;
        //start from lowest y
        for (int i = 0; i < n; i++) {
            int j = order[i];
            if(flag){
                if(Math.abs(x[j])>Math.abs(y[j])) return CAN_NOT;
                flag = false;
            }
            if(i+1!=n){
                int k = order[i+1];
                //if diff between x is bigger than y, cannot catch
                int xDiff = Math.abs(x[j]-x[k]);
                int yDiff = Math.abs(y[j]-y[k]);
                if(xDiff>yDiff) return CAN_NOT;
            }
        }
        return CAN;
	}

    public void setOrder(int[] y) {
        int[] temp = Arrays.copyOf(y, n);
        Arrays.sort(temp);
        int k = 0;
        for (int i = 0; i < n; i++) {
            int e = temp[i];
            for (int j = 0; j < n; j++) {
                if(e==y[j]){
                    if(!isInOrder(j)) {
                        order[k++] = j;
                    }
                }
            }
        }
    }

    public boolean isInOrder(int e){
        for (int i = 0; i < n; i++) {
            if(order[i]==e) return true;
        }
        return false;
    }
}
