import java.io.*;
public class prog18
{
public static void main(String args[]) throws IOException
{
char n;
System.out.println("Enter any character");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=(char)br.read();
if(n>='a' && n<='z' || n>='A' && n<='Z')
{
System.out.println("The character "  +n+  " is a alphabet");
}
else
{
System.out.println("The character " +n+ " is not a alphabet");
}
}
}
