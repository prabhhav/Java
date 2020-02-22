import java.util.Scanner;
class Cal
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in); // we have to take input from user 
        
        System.out.println("Enter First No");
         int no1 = S.nextInt(); // taking input from user
         System.out.println("Enter Second No");
         
         int no2 = S.nextInt();
         System.out.println("Select Symbol(+,-,*,/)");
         
         String sys = S.next();
         int res;
         switch(sys)
         {
             case "+": res = no1 + no2;
                 System.out.println("Addition is:" +res);
                 break; 
             case "-": res = no1 - no2;
                 System.out.println("Subtraction is:" +res);
                 break; 
              case "*": res = no1 * no2;
                 System.out.println("Multiplication is:" +res);
                 break; 
              case "/": res = no1 / no2;
                 System.out.println("Division is:" +res);
                 break; 
              default : System.out.println("Invalid Symbol");
                          break;
                 
         }     
         }
         
    }
     
     
     
     
     
     
     
     
