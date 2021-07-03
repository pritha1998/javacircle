import java.util.Scanner;

public class out
{
  public static void main(String args[])
  {
    int marks[] = { 40, 50, 60 };
    System.out.println("Hello 1");
    int size=marks.length;
    try
    {
    	Scanner s=new Scanner(System.in);
      System.out.println("enter which ele");
      
     int m=s.nextInt();
     int m1=marks[m];
     System.out.println("ans--"+marks[m]);
      
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
     // System.out.println("Do not cross size of array ."  + e.getMessage() );
    	System.out.println("EXCEPTION"  + e.getMessage() );
    	
    }
    System.out.println("PROGRAM CONTINUES");
   // System.out.println("Hello 3");
  }
}  
