import java.io.*;
public class prog9
{
public static void main(String args[]) throws IOException
{
int num,m =20,n=40;
System.out.println("Print Odd Numbers in a given range" +m+ "to" +n);
for (num = m; num <= n; num++)
{
 if (num % 2 == 1)
System.out.println(+num);
}
}
}

         
