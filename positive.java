
import java.io.*;
public class prog1
{
public static void main(String args[])throws  IOException
{
int num;
System.out.println("Enter any number:");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
num=Integer.parseInt(br.readLine());
if(num==0)
{
System.out.println("The number is zero");
}
else if(num<0)
{
System.out.println("Negative");
}
else
{
System.out.println("Positive");
}
}
}
