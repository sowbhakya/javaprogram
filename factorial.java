import java.io.*;
public class prog15
{
public static void main(String args[]) throws IOException
{
int n,i,m;
System.out.println("enter any number");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
m=1;
for(i=1; i<=n; i++)
{
m=m*i;
}
System.out.println("Factorial of a number is:"+m);
}
}



