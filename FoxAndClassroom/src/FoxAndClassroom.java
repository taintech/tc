import java.util.*;

public class FoxAndClassroom {
	public String ableTo(int n, int m) {
        int g  = gcd(n,m);
		if(g!=1) return "Impossible";
		else return "Possible";
	}

    public int gcd(int n, int m){
        if(m==0) return  n;
        else return gcd(m, n%m);
    }
}
