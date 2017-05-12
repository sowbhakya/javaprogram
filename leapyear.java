import java.io.*;
public class prog7
{
public static void main(String arg[]) throws IOException
{
int n;
System.out.println("Enter any year");
BufferedReader bbbr= new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(bbbr.readLine());
if(n%4==0)
{
System.out.println(n+ " is a leap year");
}
else if(n%100==0)
{
System.out.println(n+ " is a leap year");
}
else if(n%400==0)
{
System.out.println(n+ " is a leap year");
}
else
{
System.out.println(n+ " is not a leap year");
}
}
}
