import java.util.*;

public class RedAndGreen {
    String answer;
    String row;
	public int minPaints(String row) {
        this.row = row;
        String test = "";
        for (int i = 0; i<row.length();i++){
            test+="G";
        }
        int res = Dif(test);

        for (int i = 0; i<row.length();i++){
            answer = "";
            for (int j = i+1; j>0;j--){
                answer+="R";
            }
            for (int j = i+1; j<row.length();j++){
                answer+="G";
            }
            int temp = Dif(answer);
            if(temp<res) res = temp;
        }
        return res;
	}
    public int Dif(String answer){
        int res = 0;
        for(int i=0;i<row.length();i++){
            if(answer.charAt(i)!=row.charAt(i)) res++;
        }
        return res;
    }
}
