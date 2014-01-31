import java.util.*;

public class FoxAndGomoku {
	public String win(String[] board) {
        return (checkHorizontally(board)||checkVertically(board)||checkDiagonal(board)||checkInverseDiagonal(board))?"found":"not found";
	}

    private boolean checkDiagonal(String[] board){
        int h = board.length;
        int w = board[0].length();
        for(int i=0;i<h;i++){
            String s = board[i];
            for(int j=0;j<w;j++){
                if(s.charAt(j)=='o'&&j+4<w&&i+4<h&&board[i+1].charAt(j+1)=='o'&&
                        board[i+2].charAt(j+2)=='o'&&board[i+3].charAt(j+3)=='o'&&board[i+4].charAt(j+4)=='o')
                    return true;
            }
        }
        return false;
    }

    private boolean checkInverseDiagonal(String[] board){
        int h = board.length;
        int w = board[0].length();
        for(int i=0;i<h;i++){
            String s = board[i];
            for(int j=0;j<w;j++){
                if(s.charAt(j)=='o'&&j-4>=0&&i+4<h&&board[i+1].charAt(j-1)=='o'&&
                        board[i+2].charAt(j-2)=='o'&&board[i+3].charAt(j-3)=='o'&&board[i+4].charAt(j-4)=='o')
                    return true;
            }
        }
        return false;
    }

    private boolean checkVertically(String[] board){
        for(String s: board){
            if (s.contains("ooooo")) return true;
        }
        return false;
    }

    private boolean checkHorizontally(String[] board){
        return checkVertically(rotate(board));
    }

    private String[] rotate(String[] board){
        int h = board.length;
        int w = board[0].length();
        String[] newBoard = new String[w];
        for(int i=0;i<w;i++){
            newBoard[i] = "";
        }

        for(int i=0;i<h;i++){
            String s = board[i];
            for(int j=0;j<w;j++){
                newBoard[j] +=  s.charAt(j);
            }
        }
        return newBoard;
    }
}
