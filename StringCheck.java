/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;


public class StringCheck {
 
public static void main(String args[])
{
String s1="Ranjeet";
String s2="Ranjeet";
String s3=new String("Ranjeet");
String s4=new String("Ranjeet");

System.out.println("Result ="+s1.equals(s2));
System.out.println("Result ="+s1.equals(s3));
System.out.println("Result ="+(s1==s2));
System.out.println("Result="+(s3==s4));
}
}




