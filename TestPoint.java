import java.util.Scanner;


public class TestPoint {
	public static void main (String[] arg){
		Scanner sc = new Scanner(System.in);
		Point p1 = new Point();
		Point p2 = new Point(sc.nextInt(),sc.nextInt());
		
		System.out.println("p1移动前的X坐标为"+p1.getX());
		System.out.println("p1移动前的Y坐标为"+p1.getY());
		System.out.println("p2移动前的X坐标为"+p2.getX());
		System.out.println("p2移动前的Y坐标为"+p2.getY());
		
		p1.movePoint(sc.nextInt(), sc.nextInt());
		p2.movePoint(sc.nextInt(), sc.nextInt());
		
		System.out.println("p1移动后的X坐标为"+p1.getX());
		System.out.println("p1移动后的Y坐标为"+p1.getY());
		System.out.println("p2移动后的X坐标为"+p2.getX());
		System.out.println("p2移动后的Y坐标为"+p2.getY());
		
		sc.close();
	}
}

class Point{
	private int x;
	private int y;
	public Point(){
		
	}
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void movePoint(int dx,int dy){
		x+=dx;
		y+=dy;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
