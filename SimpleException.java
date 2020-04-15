
package exception;
   
import java.util.Scanner;
class SimpleException
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the value of a and b");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("This is a my first Line");
try
{
System.out.println("Result ="+a/b);
}
catch(ArithmeticException e)
{
System.out.println("Exception is"+e.getMessage()); 
}//Exception(Message) System generated(User)
System.out.println("This is my last Line");
}
}
