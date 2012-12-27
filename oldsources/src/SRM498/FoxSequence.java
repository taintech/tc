package SRM498;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
//todo
public class FoxSequence {
    public static void main(String[] args){
        String[] stringArray = {};
        int[] intArray = {1,3,5,7,5,3,1,1,1,3,5,7,5,3,1};
        for(int i: isValid(intArray)) System.out.print(i+" ");
//        for(String s: getMaximumPoints("")) System.out.print(s+" ");
        System.out.println("YES");
        int [] intArray1 = {1,2,3,4,5,4,3,2,2,2,3,4,5,6,4};
        for(int i: isValid(intArray1)) System.out.print(i+" ");
        System.out.println("YES");
        int [] intArray2 = {3,6,9,1,9,5,1};
        for(int i: isValid(intArray2)) System.out.print(i+" ");
        System.out.println("YES");
        int[] intArray3 = {1,2,3,2,1,2,3,2,1,2,3,2,1};
        for(int i: isValid(intArray3)) System.out.print(i+" ");
        System.out.println("NO");
        int [] intArray4 = {1,3,4,3,1,1,1,1,3,4,3,1};
        for(int i: isValid(intArray4)) System.out.print(i+" ");
        System.out.println("NO");
        int [] intArray5 = {6,1,6};
        for(int i: isValid(intArray5)) System.out.print(i+" ");
        System.out.println("NO");

    }
    public static int[] isValid(int[] s){
        int[] ar = toDif(s);
        int l = ar.length;
        int total = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i=0;i<l;i++){
             if(a==0){
                 if (ar[i]>0) a=0;
                 else a = i;
             }else if (b==0){
                 if(ar[i]<0) b=0;
                 else b=i;
             }else if (c==0){
                 total += ar[i];
                 if(total==0) c = i;
             }else if (d==0){
                 if (ar[i]>0) d=0;
                 else d = i;
             }
        }
        System.out.println(a + " "+b+" "+c+" "+d);
        return ar;
    }
    public static int[] toDif(int[] ar){
        int[] res = new int[ar.length-1];
        for (int i=1;i<ar.length;i++){
            res[i-1] = ar[i] - ar[i-1];
        }
        return res;
    }
    public static boolean utility1(int[] ar){
        return true;
    }
    public static boolean utility2(int[] ar){
        return true;
    }
}
