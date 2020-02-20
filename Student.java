import java.util.Scanner;

public class Student {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        float num;
        num = num/6; 
        if(num>=80)
        {
            System.out.print("A");
        }
        else if(num>=60 && num<80)
        {
           System.out.print("B");
        } 
        else if(num>=40 && num<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
