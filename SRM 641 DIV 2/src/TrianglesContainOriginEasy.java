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
		Point o = new Point(0,0);
		boolean flag1 = side(a,b,o)*side(a,b,c)>0;
		boolean flag2 = side(a,c,o)*side(a,c,b)>0;
		boolean flag3 = side(b,c,o)*side(b,c,a)>0;
		return flag1&&flag2&&flag3;
	}

	int side(Point a, Point b, Point c){
		return (c.x-a.x)*(b.y-a.y)-(c.y-a.y)*(b.x-a.x);
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
