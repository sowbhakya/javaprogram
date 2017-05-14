import java.io.*;
public class prog12
{
public static void main(String args[]) throws IOException
{
int a,n,i,m;
System.out.println("Enter any number");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
a=Integer.parseInt(br.readLine());
System.out.println("Enter power of a number");
BufferedReader bar=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(bar.readLine());
m=1;
for(i=1; i<=n; i++)
{
m=m*a;
}
System.out.println(+m);
}
}
