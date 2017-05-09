
import java.io.*;
public class prog2
{
public static void main(String args[])throws  IOException
{
int num;
System.out.println("Enter any number:");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
num=Integer.parseInt(br.readLine());
if(num%2==0)
{
System.out.println("The number is even");
}
else 
{
System.out.println("odd");
}
}
}
