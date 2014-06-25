import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TwoWaysSorting {

    String LEX = "lexicographically";
    String LENGTH = "lengths";
    String BOTH = "both";
    String NONE = "none";

	public String sortingMethod(String[] stringList) {
        int n = stringList.length;
        String[] tmp = Arrays.copyOf(stringList, n);
        Arrays.sort(tmp);
        int previousSize = 0;
        boolean lengthFlag = true;
        boolean lexiFlag = true;
        int i = 0;
        for(String e: stringList){
            int currentSize = e.length();
            if(currentSize<previousSize) lengthFlag = false;
            previousSize = currentSize;
            if(!tmp[i++].equals(e)) lexiFlag = false;
        }
        if(lexiFlag&&lengthFlag) return BOTH;
        else if(lexiFlag) return LEX;
        else if(lengthFlag) return LENGTH;
        else return NONE;
	}
}
