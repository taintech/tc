import java.util.*;

public class RedAndGreen {
    String answer;
    String row;
	public int minPaints(String row) {
        if(row.equals("R")) return 0;
        if(row.equals("G")) return 0;
        this.row = row;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i<row.length();i++){
            answer = "";
            for (int j = i; j>0;j--){
                answer+="R";
            }
            for (int j = i; j<row.length();j++){
                answer+="G";
            }
            int temp = Dif();
            if(temp<res) res = temp;
        }
        return res;
	}
    public int Dif(){
        int res = 0;
        for(int i=0;i<row.length();i++){
            if(answer.charAt(i)!=row.charAt(i)) res++;
        }
        return res;
    }
}
