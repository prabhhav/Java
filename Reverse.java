import java.util.Scanner;


public class Reverse {
    public static void main(String[] args){
        
        int sum = 0;
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter any no.");
                int n = sc.nextInt();
                        while (n!=0)
                        {
                            int rem = n % 10;
                                    sum = sum * 10 + rem;
                                    n = n/10;
                        }
                        
        System.out.println("Reverse " +sum);
    }
            
}