import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheGridDivTwo {

	int[][] grid;
	int K;
	
	public int find(int[] x, int[] y, int k) {
		int n = 2*k+1;
		K = k;
		grid = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = Math.abs(i-k)+Math.abs(j-k);
			}
		}
		for (int i = 0; i < x.length; i++) {
			grid[k+y[i]][k+x[i]] = -1;
		}
		for (int i = 0; i < 2 * k + 1; i++) {
			for (int j = 0; j < 2 * k + 1; j++) {
				System.out.print(grid[i][j]+"  ");
			}
			System.out.println();
		}
		return 0;
	}

//	public boolean check(int x, int y, int k){
//		if(k==0 && grid[K+y][K+x]==k) return true;
//		else if (grid[y][x]==k)
//			check(x-1, y)
//	}
}
