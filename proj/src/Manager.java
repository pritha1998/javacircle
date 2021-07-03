import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public abstract class Employee1
{
String name;
int salary;
String address;
public Employee1(int sal,String nam,String add)
{
name=nam;
address=add;
salary=sal;
}
public abstract  void Display();

}
 public class Manager extends Employee1{

     Manager(int sal,String nam,String add)
{
super(sal,nam,add);
}
public void Display()
{
System.out.println("Salary of the Employee="+salary);
}
 
public void main(String[] args)throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(isr);
System.out.println("Enter the employee name and address");
String nam=br.readLine();
String add=br.readLine();
//Employee emp;
if(nam.equalsIgnoreCase(name) && add.equalsIgnoreCase(address)){
System.out.println("Info Granted");
Display();
}
else
{
System.out.println("Access Denied");
System.exit(0);
}
}
}

