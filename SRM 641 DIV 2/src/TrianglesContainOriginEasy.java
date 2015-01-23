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

	public boolean isGood(Point a, Point b, Point c){
		return (((0 - a.x)*(b.y-a.y)-(0-a.y)*(b.x-a.x))*((c.x - a.x)*(b.y-a.y)-(c.y-a.y)*(b.x-a.x)) >= 0) &&
				(((0 - b.x)*(c.y-b.y)-(0-b.y)*(c.x-b.x))*((a.x - b.x)*(c.y-b.y)-(a.y-b.y)*(c.x-b.x)) >= 0) &&
				(((0 - c.x)*(a.y-c.y)-(0-c.y)*(a.x-c.x))*((b.x - c.x)*(a.y-c.y)-(b.y-c.y)*(a.x-c.x)) >= 0 );
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
