import java.util.*;

//SRM522
public class PointErasingTwo {
	public int getMaximum(int[] y) {
        int max = -1;
        for (int i=0;i<y.length;i++){
            for(int j=0;j<y.length;j++){
                int temp = 0;
                if(i==j) continue;
                int y1 = y[i];
                int y2 = y[j];
                int index = Math.abs(i-j)-1;
                while(index!=0){
                    int startIndex = Math.min(i,j);
                    if (y[startIndex+index]>y1&&y[startIndex+index]<y2||
                            y[startIndex+index]<y1&&y[startIndex+index]>y2) temp++;
                    index--;
                }
                if(temp>max) max = temp;
            }
        }
        return max;
	}
}
