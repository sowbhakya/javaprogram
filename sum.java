import java.io.*;
public class prog17
{
public static void main(String args[]) throws IOException
{
int n,i,l;
System.out.println("Enter any number");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
l=0;
for(i=1; i<=n; i++)
{
l=l+i;
}
System.out.println(+l);
}
}


