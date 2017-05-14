import java.io.*;
public class prog11
{
public static void main(String args[]) throws IOException
{
int n;
System.out.println("Enter any number");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
if(n%2==0)
{
System.out.println("The number is not a prime number");
}
else if(n%3==0)
{
System.out.println("The number is not a prime number");
}
else
{
System.out.println("The number is  a prime number");
}
}
}      
