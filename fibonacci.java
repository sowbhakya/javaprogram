import java.io.*;
public class prog14
{
public static void main(String args[]) throws IOException
{
int f1=0,f2=1,f3,i,n;
System.out.println("enter the range of fibonacci series:");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
System.out.println("Fibonacci series");
System.out.println(+f1);
System.out.println(+f2);
for(i=0; i<n; i++)
{
f3=f1+f2;
f1=f2;
f2=f3;
System.out.println(+f3);
}
}
}
