package unknown;

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/26/11
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class BirthdayReminders {
    public static void main(String[] args){
        String[] friendNames = {"John", "Jack", "Bill"};
        int[] birthDates = {50,100,150};
        int current = 500;
        String[] occ = {"birthday", "decimal birthday", "binary birthday"};
        int[] days = {365,1000,512};
        int z = 10;
        for(String a: calculateSpace(friendNames,birthDates,current,occ,days,z)) System.out.println(a);
    }
    public static String[] calculateSpace(String[] friendNames,int[] birthDates,
                                           int currentDate, String[] occasions, int[] days, int z ){
        String[] res = new String[z];
        int[][] ar = new int[friendNames.length][occasions.length];
        int count=0;
        StringBuilder sb;
        while(count<z){
            for(int k=0;k<days.length;k++){
                int day = days[k];
                for(int j=0;j<birthDates.length;j++){
                int birth = birthDates[j];
                    if ((currentDate-birth)%day==0){
                        int number = ++ar[j][k];
                        sb = new StringBuilder();
                        sb.append(currentDate);
                        sb.append(". ");
                        sb.append(friendNames[j]);
                        sb.append(" ");
                        sb.append(occasions[k]);
                        sb.append(" (");
                        sb.append(number);
                        sb.append(")");
                        res[count++] = sb.toString();
                    }
                }
            }
            currentDate++;
        }
        return res;
    }
}
