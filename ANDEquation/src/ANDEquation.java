import java.util.*;

public class ANDEquation {
	public int restoreY(int[] A) {
        int y = -1;
        int yy;
        boolean flag = false;
        for(int i=0;i<A.length;i++){
            y = A[i];
            yy = -1;
            for(int j=0;j<A.length;j++){
                if(i!=j){
                    if(yy==-1){
                        yy = A[j];
                    }else{
                        yy = yy&A[j];
                    }
                }
            }
            if(y==yy){
                flag = true;
                break;
            }
        }
		return (flag)?y:-1;
	}
}
