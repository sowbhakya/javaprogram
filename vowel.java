import java.io.*;
public class prog3
{
public static void main(String args[]) throws IOException
{
char n;
System.out.println("Enter any alphabet:");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=(char)br.read();
switch(n)
{
case 'a':
System.out.println("The alphabet is vowel");
break;

case 'e':
System.out.println("The alphabet is vowel");
break;

case 'i':
System.out.println("The alphabet is vowel");
break;

case 'o':
System.out.println("The alphabet is vowel");
break;

case 'u':
System.out.println("The alphabet is vowel");
break;

default:
System.out.println("The alphabet is consonant");
break;
}
}
}
