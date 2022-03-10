package DataTypes;

public class Point {
	public int x;
	public int y;
	public double dis;
	Point(int x, int y){
		this.x = x;
		this.y = y;
		dis = Math.sqrt(x*x + y*y);
	}
	int X() { return x; }
	int Y() { return y; }
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}

}
