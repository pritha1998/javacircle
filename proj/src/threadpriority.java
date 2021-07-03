//import java.util.*;

class rect0 extends Thread
{
   public void run()
   {
	   int i=15,j=10;
	   System.out.println("area rect is"+(i*j));
   }
}
 class circle0 extends Thread
   {
      public void run()
      {
   	   int i=15;
   	   double pi =3.14;
   	   
   	   System.out.println("area circle is"+(pi*i*i));
      }
   }

 class square extends Thread
 {
    public void run()
    {
 	   int i=15;
 	   
 	   
 	   System.out.println("area square is"+(i*i));
    }
 }

public class threadpriority {

	public static void main(String args[])
	{
		rect0 t1=new rect0();
		square t2 = new square();
		circle0 t3 =new circle0();
		
		t1.setPriority(1);
		t2.setPriority(8);
		t3.setPriority(4);
		t3.start();
		t1.start();
		t2.start();
		
		int l=t1.getPriority();
		int p=t3.getPriority();
		
		System.out.println(" t1="+l);
		System.out.println(" t3="+p);
		
		
	}
}
