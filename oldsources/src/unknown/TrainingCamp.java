package unknown;

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/26/11
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class TrainingCamp {
    public static void main(String[] args){
        String[] att = {"XXX","XXX","XX-"};
        String[] pr = {"---","XXX","-XX","XX-"};
        for(String p: determineSolvers(att,pr)) System.out.println(p);
    }
    public static String[] determineSolvers(String[] atts, String[] problems){
        int n = atts.length;
        int m = atts[0].length();
        int k = problems.length;
        String[] res = new String[n];
        for(int i=0;i<n;i++){
            res[i]="";
        }
        String temp="";
        boolean b = true;
        for(int i=0;i<n;i++){
            temp="";
            for(int j=0;j<k;j++){
                b=true;
                for(int z=0;z<m;z++){
                    if(problems[j].charAt(z)=='X'&&atts[i].charAt(z)=='-') b=false;
                }
                if(b) temp+="X";
                else temp+="-";
            }
            res[i] = temp;
        }
        return res;
    }
}
