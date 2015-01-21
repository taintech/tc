import java.util.*;

public class TheGridDivTwo {

	private static final int LIMIT = 1000;
	private static final int n = 2*LIMIT+1;
	boolean[][] grid = new boolean[n][n];
	
	public int find(int[] x, int[] y, int k) {
		markAsVisited(x,y);
		int max = 0;
		Point origin = new Point(LIMIT, LIMIT);
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(origin);
		Point current;
		Collection<Point> agg;
		for (int i = 0; i <= k; i++) {
			agg = new ArrayList<Point>();
			while ((current=queue.poll())!=null){
				if(max<current.getX()) max = current.getX();
				if(i!=k) agg.addAll(current.nextPoints());
			}
			queue.addAll(agg);
		}
		return max;
	}

	private void markAsVisited(int[] xs, int[] ys){
		int n = xs.length;
		for (int i = 0; i < n; i++) {
			grid[LIMIT+xs[i]][LIMIT+ys[i]] = true;
		}
	}

	private void markAsVisited(int x, int y){
		grid[x][y] = true;
	}

	private boolean notVisited(int x, int y){
		return !grid[x][y];
	}

	private class Point{
		int x;
		int y;
		Point(int x, int y){
			this.x = x;
			this.y = y;
			markAsVisited(x,y);
		}

		Collection<Point> nextPoints(){
			List<Point> list = new ArrayList<Point>(4);
			if(notVisited(x + 1, y)) list.add(new Point(x+1,y));
			if(notVisited(x, y + 1)) list.add(new Point(x,y+1));
			if(notVisited(x - 1, y)) list.add(new Point(x-1,y));
			if(notVisited(x, y - 1)) list.add(new Point(x,y-1));
			return list;
		}

		public int getX() {
			return x-LIMIT;
		}
	}

}
