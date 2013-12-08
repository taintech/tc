import java.nio.ByteBuffer;
import java.util.*;

public class LittleElephantAndDouble {
	public String getAnswer(int[] A) {
        Arrays.sort(A);
        for(int v :A){
            for(int i: A){
                int min = Math.min(i,v);
                int max = Math.max(i,v);
                if(!((max%min==0&&isPowerOf2(max/min))||i==1||i==v)){
                    return "NO";
                }
            }
        }
		return "YES";
	}

    public boolean isPowerOf2(int a){
        boolean flag = false;
        for(char c: Integer.toBinaryString(a).toCharArray()){
            if(c=='1'){
                if(flag) return false;
                flag = true;
            }

        }
        return flag;
    }
}
