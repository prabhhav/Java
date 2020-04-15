package exception;

class Thread1 implements Runnable
{
public void run()
{
    int i;
    for(i=1; i<=10; i++)
    {
        System.out.println("Thread A = "+i);
    }
}
}
class Thread2 implements Runnable
{
    public void run()
{
    int i;
    for(i=1; i<=10; i++)
    {
        System.out.println("Thread B = "+i);
    }
}
}
      public class Game1 {
     public static void main(String[] args) {
       Thread t1 = new Thread(new Thread1());
       Thread t2 = new Thread(new Thread2());
       
       t1.start();
       t2.start();
    }
}