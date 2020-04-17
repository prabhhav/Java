package threadd;


public class TestName extends Thread {
    
 public void run(){  
   System.out.println("running...");  
  }  
 public static void main(String args[]){  
  TestName  t1=new TestName ();  
  TestName  t2=new TestName ();  
  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
   
  t1.start();  
  t2.start();  
  
  t1.setName("Sonoo Jaiswal");  
  System.out.println("After changing name of t1:"+t1.getName());  
 }  
}  
