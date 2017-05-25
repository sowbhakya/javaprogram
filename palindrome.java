import java.io.*;
public class prog20
{
public static void main(String args[]) throws IOException
{
int num,temp,i,reverse=0,m;
System.out.println("enter any number");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
num=Integer.parseInt(br.readLine());
temp=num;
while(num!=0)
{
m=num%10;
reverse=m+(reverse*10);
num=num/10;
}
if(reverse==temp)
{
System.out.println("the number is palindrome");
}
else
{
System.out.println("the number is not  a palindrome");
}
}
}
