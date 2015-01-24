import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TravellingSalesmanEasy {
	
	public int getMaxProfit(int M, int[] profit, int[] city, int[] visit) {
		int n = profit.length;
		Trade[] trades = new Trade[n];
		for (int i = 0; i < n; i++) {
			trades[i] = new Trade(profit[i], city[i]);
		}
		int sum = 0;
		Trade t;
		for (int c: visit){
			int max = 0;
			int maxIndex = -1;
			for (int i = 0; i < n; i++) {
				t = trades[i];
				if(!t.done&&t.city==c){
					if(max<t.profit) {
						max = t.profit;
						maxIndex = i;
					}
				}
			}
			if (maxIndex!=-1){
				sum+=max;
				trades[maxIndex].done = true;
			}
		}
		return sum;
	}

	private class Trade{
		int profit;
		int city;
		boolean done;

		public Trade(int profit, int city) {
			this.profit = profit;
			this.city = city;
			done = false;
		}
	}
}
