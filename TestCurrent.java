package threadd;


public class TestCurrent extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[]){
        TestCurrent t1 = new  TestCurrent();
         TestCurrent t2 = new  TestCurrent();
         
         t1.start();
         t2.start();
    }
}
