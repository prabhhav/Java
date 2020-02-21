package basic;
import java.util.Scanner;
 class Simple {
    int a,b; 
    Scanner sc = new Scanner(System.in);
    public void input()
    {
         System.out.println("enter two number");
        a = sc.nextInt();
         b = sc.nextInt();
         if ((a>0)&&(b>0))
         {
               int c = a+b;
       System.out.print("Sum "+c);
         }
        else 
         {
       System.out.print("error error");
         }   
    }
}
     public  class Addition 
       { public static void main(String[] args) {
           Simple eg = new Simple();
           eg.input();
        
   
    }
}