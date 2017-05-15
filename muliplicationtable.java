import java.io.*;
public class prog16
{
public static void main(String args[]) throws IOException
{
int n,i,m,l;
System.out.println("enter the range of the table");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
System.out.println("enter any number");
BufferedReader rr=new BufferedReader(new InputStreamReader(System.in));
m=Integer.parseInt(rr.readLine());
l=1;
for(i=1; i<=n; i++)
{
l=m*i;
System.out.println(+m+"*"+i+"="+l);
}
}
}


