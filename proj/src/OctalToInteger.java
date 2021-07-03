import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctalToInteger {

	public static void main(String[] args) throws IOException {
		//InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
		String name=br.readLine();
		
		Integer i= Integer.parseInt(name, 8);
		
		System.out.println("octal="+i);
		
	}

}
