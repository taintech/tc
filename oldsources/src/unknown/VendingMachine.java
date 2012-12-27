package unknown;

import java.util.StringTokenizer;

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/17/11
 * Time: 1:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class VendingMachine{
	public int motorUse(String[] prices, String[] purchases){
		int res = 1;
		//implementing
		StringTokenizer colstr = new StringTokenizer(prices[0]);
		int col = 0;
		while(colstr.hasMoreTokens()){
			colstr.nextToken();
			col++;
		}
		int time = -5;
		int[] p = new int[3];
		int[] maxIndexes = null;
		int pos = 0;
		int[][] items = getPriceArray(prices);
		int[] turn = new int[2];
		int[] item = new int[1];
		for(String purchase: purchases){
			p = getPurchaseParameters(purchase);
			//res += waitTime();
			if(p[2]-time>=5){
				turn = turnTime(getMaxIndexes(items),pos,col);
				res+=turn[0];
				System.out.println("waiting time: " + turn[0]);
				System.out.println("waiting pos: " + turn[1]);
				pos=turn[1];
			}
			time = p[2];
			//res += buyTime();
			if(buy(items,p)==-1) return -1;
			item[0] = p[1];
			turn = turnTime(item,pos,col);
			res+=turn[0];
			pos=turn[1];
			System.out.println("buying time: " + turn[0]);
			System.out.println("buying pos: " + turn[1]);
		}
		//testing
		/*int[][] ar = getPriceArray(prices);
		maxIndexes = getMaxIndexes(ar);
		for(int maxIndex: maxIndexes) System.out.print(maxIndex+" ");
		System.out.println();
		for(int parameter: getPurchaseParameters(purchases[0])) System.out.print(parameter+" ");
		System.out.println();
		buy(ar,getPurchaseParameters(purchases[0]));
		maxIndexes = getMaxIndexes(ar);
		for(int maxIndex: maxIndexes) System.out.print(maxIndex+" ");
		System.out.println();*/
		return res;
	}
	public int[] turnTime(int[] ar,int pos,int col){
		int[] res = new int[2];
		res[0] = col+2;
		for (int item: ar){
			int temp = Math.min(Math.abs(item-pos),col - Math.abs(item-pos));
			if(temp<res[0]){
			 res[0]=temp;
			 res[1]=item;
			}
		}
		return res;
	}
	public int buy(int[][] items,int[] p){
		if (items[p[0]][p[1]]==0) return -1;
		items[p[0]][p[1]] = 0;
		return 0;
	}
	public int[] getPurchaseParameters(String purchase){
		int[] res = new int[3];
		StringTokenizer str = new StringTokenizer(purchase,",");
		res[0] = Integer.parseInt(str.nextToken());
		str = new StringTokenizer(str.nextToken(),":");
		res[1] = Integer.parseInt(str.nextToken());
		res[2] = Integer.parseInt(str.nextToken());
		return res;
	}
	public int[][] getPriceArray(String[] prices){
		StringTokenizer str = new StringTokenizer(prices[0]);
		int col = 0;
		int row = prices.length;
		while(str.hasMoreTokens()){
			str.nextToken();
			col++;
		}
		int[][] res = new int[row][col];
		row = 0;
		col = 0;
		for(String line: prices){
			str = new StringTokenizer(line);
			col=0;
			while(str.hasMoreTokens()){
				res[row][col++] = Integer.parseInt(str.nextToken());
			}
			row++;
		}
		return res;
	}
	public int[] getMaxIndexes(int[][] ar){
		int sum = 0;
		int maxSum = 0;
		int[] sums = new int[ar[0].length];
		for(int i=0;i<ar[0].length;i++){
			sum = 0;
			for(int j=0;j<ar.length;j++){
				sum +=ar[j][i];
			}
			sums[i] = sum;
			if(maxSum<=sum) maxSum=sum;
		}
		int size = 0;
		for(int i=0;i<sums.length;i++){
			if(maxSum==sums[i]) size++;
		}
		int[] res = new int[size];
		size=0;
		for(int i=0;i<sums.length;i++){
			if(maxSum==sums[i]) res[size++] = i;
		}
		return res;
	}
}