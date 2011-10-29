import java.util.*;

//SRM520
//TODO
public class SRMCodingPhase {
	public int countScore(int[] points, int[] skills, int luck) {
        int[][] matrix = {{1,2,3},{2,3,1},{3,2,1},{3,1,2},{2,1,3},{1,3,2}};
        int[] ar = new int[3];
        int max = Integer.MIN_VALUE;
        int[] ss = skills.clone();
        //permutations
        for(int i=0;i<6;i++){
            ar = matrix[i];
            //luck
            for(int j=0;j<3;j++){
                //iterate
                int time = 0;
                int pointSum = 0;
                for(int k=0;k<3;k++){
                    int n = ar[k];
                    int t = skills[n-1] - ((k==j)?luck:0);
                    if(t<0){
                        t=0;
                        System.out.println();
                    }
                    time+=t;
                    if(time>75) break;
                    int point = points[n-1] - ((int)Math.pow(2,n))*t;
                    pointSum+=point;
                }
                if(pointSum==1736){
                    System.out.println();
                }
                if(pointSum>max) max = pointSum;
            }
        }
        return max;
	}
}
