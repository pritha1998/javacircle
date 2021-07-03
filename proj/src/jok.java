
public class jok {
public static void main(String args[]) {
String strOrig = "Hello world ,Hello Reader";
int c = 0;
int lastIndex = strOrig.lastIndexOf("Hello");
char[] chars = strOrig.toCharArray();
for(int i=0;i<chars.length;i++)
{
	System.out.println(chars[i]);
	
}
System.out.println("arra=="+chars);
 int len = strOrig.length();
char[] rev = new char[len];
for (int i=len-1,j=0 ; (i>=0 & j<len) ; i--,j++) {
	rev[j] = strOrig.charAt(i);

}
System.out.println(rev);


for(int i=0;i<chars.length;i++)
{
	for(int j=0;j<chars.length;j++)
	{
		if(chars[i]==chars[j])
		{
			c++;
		}
	}
	if(c>1)
	   System.out.println("dup "+chars[i]+" = "+c);
	
	c=0;
}

//strOrig.Reverse();
if(lastIndex == - 1){
System.out.println("Hello not found");
} else {
System.out.println("Last occurrence of Hello is at index "+ lastIndex);
}
}
}