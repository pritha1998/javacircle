import java.util.*;
class student
{
	final int roll;
	student(int rnum)
	{
		roll=rnum;
	}
	
	static void mymethod(student[] studentarray)
	{
		for(int i=0; i<studentarray.length;i++)
		{
			System.out.println("st"+i+" :roll"+studentarray[i].roll);
		}
	}
}

public class Studentdemo {

	public static void main(String args[])
	{
		System.out.println("enter no. of students");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		student[] studentarray = new student[n];
		for(int j=0;j<n;j++)
		{
			System.out.println("enter the roll of st"+j);
			int r=s.nextInt();
			studentarray[j]=new student(r);
			
		}
		 student.mymethod(studentarray);
		
	}
}
