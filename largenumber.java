import java.io.*;
public class prog4
{
public static void main(String arg[]) throws IOException
{
int a,b,c;
System.out.println("Enter three number:");
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
a=Integer.parseInt(br.readLine());
BufferedReader bbr= new BufferedReader(new InputStreamReader(System.in));
b=Integer.parseInt(bbr.readLine());
BufferedReader bbbr= new BufferedReader(new InputStreamReader(System.in));
c=Integer.parseInt(bbbr.readLine());
if(a>b && a>c)
{
System.out.println("The largest number is:"+a);
}
else if(b>a && b>c)
{
System.out.println("The largest number is:"+b);
}
else
{
System.out.println("The largest number is:"+c);
}
}
}
