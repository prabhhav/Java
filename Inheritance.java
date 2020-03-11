package thousand;
    class abc
    {
        int a = 5;
        int b = 6; 
        public void apple(){
        System.out.println("Value of a " +a);
    }
    }
    
    
    class xyz extends abc
    { 
        int a = 5;
        int b = 6; 
        public void banana(){
        System.out.println("Value of b " +b);
    }
    }
    
   public class Inheritance {
   public static void main(String args[])
   {
       xyz d=new xyz();
       d.apple();
       d.banana();
   }
    

}
