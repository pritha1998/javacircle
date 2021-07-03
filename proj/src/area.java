
public interface Shape {
	abstract void area();
}
class Circle implements Shape{
	int r = 5;
    double pi = 3.14, ar = 0;
    public void area()
    {
    	ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }
}
class Rect implements Shape{
	int r = 6;
	int b = 7;
	int ar =0;
    public void area()
    {
    	ar = r*b;
        System.out.println("Area of rectangle:"+ar);
    }
}
public class area {
	public static void main(String args[])
	{
		Shape g=new Circle();
		g.area();
		Shape c=new Rect();
		c.area();
	}

}
