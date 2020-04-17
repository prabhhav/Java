/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadd;
class Simple extends Thread
{
    public void run()
    {
       int i;
        for(i=1; i<=10; i++)
        {
            System.out.println("Thread A= "+i);
        }
    }
}
class Simple2 extends Thread
{
    public void run()
    {
        int i;
        for(i=1; i<=10; i++)
        {
            System.out.println("Thread B="+i);
        }
    }
}
public class Threadd {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Simple s1 = new Simple();
        s1.start();
        Simple2 s2 = new Simple2();
        s2.start();
    }
    }
    

