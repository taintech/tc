import java.util.*;

public class TheArithmeticProgression {
	public double minimumChange(int a, int b, int c) {
        double r = (double)b - ((double)a+c)/2;
		return Math.abs(r);
	}
}
