package thousand;
 class abc3
    {
        
        public void apple(int a){
        System.out.println("Value of a " +a);
    }
        public void apple(int a,int b){
        System.out.println("Value of a " +a+"Value of b ="+b);
         
    }
    }
       class xyz3 extends abc3
    { 
       
       
         public void banana(int a ){
        System.out.println("Value of a " +a);
    }
         public void banana(int a,int b ){
        System.out.println("Value of a " +a+"Value of b ="+b);
       
    }
    }

public class Overloading {
    
   public static void main(String args[])
   {
       xyz3 d=new xyz3();
       d.apple(1);
       d.apple(1,2);
      d.banana(4);
      d.banana(4,5);
       
   }
    

}
    

