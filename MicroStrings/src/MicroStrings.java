import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MicroStrings {
	
	public static String makeMicroString(int A, int D) {
        int temp = A;
        StringBuilder sb = new StringBuilder();
		while(temp >= 0){
            sb.append(temp);
            temp = temp - D;
        }
        return sb.toString();
	}

    public static void main(String[] args){
        System.out.println(makeMicroString(30,6));
    }
}
