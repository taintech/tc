import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TrianglesContainOriginEasy {
	
	public int count(int[] x, int[] y) {
		int n = x.length;
		int count = 0;
		Point a;
		Point b;
		Point c;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int k = j+1; k < n; k++) {
					a = new Point(x[i], y[i]);
					b = new Point(x[j], y[j]);
					c = new Point(x[k], y[k]);
					if(isGood(a,b,c)) count++;
				}
			}
		}
		return count;
	}

	private double area(Point a, Point b, Point c){
		long ac = distance(a,c);
		long ab = distance(a,b);
		long bc = distance(b,c);
		double s = (double)(ac+ab+bc)/2;

		return Math.pow(s*(s-ab)*(s-bc)*(s-ac),1D/2D);
	}

	private boolean isGood(Point a, Point b, Point c){
		Point o = new Point(0,0);
		double a1 = area(a,o,b);
		double a2 = area(b,o,c);
		double a3 = area(a,o,c);
		double sum = area(a,b,c);
		System.out.println("WARN:"+(sum-(a1 + a2 + a3)));
		return sum == a1 + a2 + a3;
	}

	private long distance(Point a, Point b){
		long diffX = Math.abs(a.x-b.x);
		long diffY = Math.abs(a.y-b.y);
		return diffX*diffX+diffY*diffY;
	}

	private class Point{
		int x;
		int y;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		public boolean equals(Point other){
			return this.x==other.x&&this.y==other.y;
		}
		@Override
		public String toString(){
			return "("+x+", "+y+")";
		}
	}
}
