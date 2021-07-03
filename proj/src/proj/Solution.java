package proj;
import java.util.*;
import java.lang.Math; ;

class Point{
	double x;
	double y;
	
	Point(double x, double y){
		this.x=x;
		this.y=y;
	    }
}
public class Solution {

	public static void main(String args[] ) throws Exception {
		
	
	Scanner sc = new Scanner(System.in);
	int x1 = sc.nextInt();
	int y1 = sc.nextInt();
	Point p1 = new Point(x1, y1);
	
	int x2 = sc.nextInt();
	int y2 = sc.nextInt();
	Point p2 = new Point(x2, y2);
	
	int x3 = sc.nextInt();
	int y3 = sc.nextInt();
	Point p3 = new Point(x3, y3);
	
	
	Point g =  meth(p1,p2,p3);
	System.out.println(g.x+" "+g.y);
	
	}
	
	
	public static Point meth(Point p1,Point p2,Point p3) {
		double dis1= Math.sqrt(p1.x*p1.x +p1.y*p1.y);
		double dis2= Math.sqrt(p2.x*p2.x +p2.y*p2.y);
		double dis3= Math.sqrt(p3.x*p3.x +p3.y*p3.y);
		
		double d=Math.max(Math.max(dis1,dis2),dis3);
		if(d==dis1)
			return(p1);
		if(d==dis2)
			return(p2);
		else
			return(p3);


		
	}
	
}

