import java.io.*;
public class prog8
{
public static void main(String args[]) throws IOException
{
int n,m,j;
System.out.println("Enter the  number:");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
m=0;
for(j=0; j<=n; j++)
{
m=m+j;
}
System.out.println("The sum of n  number is:"+m);
}
}
