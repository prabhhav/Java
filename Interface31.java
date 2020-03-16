package interface3;
import java.util.Scanner;
interface Person{
  void Rollno();
  void Name();
}
class Student31 implements Person{
    int w = 5;
    String abc = "Mayank";
    Scanner sc= new Scanner(System.in);
    
    public void Rollno()
    {   System.out.println("Enter roll no");
    int a= sc.nextInt();
       System.out.println("");
    }
     
     public void Name()
    {System.out.println("Enter name");
        String str= sc.next();
        System.out.println(""+str);
    }
}
class Faculty31 implements Person{
      public void Rollno()
    {
        System.out.println("35");
    }
    public void Name()
    {
        System.out.println("Raj sir");
    }
}
public class Interface31 {
    public static void main(String[] args)
    {
        Student31 q = new Student31();
        q.Rollno();
        q.Name();
        
        Faculty31 p = new Faculty31();
        p.Rollno();     
        p.Name();
          
    }
}
