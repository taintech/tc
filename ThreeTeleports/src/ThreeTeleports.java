import java.util.*;

//SRM519
//TODO
public class ThreeTeleports {
	public int shortestDistance(int xMe, int yMe, int xHome, int yHome, String[] teleports) {
		int cleanTime = getTime(xMe,xHome,yMe,yHome);
        int[][] t = new int[3][4];
        StringTokenizer str;
        for(int i=0;i<3;i++){
            str = new StringTokenizer(teleports[i]);
            for(int j=0;j<4;j++){
                t[i][j] = Integer.parseInt(str.nextToken());
            }
        }
        int min = cleanTime;
        for(int i=0;i<3;i++){
            if(t[i][0]==-1) continue;
            int temp;
            if((temp = getTime(xMe,t[i][0],yMe,t[i][1]))<cleanTime){
                temp = temp + 10 + getTime(xHome,t[i][2],yHome,t[i][3]);
                if(temp<min) min = temp;
            }
            if((temp = getTime(xMe,t[i][2],yMe,t[i][3]))<cleanTime){
                temp = temp + 10 + getTime(xHome,t[i][0],yHome,t[i][1]);
                if(temp<min) min = temp;
            }
        }
        return min;
	}
    public void swap(int[] ar, int e1, int e2){
        int temp = ar[e1];
        ar[e1] = ar[e2];
        ar[e2] = temp;
    }
    public int getTime(int[] ar){
        return getTime(ar[0],ar[2],ar[1],ar[3]);
    }
    public int getTime(int x1,int x2, int y1, int y2){
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }
}
