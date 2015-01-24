import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Target {
	
	public String[] draw(int n) {
		int o = n/2;
		char[][] grid = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int x = Math.abs(i-o);
				int y = Math.abs(j-o);
				if(Math.max(x,y)%2==0) grid[i][j] = '#';
				else grid[i][j] = ' ';
			}
		}
		String[] res = new String[n];
		for (int i = 0; i < n; i++) {
			res[i] = String.valueOf(grid[i]);
		}
		return res;
	}
}
