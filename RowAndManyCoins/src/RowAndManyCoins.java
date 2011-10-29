import java.util.*;

//SRM522
public class RowAndManyCoins {
	public String getWinner(String cells) {
        int aCount = 0;
        int bCount = 0;
        char last = 'c';
        for (char c: cells.toCharArray()){
            if(c=='A'&&last!='A') aCount++;
            if(c=='B'&&last!='B') bCount++;
            last = c;
        }
        return (aCount>=bCount)?"Alice":"Bob";
	}
}
