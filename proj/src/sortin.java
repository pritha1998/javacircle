import java.util.Scanner;
public class sortin {

	public static void main(String args[])
	{
		int count=5;
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        
        //User is entering the strings and they are stored in an array
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        for(int i=0;i<5;i++)
        {
        	for(int j=i+1;j<5;j++)
        	{
        		if(str[i].compareTo(str[j])>0)
        		{
        			String temp=str[i];
        			str[i]=str[j];
        			str[j]=temp;
        			
        		}
        		
        	}
        }
        for(int i = 0; i < count; i++)
        {
            System.out.println(""+str[i]);
        }
        System.out.println(str);

	}
}
