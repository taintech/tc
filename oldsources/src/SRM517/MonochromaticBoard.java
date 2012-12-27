package SRM517;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class MonochromaticBoard {

    static String[] board;

    public static void main(String[] args){
        String[] stringArray = {"WBWBW",
 "BBBBB",
 "WBWBW",
 "WBWBW"};
        System.out.println(theMin(stringArray));
    }
    public static int theMin(String[] xboard){
        board = xboard;
        int res = 0;
        for (int i=0;i<board.length;i++){
            String line = board[i];
            for(int j=0;j<board[0].length();j++){

            }
        }
        return res;
    }
    public static void makeRow(int row){
        String line = null;
        String temp = null;
        for (int i=0;i<board.length;i++){
            line =  board[i];
            temp = "";
            for(int j=0;j<board[0].length();j++){
                if(i==row) temp += 'W';
                else temp += line.charAt(j);
            }
            board[i] = temp;
        }
    }
    public static void makeCol(int col){
        String line = null;
        String temp = null;
        for (int i=0;i<board.length;i++){
            line =  board[i];
            temp = "";
            for(int j=0;j<board[0].length();j++){
                if(j==col) temp += 'W';
                else temp += line.charAt(j);
            }
            board[i] = temp;
        }
    }
    public static boolean utility(int[] ar){
        return true;
    }
}
