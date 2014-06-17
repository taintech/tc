import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BuildingHeightsEasy {

    int[] heights;
	
	public int minimum(int M, int[] heights) {
        this.heights = heights;
		int n = heights.length;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = floors(heights[i], heights[j]);
            }
        }
        int min = 51;
        for (int i = 0; i < n; i++) {
            int[] ref = matrix[i];
            Arrays.sort(ref);
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum+=ref[j];
            }
            if(sum<min) min=sum;
        }
        return min;
    }

    private int floors(int target, int x){
        if(target<x) return 51;
        else return target-x;
    }
}
