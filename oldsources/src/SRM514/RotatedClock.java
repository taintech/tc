package SRM514;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class RotatedClock {
    public static void main(String[] args){
        int h=70;
        int m=300;
        System.out.println(getEarliest(h,m));
        System.out.println("------------");
        h=90;
        m=120;
        System.out.println(getEarliest(h,m));
        System.out.println("------------");
        h=240;
        m=36;
        System.out.println(getEarliest(h,m));
        System.out.println("------------");
        h=19;
        m=19;
        System.out.println(getEarliest(h,m));
        System.out.println("------------");
        h=1;
        m=12;
        System.out.println(getEarliest(h,m));
    }
    public static String getEarliest(int hourHand,int minuteHand){
        //format HH:MM
        String time = "";
        int delta1 = Math.abs(hourHand-minuteHand);
        int delta2 = 360-delta1;
        for (int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                int m = j*6;
                if(m%12!=0) continue;
                int h = i*30+m/12;
                int d1 = Math.abs(h-m);
                int d2 = 360 - d1;
                if(d1==delta1||d1==delta2||d2==delta1||d2==delta2) System.out.println(i+" "+j);
            }
        }
        return time;
    }
    public static boolean utility(int[] ar){
        return true;
    }
}
